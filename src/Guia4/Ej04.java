/*
Crea una aplicación que nos pida un número por teclado y con una función se 
lo pasamos por parámetro para que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
17 si es primo.

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        boolean resultado = primo(num);
        if (primo(num) == true) {
            System.out.println("el numero " + num + " es primo");
        } else {
            System.out.println("el numero " + num + " NO es primo");
        }
    }

    public static boolean primo(int num) {
        int cont = 0;
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        if (num <= 1) {
            primo = false;
        }
        return primo;
    }
}
