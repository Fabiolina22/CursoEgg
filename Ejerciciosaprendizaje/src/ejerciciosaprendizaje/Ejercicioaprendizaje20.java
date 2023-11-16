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
public class Ejercicioaprendizaje20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matri=new int [3][3];
        llenado(matri);
        comprobar(matri);
    }
    
    //lenar la amtriz
    public static int[][] llenado(int[][] matri){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("de un valor entre 1 y 9");
                matri[i][j]=leer.nextInt();
                if(matri[i][j]<1 || matri[i][j]>9){
                    do {                        
                        System.out.println("de un valor entre 1 y 9");
                        matri[i][j]=leer.nextInt();
                    } while (matri[i][j]<1 || matri[i][j]>9);
                }
            }
                
           
            }
        return matri;
    }
    
    public static void comprobar(int[][] matri){
        int sumaH=0, sumaV=0,sumaD=0,contH=0,contV=0;
        
        //verificar la suma 
        for (int i = 0; i < 3; i++) {
            sumaH=0;
            sumaV=0;
            for (int j = 0; j < 3; j++) {
                //suma horizontal
                sumaH=sumaH+matri[i][j];
                if (sumaH==15){
                    contH++;
                }
                //suma vertical
                sumaV=sumaV+matri[j][i];
                if(sumaV==15){
                    contV++;
                }
            }
        }

        for (int k = 0; k < 3; k++) {
                   sumaD=sumaD+matri[k][k];
                }
        
                if(contH==3 && contV==3 && sumaD==15){
                    System.out.println("la matriz es mágica");
                }
                else{
                    System.out.println("la matriz No es mñagica");
                }
    }
}
    
    

