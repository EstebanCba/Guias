/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
muestre su equivalente en romano.
 */
package Guia3extras;

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
        System.out.println("ingrese un numero entre 1 y 10");
        int num = leer.nextInt();
        switch(num){
            case 1: System.out.println("1 = I");
            case 2: System.out.println("2 = II");
            case 3: System.out.println("3 = III");
            case 4: System.out.println("4 = IV");
            case 5: System.out.println("5 = V");
            case 6: System.out.println("6 = VI");
            case 7: System.out.println("7 = VII");
            case 8: System.out.println("8 = VII");
            case 9: System.out.println("9 = IX");
            case 10: System.out.println("10 = X");
        }
        
        
    }
    
}
