/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.
 */
package Guia3;

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
        System.out.println("ingrese un numero limite");
        int limite = leer.nextInt();
        int suma = 0;
        while(suma<=limite){
            System.out.println("ingrese un numero para sumar");
            int num = leer.nextInt();
            suma = suma + num;
        }
        System.out.println("limite superado, la suma es de " + suma);
    }
    
}
