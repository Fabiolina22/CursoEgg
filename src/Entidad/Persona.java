/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


/**
 *
 * @author USER
 */
public class Persona {
    public String nombre;
    public Persona (String nombre){
        this.nombre = nombre;
    }
    public int nacimiento;
    
    public String pais;

    public Persona(String nombre, int nacimiento, String pais) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

    public Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public String getPais() {
        return pais;
    }

   public void PersonaNew (Persona trabajador){
       System.out.println(getNombre()+getNacimiento()+getPais() );
   }

}

