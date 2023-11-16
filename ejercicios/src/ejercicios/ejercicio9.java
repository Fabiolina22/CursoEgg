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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        int num = 0;
        int i = 0;
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
                
                cont++;
                 
                if( num < 0 ){
                    continue;
                }
                if( num == 0 ){
                    break;
                }
                suma += num;
            
        } while (cont<20);
        System.out.println("La suma de los numeros ingresados es: " + suma + "");
    }
    
}
