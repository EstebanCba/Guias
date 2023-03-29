/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector
de tamaño N, con los valores ingresados por el usuario.
 */
package guia5extras;

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
        System.out.println("ingrese largo de vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int suma = 0;

        System.out.println("ingresa los " + n + " numeros para llenar al vector");
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
            suma = vector[i] + suma;
        }
        System.out.println("");
        System.out.println("La suma de los elementos del vector da: " + suma);

    }
}
