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
public class Ejercicioaprendizaje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
                
        
        int num2 = (int) (Math.random() * 10);        
        int[] vector = new int[num2];
        buscarNumero (vector, num2,leer);
    }
    public static void buscarNumero (int[] vector, int num2, Scanner leer){
        int i =0;
        for (i=0; i<num2; i++){
            vector[i] = (int) (Math.random() * 10);
            System.out.print("( "+vector[i]+" )");
           
        }
        System.out.println("");
        int numero;
        System.out.println("ingrese el numero que desea buscar:");
        numero = leer.nextInt();
        int cont=0;
        for (i=0; i<num2; i++){
            if (vector[i]==numero){
                System.out.println("el numero "+numero+ " se encuentra en la posicion del vector: "+(i+1));
                cont++;
                
            }
           
        }
      System.out.println("el numero se repite "+cont+" veces");  
    }
    
}

        

