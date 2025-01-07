package com.joss.Screenmatch.modelos;

import com.joss.Screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private int numero;

    private String nombre;

    private Series series;

    private int totalVisualizaciones;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    @Override
    public int getClasificacion() {
        if (totalVisualizaciones > 100){
            return 4;
        }else{
            return 2;
        }

    }
}

