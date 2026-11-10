package com.mycompany.ejercicio04java;

import java.util.Random;

public class Ejercicio04Java {

    public static void main(String[] args) {

        Random generador = new Random();
        int numeroGenerado = generador.nextInt(7) + 1;
        String diaSemana;

        switch (numeroGenerado) {

            case 1:
                diaSemana = "lunes";
                break;

            case 2:
                diaSemana = "martes";
                break;

            case 3:
                diaSemana = "miércoles";
                break;

            case 4:
                diaSemana = "jueves";
                break;

            case 5:
                diaSemana = "viernes";
                break;

            case 6:
                diaSemana = "sábado";
                break;

            case 7:
                diaSemana = "domingo";
                break;

            default:
                diaSemana = "Día no válido";
                break;
        }

        System.out.println("Número generado: " + numeroGenerado);
        System.out.println("Día correspondiente: " + diaSemana);
    }
}
