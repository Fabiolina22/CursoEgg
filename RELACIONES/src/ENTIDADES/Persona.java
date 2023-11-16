/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

/**
 *
 * @author USER
 */
public class Persona {
    private Dni numero;
    private String nombre;
    private String apellido;

    @Override
    public String toString() {
        return "PERSONA{" + "numero=" + numero + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public Dni getNumero() {
        return numero;
    }

    public void setNumero(Dni numero) {
        this.numero = numero;
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

    public Persona(Dni numero, String nombre, String apellido) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona() {
    }
    
}
