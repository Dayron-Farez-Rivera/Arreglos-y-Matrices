package com.mycompany.ejercicio5calculadora;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class Ejercicio5Calculadora {

    public static void operaciones(double a, double b) {

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));

        if (b != 0) {

            System.out.println("División: " + (a / b));

        } else {

            System.out.println("No se puede dividir para cero.");

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;

        System.out.print("Ingrese el primer número: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        b = sc.nextDouble();

        operaciones(a, b);

    }

}
