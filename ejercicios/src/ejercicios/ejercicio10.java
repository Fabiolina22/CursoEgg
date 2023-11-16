/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros ");
        
        for (int j = 0; j < 4; j++) {
            System.out.println("");
            int n = leer.nextInt();
            
            if (n<=20) {
                //System.out.print(n);
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
            
                }
            }else {
                j--;
                System.out.println("El numero ingresado en invalido");

            }
            
        }
    }
    
}
