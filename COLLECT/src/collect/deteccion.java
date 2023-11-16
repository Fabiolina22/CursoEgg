/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author USER
 */
public class deteccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        HashMap<Integer, String> personas = new HashMap();
//        String n1 = "Albus";
//        String n2 = "Severus";
//        personas.put((int)(Math.random()*10),n1);
//        personas.put((int)(Math.random()*10),n2);
          ArrayList<String> bebidas = new ArrayList();
          bebidas.add("café");
          bebidas.add("té");
          Iterator<String> it = bebidas.iterator();
        while(it.hasNext()){
        if (it.next().equals("café")){
                it.remove();
            }
            
        }
            
    }

}
