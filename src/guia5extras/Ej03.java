/*
 Crear una función que rellene un vector con números aleatorios, pasándole un
arreglo por parámetro. Después haremos otra función o procedimiento que 
imprima el vector.
 */
package guia5extras;

import java.util.Random;

/**
 *
 * @author Esteban
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[4];
        llenado(vector);
        impresion(vector);
    }
    public static void llenado(int vector[]){
        Random aleatorio = new Random();
        for(int i=0; i<4; i++){
            vector[i] = aleatorio.nextInt(10);
        }
    }
    public static void impresion(int vector[]){
        Random aleatorio = new Random();
            System.out.println("Vector impreso");
        for(int i=0; i<4; i++){
            System.out.println(vector[i]);
        }
    }
}
