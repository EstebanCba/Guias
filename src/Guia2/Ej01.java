/*
 Escribir un programa que pida dos números enteros por teclado
y calcule la suma de los dos. El programa deberá después mostrar
el resultado de la suma
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola");
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
         System.out.println("ingrese otro numero");
        int num2 = leer.nextInt();
        System.out.println("La suma de numero 1 + numero 2 es: " + (num+num2));
        
        
    }
    
}
