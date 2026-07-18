package com.mycompany.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int suma = 0;

        while (true) {

            System.out.print("Ingrese un número positivo (negativo para terminar): ");
            numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            cantidad++;
            suma += numero;

        }

        System.out.println();
        System.out.println("Cantidad de números ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

    }

}
