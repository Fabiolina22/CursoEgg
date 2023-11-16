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
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

   
    public void CrearPerro(ArrayList<Perro> perros, int cant){
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < cant; i++) {
        Perro perro = new Perro();    
        System.out.println("Ingrese el nombre del perro: ");
        perro.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro: ");
        perro.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro: ");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamanio del perro: ");
        perro.setTamaño(leer.next());  
        }
        
    }
     @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamaño=" + tamaño + '}';
    }
}
