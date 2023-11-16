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
public class Ejercicioaprendizaje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa un Numero Entero");
        int numeroEntero = leer.nextInt();
        
        int numero = (int) (Math.random() * 100);
        
        System.out.println("el numero ingresado es: "+numeroEntero);
        System.out.println("El doble " +numeroEntero*2);
        System.out.println("el trrple " +numeroEntero*3);
        System.out.println("La raiz cuadrada es: "+Math.sqrt(numeroEntero));
        System.out.println("El metodo aleatorio "+numero);
    }
    
}
