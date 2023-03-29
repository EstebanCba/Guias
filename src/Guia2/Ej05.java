/*
 Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej05 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
       double num = leer.nextInt();
       double numPor2 = num * 2;
       double numPor3 = num * 3;
       double numRaiz = Math.sqrt(num);
        System.out.println("El numero por 2 es: " + numPor2);
        System.out.println("El numero por 3 es: " + numPor3);
        System.out.println("La raiz cuadrada del numero es: " + numRaiz);
    }
}
