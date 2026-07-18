package com.mycompany.matrizejercicio9;

import java.util.Scanner;

/**
 * @author Dayron Josué Fares Rivera
 */
public class MatrizEjercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        int mayor;
        int menor;

        System.out.println("Ingrese los valores de la matriz:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("Fila " + i + " Columna " + j + ": ");
                matriz[i][j] = sc.nextInt();

            }

        }

        mayor = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (matriz[i][j] > mayor) {

                    mayor = matriz[i][j];

                }

                if (matriz[i][j] < menor) {

                    menor = matriz[i][j];

                }

            }

        }

        System.out.println();
        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);

    }

}
