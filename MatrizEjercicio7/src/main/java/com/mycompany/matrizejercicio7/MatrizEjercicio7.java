package com.mycompany.matrizejercicio7;

import java.util.Scanner;

/**
 * @author Dayron Josué Fares Rivera
 */
public class MatrizEjercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int suma = 0;

        System.out.println("Ingrese los valores de la matriz:");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print("Fila " + i + " Columna " + j + ": ");
                matriz[i][j] = sc.nextInt();

                suma = suma + matriz[i][j];

            }

        }

        System.out.println();
        System.out.println("La suma total es: " + suma);

    }

}
