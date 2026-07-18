package com.mycompany.arregloejercicio1;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class ArregloEjercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

        }

        System.out.println("\nValores almacenados:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Posición " + i + ": " + numeros[i]);

        }

    }

}
