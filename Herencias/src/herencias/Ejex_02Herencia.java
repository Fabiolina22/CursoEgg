/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Ejex_02Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Edificio> edificios  = new ArrayList();
        Polideportivo p1 = new Polideportivo(true, 12, 25, 17);
        Polideportivo p2 = new Polideportivo(false, 10, 21, 16);
        EdificioDeOficinas e1 = new EdificioDeOficinas(5, 10, 3, 15, 25, 10);
        EdificioDeOficinas e2 = new EdificioDeOficinas(5, 15, 8, 18, 30, 20);
    }
    
}
