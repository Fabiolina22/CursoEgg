/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import ENTIDADES.Perro;
import ENTIDADES.Person;



/**
 *
 * @author USER
 */
public class Relaciones_ejAp01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro per1 = new Perro("Simon","Beagle",14,"pequeño");
        Perro per2 = new Perro("Bruno","poddle",9,"pequeño");
        Person p1 = new Person("Fabio","Linares",29,254698,per1);
        Person p2 = new Person("Rocio","Linares",33,456987,per2);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
