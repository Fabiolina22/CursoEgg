/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USER
 */
public class Gato extends Animal {

    public Gato(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }

    public Gato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    @Override
    public void Alimentarse(){
        System.out.println("Enlatados");
    }

    
    
    
}
