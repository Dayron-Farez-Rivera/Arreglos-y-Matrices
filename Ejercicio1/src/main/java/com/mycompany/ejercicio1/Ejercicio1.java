package com.mycompany.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        String carrera;
        int edad;
        double estatura;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese su carrera: ");
        carrera = sc.nextLine();

        System.out.print("Ingrese su estatura: ");
        estatura = sc.nextDouble();

        System.out.println();
        System.out.println("DATOS INGRESADOS");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura);

    }

}
