/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3extras;

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
        System.out.println("ingrese que tipo de socio es: A, B o C");
        String socio = leer.next();
        System.out.println("ingrese costo de tratamiento: ");
        double costo = leer.nextInt();
        switch(socio.toUpperCase()){
                case "A":
                    System.out.println("Socio clase A: tiene %50 de descuento");
                    System.out.println("Costo total: $" + costo);
                    System.out.println("Costo con descuento: $" + (costo * 0.5));
                    break;
                    case "B":
                    System.out.println("Socio clase A: tiene %35 de descuento");
                    System.out.println("Costo total: $" + costo);
                    double descuento35 = ((costo * 35)/ 100);
                    System.out.println("Costo con descuento: $" + (costo - descuento35));
                    break;
                    case "C":
                    System.out.println("Socio clase C, no tiene descuento");
                    System.out.println("Costo total: $" + costo);
                    break;
                    
        }
        
        
    }
    
}
