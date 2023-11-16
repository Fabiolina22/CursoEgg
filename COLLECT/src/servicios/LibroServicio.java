/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LibroServicio {
     Scanner leer = new Scanner(System.in);
    public Libro LlenarLibro() {
        Libro libro1 = new Libro();
        System.out.println("ingrese nombre, autor y numero de paginas del libro.");
        libro1.setAutor(leer.nextLine());
        libro1.setNombre(leer.nextLine());
        libro1.setNpaginas(leer.nextLine());
        return libro1;
    }
        
}
