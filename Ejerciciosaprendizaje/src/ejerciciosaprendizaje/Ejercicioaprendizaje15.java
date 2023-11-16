/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje;

/**
 *
 * @author USER
 */
public class Ejercicioaprendizaje15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] vector = new int[100];
        Conteo(vector);
        
        
    }
    public static void Conteo(int[] vector ){
       for (int i=100 ; i>0 ; i--){
           int j=0;
           vector[j] = i;
            System.out.println(" ("+vector[j]+") ");
            j++;
            
            
        } 
    }
    
}
    
    

