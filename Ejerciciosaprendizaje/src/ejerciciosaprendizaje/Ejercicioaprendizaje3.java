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
public class Ejercicioaprendizaje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase = "";
        System.out.println("Ingresa una frase: ");
        frase = leer.nextLine();
        System.out.println("La frase en mayuscula es: "+(frase.toUpperCase()));
        System.out.println("La frase en minuscula es: "+(frase.toLowerCase()));
    }
    
}
