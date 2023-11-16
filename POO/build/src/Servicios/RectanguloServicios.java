/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RectanguloServicios {

    Scanner leer = new Scanner(System.in);

    public Rectangulo CrearRectangulo() {
        Rectangulo numero1 = new Rectangulo();
        System.out.println("Ingrese la altura: ");
        numero1.setAltura(leer.nextFloat());
        System.out.println("Ingrese la base: ");
        numero1.setBase(leer.nextFloat());
        return numero1;

    }

    public void Superficie(Rectangulo sup) {
        System.out.println("la superficie del rectangulo es: " + (sup.getAltura() * sup.getBase()));
    }

    public void Perimetro(Rectangulo per) {
        System.out.println("El perimetro del rectangulo es: " + ((per.getAltura() + per.getBase()) * 2));
    }

    public void Dibujo(Rectangulo rect) {
        for (int i = 0; i < rect.getAltura(); i++) {

            for (int j = 0; j < rect.getBase(); j++) {
                if (i==0||j==0||i==rect.getAltura()-1||j==rect.getBase()-1 ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                

            }

            System.out.println("");

        }

    }

}

