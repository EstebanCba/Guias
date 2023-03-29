/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario
si quiere seguir mostrando personas y frenar cuando el usuario ingrese la
palabra “No”.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("ingrese nombre de la persona");
            String nombre = leer.next();
            System.out.println("ingrese edad de la persona");
            int edad = leer.nextInt();

            boolean resultado = mayorEdad(edad);
            if (resultado) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }
            System.out.println("desea agregar nueva persona? S/N");
            respuesta = leer.next();
            
        } while(!respuesta.equals("N"));

    }

    public static boolean mayorEdad(int edad) {

        return edad > 18;

    }
}
