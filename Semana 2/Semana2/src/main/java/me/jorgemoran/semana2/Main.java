package me.jorgemoran.semana2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una serie de palabras. Escribe 'fin' para terminar.");

        int contadorPalabrasConA = 0; // Contador de palabras que contienen la letra 'a'
        String palabra;

        // Bucle que se ejecuta hasta que el usuario escribe 'fin'
        while (true) {
            palabra = scanner.nextLine();
            if (palabra.equals("fin")) {
                break; // Termina el bucle si el usuario escribe 'fin'
            }

            // Manipulación de string: convertir cada palabra a mayúsculas
            String palabraEnMayusculas = palabra.toUpperCase();
            System.out.println("Palabra en mayúsculas: " + palabraEnMayusculas);

            // Condicionales: verificar si la palabra contiene la letra 'A'
            if (palabraEnMayusculas.contains("A")) {
                contadorPalabrasConA++;
                System.out.println("Esta palabra contiene la letra 'A'.");
            } else {
                System.out.println("Esta palabra no contiene la letra 'A'.");
            }
        }

        // Final del programa: mostrar el número total de palabras que contienen 'A'
        System.out.println("Número total de palabras que contienen la letra 'A': " + contadorPalabrasConA);
        scanner.close();
    }
}

