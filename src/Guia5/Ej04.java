/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Guia5;

import java.util.Random;
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
        Random aleatorio = new Random();
        int[][] matrix = new int[4][4];
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                matrix[i][j] = aleatorio.nextInt(9);
            }
            
        }
        System.out.println("MATRIZ A");
        System.out.println(" ");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println(" ");
        System.out.println("MATRIZ b");
        System.out.println(" ");
        for(int j=0; j<4; j++){
            for(int i=0; i<4; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}


















