package com.mycompany.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contraseña;

        do {

            System.out.print("Ingrese la contraseña: ");
            contraseña = sc.nextLine();

        } while (!contraseña.equals("java2026"));

        System.out.println("Acceso concedido.");

    }

}