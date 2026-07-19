package com.mycompany.ejercicio8areadeunrectangulo;

import java.util.Scanner;

/**
 * @author Dayron Josue Farez Rivera
 */
public class Ejercicio8AreadeunRectangulo {

    public static double calcularArea(double base, double altura) {

        return base * altura;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.print("Ingrese la base: ");
        base = sc.nextDouble();

        System.out.print("Ingrese la altura: ");
        altura = sc.nextDouble();

        area = calcularArea(base, altura);

        System.out.println("El área del rectángulo es: " + area);

    }

}