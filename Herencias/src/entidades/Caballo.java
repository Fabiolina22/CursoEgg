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
public class Caballo extends Animal {

    public Caballo(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }



   
    public void Alimentarse(){
        System.out.println("Heno");
    }
}
