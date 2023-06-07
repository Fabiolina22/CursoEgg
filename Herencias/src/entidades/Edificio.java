/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;
    protected Scanner leer = new Scanner(System.in);

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    

    
    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();
}
