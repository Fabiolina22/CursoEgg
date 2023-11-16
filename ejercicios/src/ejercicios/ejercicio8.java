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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota = 0;
        
        do {
            System.out.println("Ingrese una Nota entre 0 y 10");
            nota = leer.nextInt();
            System.out.println("La nota ingrasada es: " + nota + "");
        }while (nota > 10 || nota < 0);   
    }
    
}
