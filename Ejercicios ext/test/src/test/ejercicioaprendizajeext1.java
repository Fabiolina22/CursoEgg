/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 *
 * @author USER
 */
public class ejercicioaprendizajeext1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double minutos = 0;
       Scanner leer = new Scanner (System.in);
       System.out.println("Ingrese la cantidad de minutos a calcular:");
       minutos = leer.nextInt();
       calcular (minutos);
    }
    public static void calcular (double minutos){
        System.out.println("la cantidad de horas es: "+(Math.round(minutos/60)));
        System.out.println("la cantidad de dias es: "+(Math.round(minutos/1440)));
        
    }
    
}
