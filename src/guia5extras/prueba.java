/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre 
los elementos).
 */
package guia5extras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño de los vectores");
        int n = leer.nextInt();
        int[] vect1 = new int[n];
        int[] vect2 = new int[n];
        Random ran = new Random();
        boolean comp = false;
        int cont = 0;
        int cont2 = 0;

        for (int i = 0; i < n; i++) {
            vect1[i] = ran.nextInt(2);
            vect2[i] = ran.nextInt(2);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(vect1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print(vect2[i]);
        }
        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            if (vect1[i] == vect2[i]) {
                cont++;
            } else {
                cont2++;
            }
        }
        if(cont==n){
            System.out.println("los vectores son iguales");
        }
        else{
            System.out.println("los vectores son distintos");
        }

    }

}
