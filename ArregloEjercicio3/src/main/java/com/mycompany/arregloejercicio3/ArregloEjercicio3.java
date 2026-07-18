package com.mycompany.arregloejercicio3;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class ArregloEjercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];

        int mayor;
        int menor;
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

        }

        mayor = numeros[0];
        menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {

                mayor = numeros[i];
                posicionMayor = i;

            }

            if (numeros[i] < menor) {

                menor = numeros[i];
                posicionMenor = i;

            }

        }

        System.out.println();
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("Posición del mayor: " + posicionMayor);
        System.out.println("Posición del menor: " + posicionMenor);

    }

}