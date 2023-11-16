/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicioaprendizaje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero para definir si es par o impar: ");
        int num1 = leer.nextInt();
        if (num1%2== 0){
            System.out.println("el numero ingresado es par");
        }else{
            System.out.println("el numero ingresado no es par");
        }
    }
    
}
