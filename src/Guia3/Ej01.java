/*
 Crear un programa que dado un número determine si es par o impar.
 */
package Guia3;

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
        System.out.println("ingrese un numero");
                int num = leer.nextInt();
                if(num%2==0){
                    System.out.println("el numero es par");
                }
                else{
                    System.out.println("el numero es impar");
                }
    }
}
