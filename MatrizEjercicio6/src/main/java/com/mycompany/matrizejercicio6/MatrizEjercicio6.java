package com.mycompany.matrizejercicio6;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class MatrizEjercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        System.out.println("Ingrese los valores de la matriz:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print("Fila " + i + " Columna " + j + ": ");
                matriz[i][j] = sc.nextInt();

            }

        }

        System.out.println();
        System.out.println("Matriz:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();

        }

    }

}