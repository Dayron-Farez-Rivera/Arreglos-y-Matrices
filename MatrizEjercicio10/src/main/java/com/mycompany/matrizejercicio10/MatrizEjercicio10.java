package com.mycompany.matrizejercicio10;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class MatrizEjercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        int numero;

        System.out.println("Ingrese los valores de la matriz:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("Fila " + i + " Columna " + j + ": ");
                numero = sc.nextInt();

                matriz[i][j] = numero + (i * j);

            }

        }

        System.out.println();
        System.out.println("Matriz resultante:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();

        }

    }

}
