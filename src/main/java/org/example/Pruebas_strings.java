package org.example;

import java.util.Locale;

public class Pruebas_strings {

    static void main() {

        String texto = "Hola estamos en clase probando métodos típicos de String";

        System.out.println(texto.length());
        System.out.println(texto.charAt(22));
        System.out.println(texto.substring(22));

        String texto_concatenado = texto + " para mejorar";
        String texto_concat = texto.concat(" para mejorar");

        System.out.println(texto_concatenado);
        System.out.println(texto_concat);

        System.out.println(texto.indexOf('o',22));

        System.out.println(texto.toUpperCase());
        System.out.println(texto);
        System.out.println(texto.toLowerCase());

        System.out.println(texto.trim());

        System.out.println(texto.replace("o","@"));













    }
}
