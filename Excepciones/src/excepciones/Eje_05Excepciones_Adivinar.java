/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Random;
import servicios.ServicioAdivinar;

/**
 *
 * @author USER
 */
public class Eje_05Excepciones_Adivinar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numr,cont = 0;
       Random random = new Random();
       numr = random.nextInt(500)+1;
        System.out.println(numr);
        System.out.println("Empieza el juego!!!");
       boolean rpta = false;
        
       do {
            
           try{
               ServicioAdivinar ser = new ServicioAdivinar();
           
            rpta = ser.Juego(numr);
            if (!rpta) {
                cont++;
            }
           }catch (InputMismatchException ex) {
               System.out.println("Error ingrese un numero!");
               cont++;
           }
           
            
        } while (!rpta);
        System.out.println("numero de intentos "+cont);
    }
    
}
