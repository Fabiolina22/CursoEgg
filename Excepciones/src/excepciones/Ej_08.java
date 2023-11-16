/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import servicios.Dos;
import servicios.Tres;
import servicios.Uno;

/**
 *
 * @author USER
 */
public class Ej_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Uno u = new Uno();
//        try {
//            System.out.println(u.metodo());
//        } catch (Exception e) {
//            System.err.println(
//                    "Excepcion en metodo() ");
//            e.printStackTrace();
//        }
        Dos d = new Dos();
        try {
            System.out.println(d.metodo());
        } catch (Exception e) {
            System.err.println(" Excepcion en metodo ( ) ");
            e.printStackTrace();
        }
//        Tres t = new Tres();
//        try {
//            System.out.println(t.metodo());
//        } catch (Exception e) {
//            System.err.println("Excepcion en metodo ( ) ");
//            e.printStackTrace();
//        }
    }

}
