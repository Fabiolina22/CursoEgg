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
public class Ejercicioaprendizaje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
         String frase = leer.nextLine();
        
         
         if ("eureka".equals(frase) ){
             System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");
         }
    }
    
}
