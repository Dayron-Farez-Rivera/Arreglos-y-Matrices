package com.mycompany.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        if (num2 != 0) {
          System.out.println("División: " +((double) num1 / num2));
          System.out.println("Residuo: " + (num1 % num2));
        } else {
            System.out.println("División: No se puede dividir para cero");
            System.out.println("Residuo: No disponible");
        }
    }

}