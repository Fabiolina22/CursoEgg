/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import entidades.Lavadora;
import entidades.Televisor;
import entidades.Electrodomesticos;


/**
 *
 * @author USERa
 * 
 */
public class Ej_02Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Televisor tv = new Televisor();
       Lavadora lv = new Lavadora();
       tv.crearTelevisor();
       lv.crearLavadora();
       
       
    }
    
}
