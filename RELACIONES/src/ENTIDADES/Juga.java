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
public class Juga {
    private int id;
    private String nombre;
    private boolean mojado;

    public Juga() {
    }

    public Juga(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado = false;
    }

    public Juga(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Juga{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
     public boolean disparo(Revolver rev){
        mojado=false;
        mojado = rev.Mojar(rev);
        rev.siguientechorro(rev);
        return mojado;
    }
}
