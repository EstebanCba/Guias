/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka”
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej02 {
     public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
             System.out.println("Ingrese una frase");
    String frase = leer.nextLine();

    if(frase.equals("eureka")){
        System.out.println("Correcto");
    }
    else{
        System.out.println("Incorrecto");
    }
}
}