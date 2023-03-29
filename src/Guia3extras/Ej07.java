/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo
y el promedio de n números (n>0). El valor de n se solicitará al principio del
programa y los números serán introducidos por el usuario. Realice dos versiones 
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package Guia3extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de numeros");
        int cantidad = leer.nextInt();
        int cont=0;
            int mayor = 0;
            int menor= 999;
        while(cont<cantidad){
            System.out.println("ingrese un numero");
            int num = leer.nextInt();
            cont++;

            if (num>mayor){
                mayor = num;
            }
            if (num<menor){
                menor = num;
            }

        }
                System.out.println("mayor es = " + mayor);
                System.out.println("menor es = " + menor);
    }
    
}
