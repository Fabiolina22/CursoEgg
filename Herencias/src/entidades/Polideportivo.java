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
public class Polideportivo extends Edificio {
    protected boolean instalacion;

    public Polideportivo() {
    }

    public Polideportivo(boolean instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.instalacion = instalacion;
    }

  

    
    

    @Override
    public double calcularSuperficie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
