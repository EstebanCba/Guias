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

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class EjSopa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        String[][] sopa = new String[20][20];
        Random aleatorio = new Random();

//Ingresando palabras entre 3 y 5
        for (int i = 0; i < 5; i++) {
            int largo;
            do {
                System.out.println("ingrese palabra entre 3 y 5 caracteres");
                palabras[i] = leer.next();
                largo = palabras[i].length();
                if (largo < 3 || largo > 5) {
                    System.out.println("---largo incorrecto---");
                    System.out.println("");
                }
            } while (largo < 3 || largo > 5);
        }
        System.out.println("");


// Matriz Sopa
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i >= 5) {
                    sopa[i][j] = String.valueOf(aleatorio.nextInt(9));
                } else {
                    int largo = palabras[i].length();
                    if (j<largo) {
                        sopa[i][j] = palabras[i].substring(j, j + 1);
                    }else{
                        sopa[i][j] = String.valueOf(aleatorio.nextInt(9));
                    }
                }
            }
        }
//
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println(" ");
        }
//
    }
}
