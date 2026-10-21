package org.example;

import java.util.Scanner;

public class Ejercicio8 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 3 lados: ");
        int l1 = teclado.nextInt();
        int l2 = teclado.nextInt();
        int l3 = teclado.nextInt();

        if (l1==l2 && l1==l3){
            System.out.println("EQUILÁTERO");
        } else if (l1!=l2 && l1!=l3 && l2!=l3) {
            System.out.println("ESCALENO");
        }else{
            System.out.println("ISÓSCELES");
        }


    }
}
