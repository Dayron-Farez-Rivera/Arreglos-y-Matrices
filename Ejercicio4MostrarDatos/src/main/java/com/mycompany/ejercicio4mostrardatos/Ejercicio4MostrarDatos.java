package com.mycompany.ejercicio4mostrardatos;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class Ejercicio4MostrarDatos {

    public static void mostrarDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        mostrarDatos(nombre, edad);
    }
}
