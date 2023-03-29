/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int[] vector = new int[10];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        System.out.println("ingrese 10 numeros entre 1 y 5 digitos"); 
        
        for(int i=0; i<10; i++){
            vector[i] = leer.nextInt();
            
        }
        for(int i=0; i<10; i++){
            int digitos = (int) Math.log10(vector[i]) + 1;
            if(digitos==1){
                cont1++;
            }
            if(digitos==2){
                cont2++;
            }
            if(digitos==3){
                cont3++;
            }
            if(digitos==4){
                cont4++;
            }if(digitos==5){
                cont5++;
            }
        }
                    System.out.println("numeros de 1 digitos = " + cont1);
                    System.out.println("numeros de 2 digitos = " + cont2);
                    System.out.println("numeros de 3 digitos = " + cont3);
                    System.out.println("numeros de 4 digitos = " + cont4);
                    System.out.println("numeros de 5 digitos = " + cont5);
    }
    
}
