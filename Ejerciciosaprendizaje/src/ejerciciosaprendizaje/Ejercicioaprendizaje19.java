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
public class Ejercicioaprendizaje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][]= new int [3][3];
        int matrizb[][]= new int [3][3];
        Scanner leer = new Scanner (System.in);
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizb[i][j] = matriz[j][i];            
            System.out.print("("+matrizb[i][j] +")");
        }
            
        System.out.println("");
        }
        boolean esantisimetrica = true;
        
        
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz.length ; j++) {
                           System.out.print("("+matriz[i][j] +")"); 
                if (matriz[i][j] != matrizb[j][i]) {
                    esantisimetrica = false;
                    break;
                    
                }
                
                
                
                
            }
            System.out.println(" ");
                    }
        if (esantisimetrica) {
            System.out.println("es antisimetrica");
            
            
        }else {
            System.out.println("no es antisimetrica");
        }
        
    }
    
}

    
    

