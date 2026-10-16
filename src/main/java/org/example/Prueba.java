package org.example;

import java.util.Scanner;

public class Prueba {


    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = teclado.next();

        teclado.nextLine();

        System.out.println("¿A qué curso vas?");
        String curso = teclado.nextLine();

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        System.out.println("Inserta un número...");
        int num1 = teclado.nextInt();



        System.out.println("Inserta otro número...");
        int num2 = teclado.nextInt();

        if (num1 != num2){




        }

        //concatenando
        System.out.println("El resultado es " + (num1+num2));

        //variable resultado
        int resultado = num1+num2;
        System.out.println("El resultado es " + resultado);

    }

}
