/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
función para cada operación matemática y deben devolver sus resultados para 
imprimirlos en el main. 
 */
package Guia4;

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
        System.out.println("ingrese primer numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese segundo numero");
        int num2 = leer.nextInt();
        int opcion = 0;
        
        System.out.println("ELIJA UNA OPCION");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");    

        opcion = leer.nextInt();
        switch(opcion){
            case 1: 
                int rSuma = sumar(num1, num2);
                System.out.println("la suma da: " + rSuma);
                break;
            case 2:
                int rResta = restar(num1, num2);
                System.out.println("la suma da: " + rResta);
                break;
            case 3:
                int rMultiplicacion = multiplicar(num1, num2);
                System.out.println("la suma da: " + rMultiplicacion);
                break;
            case 4:
                int rDivision = dividir(num1, num2);
                System.out.println("la suma da: " + rDivision);
                break;
        }
        
    }
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    public static int restar(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    public static int dividir(int num1, int num2){
        return num1 / num2;
    }
}
