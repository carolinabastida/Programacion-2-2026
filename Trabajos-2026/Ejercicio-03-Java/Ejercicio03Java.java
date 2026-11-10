package com.mycompany.ejercicio03java;

public class Ejercicio03Java {

    public static void main(String[] args) {
        int sumaImpares = 0;

        while (sumaImpares <= 25) {
            int numero = (int) (Math.random() * 11);

            if (numero % 2 == 0) {
                System.out.println("Número generado: " + numero + " - Es par");
            } else {
                System.out.println("Número generado: " + numero + " - Es impar");
                sumaImpares = sumaImpares + numero;
            }
        }

        System.out.println();
        System.out.println("La suma de los números impares es: " + sumaImpares);
        System.out.println("La suma superó el valor 25. El proceso ha finalizado.");
    }
}