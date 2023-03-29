/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
los elementos).
 */
package guia5extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de elementos de los vectores");
        int n = leer.nextInt();
        System.out.println("*********************************************");

        //////////////////////////////////////////////////////
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        System.out.println("ingrese los " + n + " numeros que llenan el vector 1");
        for (int i = 0; i < n; i++) {
            vector1[i] = leer.nextInt();
        }
        /////////////////////////////////////////////////////
        System.out.println("ingrese los " + n + " numeros que llenan el vector 2");
        for (int i = 0; i < n; i++) {
            vector2[i] = leer.nextInt();
        }
        ////////////////////////////////////////////////////
        boolean iguales = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        if (iguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son diferentes");
        }
    }

}
