/*
 Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter
‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion = 0;

        do{
            System.out.println("MENU"); 
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");
            System.out.println("ELIJA UNA OPCION");
            opcion = leer.nextInt();

            switch(opcion){
                case 1: System.out.println("la suma da: " + (num1 + num2));
                break;
                case 2: System.out.println("la suma da: " + (num1 - num2));
                break;
                case 3: System.out.println("la suma da: " + (num1 * num2));
                break;
                case 4: System.out.println("la suma da: " + (num1 / num2));
                break;
                case 5: System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String salir = leer.next();
                if (salir.equals("S")){
                    continue;
                }
            }
        }while(opcion != 5);
        }
}
