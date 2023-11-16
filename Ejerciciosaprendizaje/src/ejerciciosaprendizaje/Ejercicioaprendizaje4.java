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
public class Ejercicioaprendizaje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double F;
        System.out.println("Ingrese una cantidad de grados centígrados:");
        double C = leer.nextDouble();
        F = 32 + (9 * C / 5);
        System.out.println("");
        System.out.println(C + " grados centígrados es equivalente a " + F + " grados fahrenheit");
    }
    
}
