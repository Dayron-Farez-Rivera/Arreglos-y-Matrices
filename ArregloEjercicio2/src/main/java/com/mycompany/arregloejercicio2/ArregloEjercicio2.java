package com.mycompany.arregloejercicio2;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class ArregloEjercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        double suma = 0;
        double promedio;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();

            suma = suma + numeros[i];

        }

        promedio = suma / numeros.length;

        System.out.println();
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

    }

}