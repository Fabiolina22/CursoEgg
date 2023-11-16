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
public class Ejercicioaprendizaje8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        
        System.out.println("Ingrese una frase de 8 caracteres: ");
        String frase = leer.nextLine();
        int lf = frase.length();
        
        
        if (lf == 8){
            System.out.println("Correcto " +lf );
            
        }else{
            System.out.println("Incorrecto " + lf);
        }
    }
    
}
