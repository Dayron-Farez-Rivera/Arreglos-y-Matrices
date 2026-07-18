package com.mycompany.matrizejercicio8;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class MatrizEjercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        System.out.println("Ingrese los valores de la matriz:");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print("Fila " + i + " Columna " + j + ": ");
                matriz[i][j] = sc.nextInt();

            }

        }

        System.out.println();
        System.out.println("Diagonal principal:");

        for (int i = 0; i < 4; i++) {

            System.out.println(matriz[i][i]);
            sumaDiagonal = sumaDiagonal + matriz[i][i];

        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);

    }

}