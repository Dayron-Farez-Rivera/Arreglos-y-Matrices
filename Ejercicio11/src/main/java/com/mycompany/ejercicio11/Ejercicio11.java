package com.mycompany.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int mayor = 0;
        int menor = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();

            if (i == 1) {

                mayor = numero;
                menor = numero;

            } else {

                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }

            }

        }

        System.out.println();
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);

    }

}