/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USER
 */
public class Libro {
    private String nombre;
    private String autor;
    private String Npaginas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNpaginas() {
        return Npaginas;
    }

    public void setNpaginas(String Npaginas) {
        this.Npaginas = Npaginas;
    }

    public Libro(String nombre, String autor, String Npaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.Npaginas = Npaginas;
    }

    public Libro() {
    }
}
