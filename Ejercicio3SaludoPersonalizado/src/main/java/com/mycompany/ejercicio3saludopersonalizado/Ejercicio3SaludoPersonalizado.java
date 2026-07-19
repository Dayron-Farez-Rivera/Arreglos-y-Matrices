package com.mycompany.ejercicio3saludopersonalizado;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class Ejercicio3SaludoPersonalizado {

    public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre + ".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        saludar(nombre);
    }
}