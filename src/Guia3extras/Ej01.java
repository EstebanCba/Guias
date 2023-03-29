/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por 
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
equivalente: 1 día, 2 horas.
 */
package Guia3extras;

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
        System.out.println("ingrese cantidad de minutos");
        int minutos = leer.nextInt();
        double horas = minutos / 60 ;
        double dias = horas / 24;
        
        System.out.println("la cantidad de minutos ingresada es " + minutos);
        System.out.println("la cantidad de horas en de: " + horas);
        System.out.println("la cantidad en dias es de: " + dias);
    }
    
}
