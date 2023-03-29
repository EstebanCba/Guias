/*
 Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package guia5extras;

import java.util.Random;
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
        System.out.println("ingrese cantidad filas de matriz");
        int n = leer.nextInt();
        System.out.println("ingrese cantidad columbas de matriz");
        int m = leer.nextInt();
        int[][] matrix = new int[n][m];
        Random aleatorio = new Random();
        int suma=0;
        
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j]=aleatorio.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                suma = matrix[i][j] + suma;
            }
        }
        System.out.println("La suma total de los elementos da: " + suma);
            System.out.println("");
    }
    
}
