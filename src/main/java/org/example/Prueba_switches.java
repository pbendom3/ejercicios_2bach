package org.example;

public class Prueba_switches {

    static void main() {

        int numero = 1;

        switch(numero){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("SUSPENSO");
                break;
            case 5:
                System.out.println("APROBADO");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
                System.out.println("NOTABLE BAJO");
                break;
            case 8:
                System.out.println("NOTABLE ALTO");
                break;
            case 9:
                System.out.println("SOBRESALIENTE");
                break;
            case 10:
                System.out.println("SOBRESALIENTE++");
                break;
        };



    }
}
