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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingresa tu edad");
        int edad = leer.nextInt();
        double division = edad / 4;
        char simbolo = (char) edad;
        boolean respuesta = edad > 12;
        System.out.println("tu edad dividida en 4 es "+division);
        System.out.println("el simbolo para tu edad es "+simbolo);
        System.out.println("tu edad es mayor a 12? "+respuesta);
    }
    
}
