/*
 Crea una aplicación que a través de una función nos convierta una cantidad
de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
moneda a convertir que será una cadena, este no devolverá ningún valor y 
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia4;

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
        System.out.println("ingrese cantidad de Euros a convertir");
        int euro = leer.nextInt();
        System.out.println("ingrese moneda a convertir");
        System.out.println("--------------------------");
        System.out.println("* dolar");
        System.out.println("* yen");
        System.out.println("* libra");
        System.out.println("--------------------------");
        String moneda = leer.next();
        
        double resultado = convertir(euro, moneda);
        System.out.println("la cantidad en " + moneda + " es de: " + resultado);
    }

    public static double convertir(int euro, String moneda) {
        double convert =0;
            if (moneda.equals("dolar")){
                convert = euro / 1.28611;
            }
            if (moneda.equals("yen")){
                convert = euro / 129.852;
            }
            if (moneda.equals("libra")){
                convert = euro / 0.86;
            }
        
        return convert;
    }

}
