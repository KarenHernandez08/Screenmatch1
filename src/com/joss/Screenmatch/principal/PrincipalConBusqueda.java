package com.joss.Screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.joss.Screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.joss.Screenmatch.modelos.Titulo;
import com.joss.Screenmatch.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de la pelicula: ");
        var busqueda = lectura.nextLine();

        String direccion = "https://www.omdbapi.com/?t=" +
                busqueda.replace(" ", "+") +
                "&apikey=2825d5cb";
        try{
            // Cliente- Servidor
            HttpClient client = HttpClient.newHttpClient();
            // Lo que nosotros queremos obtener
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            //Titulo miTitulo = gson.fromJson(json, Titulo.class);
            TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println("Titulo: " + miTituloOmdb);

            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println("Titulo ya convertido "+miTitulo);

        } catch (NumberFormatException e){
            System.out.println("Ocurrió un error: ");
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Error en la URI, verifique la dirección.");
        }catch (ErrorEnConversionDeDuracionException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Finalizo la ejecución del programa");
    }
}

/*
 * Gson se descargo de mvn repository
 *
 *
 * */
