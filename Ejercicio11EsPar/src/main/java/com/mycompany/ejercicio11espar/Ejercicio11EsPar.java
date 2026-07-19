package com.mycompany.ejercicio11espar;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class Ejercicio11EsPar {

    public static boolean esPar(int numero) {

        if (numero % 2 == 0) {

            return true;

        } else {

            return false;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        if (esPar(numero)) {

            System.out.println("El número es par.");

        } else {

            System.out.println("El número es impar.");

        }

    }

}
