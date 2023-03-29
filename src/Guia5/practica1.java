/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Equipo[] = new String[5];
        System.out.println("ingrese 5 nombres");
        for(int i=0; i<5; i++){ 
            Equipo[i] = leer.next();
            
        }
        System.out.println("Los alumnos son:");
        System.out.println("------------------------");
        for(int i=0; i<5; i++){ 
            System.out.println("[" + Equipo[i] + "]");
            System.out.println(" ");
        }
        System.out.println("------------------------");
    }
    
}
