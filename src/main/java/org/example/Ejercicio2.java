package org.example;

import java.util.Scanner;

public class Ejercicio2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        final double JORNADA = 40;

        System.out.println("Introduce un número de horas...");
        double horas = teclado.nextDouble();

        System.out.println("Precio/hora: ");
        double precio = teclado.nextDouble();

        double salario;
        if (horas <= JORNADA){
            salario=horas*precio;
            System.out.println("Salario:" + salario);
        }else {
            double extras = horas - JORNADA;
            double sueldo_extra = extras*precio*1.5;
            salario=precio*JORNADA + sueldo_extra;
            System.out.println("Salario (con extra): " + salario);
        }

        // &&    ||
//        if(){ // ==  !=  >=  <=
//
//        } else if () {
//
//        }

    }


}
