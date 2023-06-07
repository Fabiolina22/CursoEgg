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
public class EdificioDeOficinas extends Edificio {
    protected int oficinas;
    protected int personas;
    protected int numeroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int oficinas, int personas, int numeroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.numeroPisos = numeroPisos;
    }
    
    public void cantPersonas(){
        
        
        System.out.println("Ingrese la cantidad de personas que pueden entrar en cada oficina");
        personas = leer.nextInt();
        System.out.println("ingrese la cantidad de oficinas");
        oficinas = leer.nextInt();
        System.out.println("ingrese la cantidad de pisos que tiene el edificio");
        numeroPisos = leer.nextInt();
        System.out.println("la cantidad de personas por piso es: " + personas * oficinas );
        System.out.println("la cantidad de personas en el edificio es " + personas * oficinas * numeroPisos);
        
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
