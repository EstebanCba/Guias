/*
 Realizar un algoritmo que calcule la suma de todos los elementos de 
un vector de tamaño N, con los valores ingresados por el usuario.
 */
package guia5extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej123jhasgdika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño de vector");
        int n = leer.nextInt();
        int[] lunes = new int[n];
        int suma=0;
        
        for(int i=0; i<n; i++){
            System.out.println("ingrese el " + i + " numero del vector");
            lunes[i]= leer.nextInt();
            suma+=lunes[i];
        }
        System.out.println("El total de la suma es: " + suma);
    }
}
