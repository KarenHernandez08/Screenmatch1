package com.joss.Screenmatch.principal;
import com.joss.Screenmatch.modelos.Pelicula;
import com.joss.Screenmatch.modelos.Series;
import com.joss.Screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        miPelicula.evalua(10);
        var peliculaBruno = new Pelicula("Bruno", 2022);
        peliculaBruno.evalua(6);
        Series casaDragon = new Series("La casa del dragon", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaBruno);
        lista.add(casaDragon);

        for (Titulo item:lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2){
                System.out.println(pelicula.getClasificacion());

            }
        }

        ArrayList <String>listaDeArtistas =new ArrayList<>();
        listaDeArtistas.add("Harry Styles");
        listaDeArtistas.add("Cazzu");
        listaDeArtistas.add("The warning");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada por orden alfabetico " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por Fecha " + lista);




    }
}


/*
* ArrayList
* LinkedList
* Vector
* Stack
*
*
* Map
* HashMap
* */
