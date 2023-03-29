/*
Realizar un programa que solo permita introducir frases o palabras de 8
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se debera
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej03 {
     public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
         System.out.println("ingrese una frase de 8 de largo");
         String frase = leer.nextLine();
         int longitud = frase.length();       
         if (longitud == 8){
             System.out.println("correcto");
         }
         else{
             System.out.println("incorrecto");
         }
}
}