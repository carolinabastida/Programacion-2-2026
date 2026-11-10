package com.mycompany.ejercicio05java;
public class Ejercicio05Java  {

    public static void main(String[] args) {

        String texto = "PROGRAMACION JAVA";
        int contadorVocales = 0;

        for (int i = 0; i < texto.length(); i++) {

            char caracter = Character.toLowerCase(texto.charAt(i));

            if (caracter == 'a' || caracter == 'e'
                    || caracter == 'i' || caracter == 'o'
                    || caracter == 'u') {

                contadorVocales++;
            }
        }

        System.out.println("Texto analizado: " + texto);
        System.out.println("Cantidad de caracteres: " + texto.length());
        System.out.println("Cantidad de vocales: " + contadorVocales);
    }
}