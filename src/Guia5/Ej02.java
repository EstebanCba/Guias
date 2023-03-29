/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa mostrará
dónde se encuentra el numero y si se encuentra repetido
 */
package Guia5;

import java.util.Random;
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
        int[] vector = new int[10];
        Random aleatorio = new Random();
        
        for(int i = 0; i < 10; i++){
            vector[i] = aleatorio.nextInt(10);
        }
        for(int i = 0; i < 10; i++){
            System.out.println(vector[i]);
        }
        System.out.println("ingrese un numero a buscar, entre 1 y 10");
        int num = leer.nextInt();
        
        for(int i = 0; i < 10; i++){
        
            if(num == vector[i]){
                System.out.println("numero encontrado en elemento " + i);
            }
            
        }
    }
    
}
