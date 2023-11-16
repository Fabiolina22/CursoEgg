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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
       
        
        System.out.println("Ingresa dos numeros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        esMultiplo(num1, num2);
        
        
    }
    public static void esMultiplo(int num1, int num2){
        if (num1%num2==0){
            System.out.println(num1+" Es multiplo de "+num2);
        
        }else{
            System.out.println(num1+" NO ES MULTIPLO DE "+num2);
        }
    }
}
    

