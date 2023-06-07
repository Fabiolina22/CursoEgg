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
public class Electrodomesticos {

    protected int precio = 1000;
    protected String color;
    protected char letra;
    protected double peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(int precio, String color, char letra, double peso) {
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public char comprobarConsumoEnergetico(char letra) {
        System.out.println("Ingrese la letra para comprobar el consumo, A y F ");
        this.letra = leer.next().toLowerCase().charAt(0);
        if (this.letra =='a' || this.letra == 'b' || this.letra == 'c' || this.letra == 'd' || this.letra == 'e') {
            System.out.println("usted ingreso " + this.letra);
        } else {
            this.letra = 'f';
        }

        return letra;

    }

    public String comprobarColor(String color) {
        System.out.println("Ingrese el color ");
        this.color = leer.next().toLowerCase();
        if (color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
            System.out.println("el color de su electrodomestico es " + color);
        } else {
            this.color = "blanco";
        }
        return color;

    }

    public void crearElectrodomestico() {
        Electrodomesticos e1 = new Electrodomesticos();
        comprobarConsumoEnergetico(this.letra);
        comprobarColor(color);
        System.out.println("ingrese el peso");
        this.peso = leer.nextDouble();
    
    }

    public void precioFinal() {
        
        switch (this.letra) {
            case 'a':
                this.precio +=  1000;
                break;

            case 'b':
                this.precio +=  800;
                break;

            case 'c':
                this.precio +=  600;
                break;

            case 'd':
                this.precio += 500;
                break;
                
            case 'e':
                this.precio +=  300;
                break;
                
            case 'f':
                this.precio +=  100;
                break;
                

        }
        System.out.println("+consumo = "+this.precio);
        if (this.peso <= 19) {
            this.precio += 100;

        }
        if (this.peso > 19 && this.peso <= 49) {
            this.precio +=   500;
        }
        if (peso > 49 && peso <= 79) {
            this.precio +=   800;
        }
        if (peso > 79) {
            this.precio +=   1000;
        }

        System.out.println("+peso = "+this.precio);

    }
}
