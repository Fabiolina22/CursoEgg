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
public class Ejercicioaprendizaje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese codigos: ");
        String frase;
        int corr = 0;
        int incor = -1;
        do{
            frase = leer.nextLine();
            if ("X".equals(frase.substring(0,1))&&"O".equals(frase.substring(4,5))&& frase.length()==5){
                corr += 1 ;
            } else {
                incor += 1;
            }
                            
            
        } while(!("&&&&&".equals(frase)));
         
        System.out.println("la cantidad de codigos correctos es: "+corr);
        System.out.println("la cantidad de codigos incorrectos es: "+incor);
    }
    
}
