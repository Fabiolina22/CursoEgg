/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import ENTIDADES.Dni;
import ENTIDADES.Persona;

/**
 *
 * @author USER
 */
public class Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        p1.setNombre("Fabio");
        p1.setApellido("Linares");
        p1.setNumero(new Dni(123, 'f'));
        System.out.println(p1.toString());
    }
    
}
