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
public class Lavadora extends Electrodomesticos {
    private int carga;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public void crearLavadora (){
        System.out.println("------------------------------------------");
        System.out.println("ingresa los atributos de la lavadora");
        crearElectrodomestico();
        System.out.println("ingrese la capacidad de carga de la lavadora");
        this.carga = leer.nextInt();
        precioFinal();
    }
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (this.carga > 30 ) {
            this.precio += 500;
        }
        System.out.println("el precio final de la lavadora es "+ this.precio);
        
    }
    
}
