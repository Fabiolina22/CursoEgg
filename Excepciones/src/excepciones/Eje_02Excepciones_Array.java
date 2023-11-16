/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;



/**
 *
 * @author USER
 */
public class Eje_02Excepciones_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String personas [] = {"Fran","Mario","Fabio"};
     try{
         System.out.println("el nombre de la persona en la posicion 3 es: "+ personas[3]);
     }catch(Exception e){
         System.out.println("ERROR, Intentaste buscar un indice que no existe");
     }
    }
    
}
