/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import ENTIDADES.Perro;
import ENTIDADES.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.comparadores;

/**
 *
 * @author USER
 */
public class Relaciones_ejApEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese la cantidad de personas que quieren adoptar un perro");
        int cant = leer.nextInt();
        Person per = new Person();
        Perro p1 = new Perro();
        System.out.println("Ingrese a las personas que quieren adoptar un perro");
        per.CrearPersona(personas, cant);
        System.out.println("Ingrese los candidatos a adoptar");
        p1.CrearPerro(perros, cant);
      
        
    }
    
}
