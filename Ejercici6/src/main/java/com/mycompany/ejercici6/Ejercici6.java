package com.mycompany.ejercici6;

import java.util.Scanner;

public class Ejercici6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.print("Ingrese un número del 1 al 7: ");
        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("1.Lunes");
                break;

            case 2:
                System.out.println("2.Martes");
                break;

            case 3:
                System.out.println("3.Miércoles");
                break;

            case 4:
                System.out.println("4.Jueves");
                break;

            case 5:
                System.out.println("5.Viernes");
                break;

            case 6:
                System.out.println("6.Sábado");
                break;

            case 7:
                System.out.println("7.Domingo");
                break;

            default:
                System.out.println("Número inválido");

        }

    }

}
