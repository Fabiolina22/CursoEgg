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
public class Ejercicioaprendizaje21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       int[][] matri10=new int [10][10];
       boolean comp = false;
       
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matri10[i][j]=(int)(Math.random()*10);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print("["+matri10[i][j]+"]");
            }
        }
        
        int[][] matri3= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese un valor");
                matri3[i][j]=leer.nextInt();
            }
        }
              for (int i = 0; i < 10; i++) {
                  for (int j = 0; j < 10; j++) {
                      if(matri10[i][j]==matri3[0][0]){
                          int aux1=i,aux2=j;
                      comparar(matri10,matri3,aux1,aux2,comp);
                     
                      }
                      if(comp=true){
                          break;
                          }
                  }
                  if(comp=true){
                          System.out.println("se encontró la matriz");
                          break;
                          }
              
        }
              if(comp=false){
                  System.out.println("NO se ha enocntrado la matriz");
              }
      
                }
    public static boolean comparar(int[][]matri10, int[][] matri3,int aux1,int aux2, boolean comp){
        int k=0,l=0;
        for (int i = aux1; i < aux1+3; i++) {
            l=0;
            for (int j = aux2; j < aux2+3; j++) {
                if (matri10[i][j]==matri3[k][l]) {
                    comp=true;
                }
                else{
                    comp=false;
                    break;
                }
                l++;
            }
            k++;
        }
        
        return comp;
    }
                
}
    
    
    

