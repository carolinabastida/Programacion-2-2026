package com.mycompany.distribucionestudiantes;

import java.util.Scanner;

public class DistribucionEstudiantes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total de estudiantes: ");
        int totalEstudiantes = teclado.nextInt();

        System.out.print("Ingrese la cantidad de estudiantes por equipo: ");
        int estudiantesPorEquipo = teclado.nextInt();

        int equiposCompletos = totalEstudiantes / estudiantesPorEquipo;
        int estudiantesSobrantes = totalEstudiantes % estudiantesPorEquipo;

        System.out.println();
        System.out.println("Cantidad total de estudiantes: " + totalEstudiantes);
        System.out.println("Estudiantes por equipo: " + estudiantesPorEquipo);
        System.out.println("Se pueden formar " + equiposCompletos + " equipos completos.");
        System.out.println("Quedan " + estudiantesSobrantes
                + " estudiantes sin integrar un equipo completo.");

        teclado.close();
    }
}