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
public class Televisor extends Electrodomesticos{
    private double resolucion;
    private boolean sintonizador;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizador, int precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(){
        System.out.println("--------------------------------------------------");
        System.out.println("ingresa atributos del televisor");
        crearElectrodomestico();
        System.out.println("ingrese la resulucion del televisor en pulgadas ");
        resolucion = leer.nextDouble();
        System.out.println("el televisor tiene sintonizador? si/no");
        String op = leer.next();
        switch (op){
            case "si":
                sintonizador = true;
                break;
                
            case "no":
                sintonizador = false;
                break;
                
        }
        
        precioFinal();
    }
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (this.resolucion>40) {
            this.precio +=  (this.precio * 0.3);
        }
        if (sintonizador) {
            this.precio   +=  500;
        }
        System.out.println("el precio final de su televisor es "+ this.precio);
        
    }
}
