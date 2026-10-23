package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatch {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        try {
            int numero = teclado.nextInt();

        }catch(InputMismatchException e){

            System.out.println("introduce números!!");

        }





    }
}
