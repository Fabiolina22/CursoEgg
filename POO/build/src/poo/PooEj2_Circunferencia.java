/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Circunferencia;
import Servicios.ServicioCircunferencia;
import java.util.Scanner;

/**Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 *
 * @author USER
 */
public class PooEj2_Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia:");
        Circunferencia radio1 = new Circunferencia (leer.nextDouble());
        ServicioCircunferencia circulo1 = new ServicioCircunferencia();
        circulo1.CrearCircunferencia(radio1);
        circulo1.Area(radio1);
        circulo1.Perimetro(radio1);
        
    }
    
}
