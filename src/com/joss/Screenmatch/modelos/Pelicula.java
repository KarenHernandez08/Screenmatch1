package com.joss.Screenmatch.modelos;

import com.joss.Screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;


    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public int getClasificacion() {
        return (int) (calculaMedia()/2);
    }

    /*hacer un tostring
    *super = hace referencia a un método de la clase madre
    *
    * */
    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";
    }
}