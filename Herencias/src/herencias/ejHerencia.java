/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import entidades.Animal;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ejHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        animales.add(a);
        animales.add(b);
        animales.add(c);
    }

}
