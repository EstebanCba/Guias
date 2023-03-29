/*
 Leer la altura de N personas y determinar el promedio de estaturas
que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Guia3extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de personas");
        int personas = leer.nextInt();
        double estaturaSuma = 0;
        double estaturaProm = 0;

        for (int i = 1; i <= personas; i++) {
            System.out.println("ingrese estatura de la persona");
            double estatura = leer.nextDouble();
            estaturaSuma = estaturaSuma + estatura;
            estaturaProm = estaturaSuma / personas;
        }
        System.out.println("el promedio de estatura es de: " + estaturaProm);
        
    }
    
}
