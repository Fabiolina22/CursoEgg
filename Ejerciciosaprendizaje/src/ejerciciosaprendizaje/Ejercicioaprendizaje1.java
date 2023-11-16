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
public class Ejercicioaprendizaje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        System.out.println("ingrese 2 numeros: ");
        num1=leer.nextInt();
        num2=leer.nextInt();
        num3=num1+num2;
        System.out.println("la suma de los numeros ingresados es: "+num3);
    }
    
}
