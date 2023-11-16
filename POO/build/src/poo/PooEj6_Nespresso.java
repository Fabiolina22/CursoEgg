/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Cafetera;

import Servicios.CafeteraServicios;

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
public class PooEj6_Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Scanner leer = new Scanner(System.in);
        Cafetera cafe = new Cafetera();
        CafeteraServicios sercaf = new CafeteraServicios();

        int opcion;

        do {
            System.out.println("---------------------");
            System.out.println("MENU");
            System.out.println("1 - Llenar cafetera");
            System.out.println("2 - Servir taza");
            System.out.println("3 - Vaciar cafetera");
            System.out.println("4 - Agregar café");
            System.out.println("5 - SALIR");
            System.out.println("---------------------");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sercaf.LlenarCafetera(cafe);
                    break;
                case 2:
                    sercaf.ServirTaza(cafe);
                    break;
                case 3:
                    sercaf.VaciarCafetera(cafe);
                    break;
                case 4:
                    sercaf.AgregarCafe(cafe);
                    break;
                case 5:
                    System.out.println("Saliendo . . . .");
                    break;
                
                default:
                    System.out.println("Error al elegir una opcion. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }
}
