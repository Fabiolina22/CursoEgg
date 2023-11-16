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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese una opcion para elegir la bomba");
        System.out.println(" ** opcion: 1- Agua 2- Gasolina 3- Hormigon 4- Pasta Alimenticia ** ");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("La bomba es una bomba de Agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de Gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de Hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de Pasta Alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para este tipo de bomba");
                break;
        }
    }
}
    

