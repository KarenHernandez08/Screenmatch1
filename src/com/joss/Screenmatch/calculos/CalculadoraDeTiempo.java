package com.joss.Screenmatch.calculos;

import com.joss.Screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    //Recibir un parametro de tipo object
    public void  incluye (Titulo titulo){
        System.out.println("La duración de minutos es " +  titulo);
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
