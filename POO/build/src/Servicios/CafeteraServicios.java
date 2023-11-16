/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera).
 * Implemente, al menos, los siguientes métodos:  Constructor predeterminado o
 * vacío  Constructor con la capacidad máxima y la cantidad actual
 *
 *  Métodos getters y setters.  Método llenarCafetera(): hace que la cantidad
 * actual sea igual a la capacidad máxima.  Método servirTaza(int): se pide el
 * tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la
 * acción de servir la taza con la capacidad indicada. Si la cantidad actual de
 * café “no alcanza” para llenar la taza, se sirve lo que quede. El método le
 * informará al usuario si se llenó o no la taza, y de no haberse llenado en
 * cuanto quedó la taza.  Método vaciarCafetera(): pone la cantidad de café
 * actual en cero.  Método agregarCafe(int): se le pide al usuario una cantidad
 * de café, el método lo recibe y se añade a la cafetera la cantidad de café
 * indicada.
 *
 * @author USER
 */
public class CafeteraServicios {

    Scanner leer = new Scanner(System.in);

    public void LlenarCafetera(Cafetera llenado) {
        
        
        llenado.setCantidadActual (llenado.getCapacidadMaxima());
        System.out.println("la cafetera esta llena!" + llenado.getCantidadActual() + "ml ");
        

    }

    public void ServirTaza(Cafetera llenado) {
        System.out.println("Ingrese el tamaño de la taza que desea servir:");
        int tamanotaza = leer.nextInt();

        if (llenado.getCantidadActual()>=tamanotaza) {
            llenado.setCantidadActual((llenado.getCantidadActual() - tamanotaza));
            System.out.println("La taza ha sido llenada! vuelva pronto!");
            System.out.println("la cantidad de cafe que hay en la cafetera es "+llenado.getCantidadActual());
        } else {
            System.out.println("la taza ha sido llenada hasta " + llenado.getCantidadActual());
            
        }

    }
    public void VaciarCafetera (Cafetera llenado){
        llenado.setCantidadActual(0);
        System.out.println("la cafetera ha sido vaciada correctamente");
    }
    public void AgregarCafe (Cafetera llenado){
        System.out.println("digite la cantidad de cafe que va a agregar");
        int cantidadcafe = leer.nextInt();
        llenado.setCantidadActual(llenado.getCantidadActual()+cantidadcafe);
        System.out.println("se ha agregado el cafe correctamente");
        System.out.println("la cantidad de cafe es: "+llenado.getCantidadActual());
    }

}
