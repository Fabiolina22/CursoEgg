/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import ENTIDADES.Person;
import java.util.Comparator;

/**
 *
 * @author USER
 */
public class comparadores {
    public static Comparator <Person> ordenas = new Comparator<Person>(){
        @Override
        public int compare(Person t, Person t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
        
    };
}
