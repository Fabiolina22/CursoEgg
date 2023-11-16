/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ServicioCircunferencia {
    public void CrearCircunferencia (Circunferencia circulo1){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el nuevo radio:");
        circulo1.setRadio(leer.nextDouble());
    }
    public void Area (Circunferencia circulo1){
        System.out.println("El area es: "+(3.14*circulo1.getRadio()));
        
        
    }
    public void Perimetro (Circunferencia circulo1){
        System.out.println("El Perimetro es: "+(2*3.14*circulo1.getRadio()));
    }
        
      
}
