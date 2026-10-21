package org.example;

import java.util.Scanner;

public class Ejercicio7 {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce si hay aceite [S/N]: ");
        char aceite = teclado.next().charAt(0);

        System.out.println("introduce si hay tomate [S/N]: ");
        char tomate = teclado.next().charAt(0);

        System.out.println("introduce si hay jamón [S/N]: ");
        char jamon = teclado.next().charAt(0);

        if (aceite=='N' || tomate=='N' || jamon=='N'){
            System.out.println("COMPRAR!!");
        }else{
            System.out.println("NO COMPRAR!!");
        }

//        String y = teclado.next();
//
//        if (y.equals("hola")){
//
//        }


    }
}
