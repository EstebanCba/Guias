/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. Utilizar sólo una variable auxiliar.
 */
package Guia3extras;

/**
 *
 * @author Esteban
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 2;
        int B = 4;
        int C = 6;
        int D = 8;
        
        B = C;
        System.out.println("variable B = " + B);
        C = A;
        System.out.println("variable C = " + C);
        A = D;
        System.out.println("variable A = " + A);
        D = B;
        System.out.println("variable D = " + D);
       
        
    }
    
}
