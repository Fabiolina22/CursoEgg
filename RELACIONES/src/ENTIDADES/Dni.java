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
public class Dni {
    private int numero;
    private char serie;

    @Override
    public String toString() {
        return "DNI{" + "numero=" + numero + ", serie=" + serie + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public Dni(int numero, char serie) {
        this.numero = numero;
        this.serie = serie;
    }

    public Dni() {
    }
}
