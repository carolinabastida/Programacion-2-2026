package com.mycompany.ejercicio02java;

public class Ejercicio02Java {

    public static void main(String[] args) {
        int m = (int) (Math.random() * 20) + 1;
        int suma = 0;

        System.out.println("Número generado: " + m);

        for (int i = 1; i <= m; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los números enteros entre 1 y "
                + m + " es: " + suma);
    }
}