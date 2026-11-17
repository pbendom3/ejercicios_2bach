package org.example;

import java.util.Scanner;

public class Ejercicio1_bucles {

    static void main() {

        Scanner teclado = new Scanner(System.in);

//        String contrasenya = "12346";
//        String contrasenya_introducida = "";
//
//        do{
//            System.out.println("Introduce contraseña: ");
//            contrasenya_introducida = teclado.next();
//        }while(!contrasenya.equals(contrasenya_introducida));
//
//        System.out.println("BIENVENIDO!!");

//        System.out.println("introduce un número para contar hacia atrás:");
//        int numero = teclado.nextInt();
//
//        for(int i=numero;i>0;i--){
//            System.out.println(i);
//        }

//        for (int i=1;i<=50;i++){
//
//            if (i%3==0){
//                System.out.println(i);
//            }
//
//        }

        String palabra = "GROWDLY";
        for (int i=0;i<palabra.length();i++){
            System.out.println(palabra.charAt(i));
        }

    }
}
