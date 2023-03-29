package guia5extras;

import java.util.Random;
import java.util.Scanner;

public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] matrix = new double[10][4];
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int aprob = 0;
        int desap = 0;
        ///////////////////////////////////////////////////////////// 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = aleatorio.nextInt(10) + 1;
            }
        }
        /////////////////////////////////////////////////////////////
        for (int i = 0; i < 10; i++) {
            double promedio = 0;

            System.out.println("Alumno" + (i + 1) + ": ");

            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    System.out.print("TP1 = ");
                }
                if (j == 1) {
                    System.out.print("TP2 = ");
                }
                if (j == 2) {
                    System.out.print("INT1 = ");
                }
                if (j == 3) {
                    System.out.print("INT2 = ");
                }
                System.out.println(matrix[i][j] + " ");
                promedio = (matrix[i][0] * 0.1) + (matrix[i][1] * 0.15) + (matrix[i][2] * 0.25) + (matrix[i][3] * 0.5);
            }
            System.out.print("Promedio " + promedio);
            System.out.println("");
            if (promedio >= 7) {
                aprob++;
            } else {
                desap++;
            }
            System.out.println("");

        }
        System.out.println("Total aprobados " + aprob);
        System.out.println("Total desaprobados " + desap);
        /////////////////////////////////////////////////////////////
    }
}
