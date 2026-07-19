package com.mycompany.ejercicio10numeromayor;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class Ejercicio10NumeroMayor {

    public static int mayor(int a, int b) {

        if (a > b) {

            return a;

        } else {

            return b;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int resultado;

        System.out.print("Ingrese el primer número: ");
        a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        b = sc.nextInt();

        resultado = mayor(a, b);

        System.out.println("El número mayor es: " + resultado);

    }

}