package com.mycompany.palindromo;

public class funccion_palindromo {
    
   
    public static boolean esPalindromo(String palabra) {
        String palabraLimpia = palabra.toLowerCase().replaceAll("\\s+", "");
        String invertida = new StringBuilder(palabraLimpia).reverse().toString();
        return palabraLimpia.equals(invertida);
    }
}
