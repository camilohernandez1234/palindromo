package com.mycompany.palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa una palabra: ");
        String palabra = entrada.nextLine();
        
        boolean resultado = funccion_palindromo.esPalindromo(palabra);
        
        if (resultado) {
            System.out.println("La palabra \"" + palabra + "\" es un palindromo.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" NO es un palindromo.");
        }
    }
}
