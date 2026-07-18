package com.mycompany.arregloejercicio5;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class ArregloEjercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[12];

        for (int i = 0; i < numeros.length; i++) {

            do {

                System.out.print("Ingrese un número positivo: ");
                numeros[i] = sc.nextInt();

            } while (numeros[i] <= 0);

            numeros[i] = numeros[i] + i;

        }

        System.out.println();
        System.out.println("Arreglo resultante:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Posición " + i + ": " + numeros[i]);

        }

    }

}