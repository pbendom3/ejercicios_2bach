package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Strings_ejercicio5 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Jugador 1, introduce una frase: ");
        String frase = teclado.nextLine().toUpperCase();

        System.out.println("Jugador 2, empiezas!");
        int vidas = 5;

        do {

            System.out.println("Introduce la palabra a buscar...");
            String palabra = teclado.next().toUpperCase();

            if (frase.contains(palabra)==true){
                System.out.println("¡enhorabuena, has acertado una palabra!");
                vidas=-842;
            }else{
                vidas = vidas - 1;
                if (vidas ==0){
                    System.out.println("GAME OVER");
                }else{
                    System.out.println("error! la palabra no está en la frase. Te quedan " + vidas + " vidas.");
                }
            }

        } while(vidas > 0);

    }
}
