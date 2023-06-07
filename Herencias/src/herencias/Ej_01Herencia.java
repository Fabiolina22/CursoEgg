/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author USER
 */
public class Ej_01Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal p1 = new Perro("Bruno",8,"pienso","poddle");
       p1.Alimentarse();
        Animal p2 = new Perro("Simon",12,"croquetas","beaggle");
       p2.Alimentarse();
        Animal g1 = new Gato("Julieta",3,"atún","angora");
       g1.Alimentarse();
        Animal c1 = new Caballo("Spark",7,"pasto","fino");
       c1.Alimentarse();
    }
    
}
