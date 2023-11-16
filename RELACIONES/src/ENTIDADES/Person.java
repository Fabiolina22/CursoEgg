/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

import java.util.ArrayList;
import java.util.Scanner;

/**Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 *
 * @author USER
 */
public class Person {
    private String nombre;
    private String apellido;
    private int edad;
    private long dni;
    private Perro perro;

    public Person() {
    }

    public Person(String nombre, String apellido, int edad, long dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    
    public void CrearPersona(ArrayList<Person> personas,int cant){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < cant; i++) {
        Person per1 = new Person();
        System.out.println("ingrese el nombre de la persona");
        per1.setNombre(leer.next());
        System.out.println("ingrese el apellido de la persona");
        per1.setApellido(leer.next());
        System.out.println("ingrese el dn1 de la persona");
        per1.setDni(leer.nextLong());
        System.out.println("ingrese la edad de la persona");
        per1.setEdad(leer.nextInt());   
        }
        
    }
    public void Eleccion(ArrayList<Person> personas,ArrayList<Perro> perros){
        for (Person per1 : personas) {
           System.out.println("Elija el perro que desea adoptar");
           perros.forEach((e)->System.out.println(e));
        }
        
        
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perro=" + perro + '}';
    }

    
}
