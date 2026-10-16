package org.example;

import java.util.Scanner;

public class Votar {

    static final int EDAD_VOTO = 25;

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una edad...");

        int edad = teclado.nextInt();

        if (edad < 0){
            System.out.println("Error. Edad incorrecta...");
        }else {

            if (edad < EDAD_VOTO){
                System.out.println("No puedes votar");
            }else{
                System.out.println("Puedes votar");
            }

        }

    }

}
