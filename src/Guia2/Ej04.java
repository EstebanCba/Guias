/*
 Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente
es: F = 32 + (9 * C / 5).
 */
package Guia2;

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
        System.out.println("Ingrese grados Centigrados");
        double gradosC = leer.nextInt();
        double gradosF = 32 + (9 * gradosC / 5);
        System.out.println("Los grados C son: " + gradosC);
        System.out.println("Los grados F son: " + gradosF);
    }
}
