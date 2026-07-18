package com.mycompany.arregloejercicio4;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class ArregloEjercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];

        int pares = 0;
        int impares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {

                pares++;
                sumaPares += numeros[i];

            } else {

                impares++;
                sumaImpares += numeros[i];

            }

        }

        System.out.println();
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        System.out.println("Suma de los números pares: " + sumaPares);
        System.out.println("Suma de los números impares: " + sumaImpares);

    }

}