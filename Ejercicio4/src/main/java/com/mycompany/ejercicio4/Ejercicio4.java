package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese la nota: ");
        nota = sc.nextDouble();

        if (nota >= 7) {

            System.out.println("Aprobado");

        } else {

            System.out.println("Reprobado");

        }

    }

}

