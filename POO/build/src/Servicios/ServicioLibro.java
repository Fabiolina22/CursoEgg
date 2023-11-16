/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ServicioLibro {
    public void NuevoLibro(Libro libro1){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("ingrese el numero ISBN:");
        libro1.setISBN(leer.nextInt());
        System.out.println("ingrese el nombre del autor:");
        libro1.setAutor(leer.next());
        System.out.println("ingrese el numero de paginas:");
        libro1.setPaginas(leer.nextInt());
    }
    public void MostrarLibro (Libro libro1){
        System.out.println(libro1.toString());
    }
}
