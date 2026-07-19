package com.mycompany.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número entero: ");
        numero = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= 12; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i));

        }

    }

}