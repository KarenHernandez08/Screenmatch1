package com.joss.Screenmatch.principal;

import com.joss.Screenmatch.calculos.CalculadoraDeTiempo;
import com.joss.Screenmatch.calculos.Clasificacion;
import com.joss.Screenmatch.calculos.FiltroRecomendacion;
import com.joss.Screenmatch.modelos.Episodio;
import com.joss.Screenmatch.modelos.Pelicula;
import com.joss.Screenmatch.modelos.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //Constructor : reservar un espacio en la memoria para colocar atributos
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Series casaDragon = new Series("La casa del dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998  );
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones " +calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra((Clasificacion) miPelicula);

        Episodio episodio= new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa del dragon 1");
        episodio.setSeries(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        //var es igual que poner Pelicula
        var peliculaBruno = new Pelicula("Bruno", 2022);
        peliculaBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaBruno);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        //Da el primero de la lista y el nombre de la pelicula
        System.out.println("La primera pelicula es " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);
        System.out.println(listaDePeliculas.get(0).toString());

    }

}


/*Arrays
* Las listas en java simplifican el manejo y almacenamiento
* de datos ofreciendo flecibilidad y eficiencia
*
* ArrayList< Adentro los objetos>

* Se pueden sobreescribir todos los metodos de objet
*
*
* Api: Es una interfaz de programación de aplicaciones que nos
* permite interactuar con servicios web y obtener datos de manera
* estructurada
*
* Metodos HTTP
* GET POST PUT DELETE
*
*
*
* */

