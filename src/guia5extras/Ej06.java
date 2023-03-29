/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().

 */
package guia5extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej06 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        String[][] sopa = new String[20][20];

/////////////////////////////////////////////////////////////////
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese una palabra");
            int longitud;
            do {
                palabras[i] = leer.next();
                longitud = palabras[i].length();
                if (longitud < 3 || longitud > 5) {
                    System.out.println("que sea entre 3 y 5 caracteres");
                }
            } while (longitud < 3 || longitud > 5);
        }
//////////////////////////////////////////////////////////////////
        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 20; j++) {
                if (i >= 5) {
                    int num = (int) (Math.random() * 9);
                    sopa[i][j] = String.valueOf(num);
                    System.out.print(sopa[i][j] + " ");
                } else {
                    int longitud = palabras[i].length();
                    if (j >= longitud) {
                        int num = (int) (Math.random() * 9);
                        sopa[i][j] = String.valueOf(num);
                    } else {
                        sopa[i][j] = palabras[i].substring(j, j + 1);
                    }
                    System.out.print(sopa[i][j] + " ");
                }
                
            }
            System.out.println("");
        }
    }

}
