/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 8;
        if(esPar(num)){
            System.out.println("el numero es par");
        }
        else{
            System.out.println("el numero es impar");
        }
        
    }
    public static boolean esPar(int num){
        boolean par = num % 2 == 0;
        return par;
    }
}
