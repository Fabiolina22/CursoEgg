/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.comparadores;



/**





• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 * @author USER
 */
public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Peliculas crearPelicula(){
       Peliculas peli = new Peliculas();
        System.out.println("Ingrese el Titúlo de la pelicula");
        peli.setTitulo(leer.next());
        System.out.println("Ingrese el Director de la pelicula");
        peli.setDirector(leer.next());
        System.out.println("Ingrese el tiempo de duracion de la pelicula en horas");
        peli.setDuracion(leer.nextDouble());
        return peli;
        
    }
    public void Menu(){
        ArrayList <Peliculas> pelicula = new ArrayList();
        int op = 0;
        
        do {
            
            pelicula.add(crearPelicula());
            System.out.println("¿Desea ingresar otra pelicula? 1--> si o 2--> no");
            op = leer.nextInt();
            while (op!=2 && op!=1){
                System.out.println("Ingrese una opcion valida 1--> si o 2--> no");
                op=leer.nextInt();
            }
            
        } while (op!=2);
        System.out.println("las peliculas ingresadas son:");
        MostrarPeliculas(pelicula);
        System.out.println("las peliculas que tienen duracion mayor a 1 hora son:");
        MostrarPelisLargas(pelicula);
        OrdenarPelis(pelicula);
    }
    public void MostrarPeliculas(ArrayList <Peliculas> pelicula){
        for (Peliculas peliculas : pelicula) {
            System.out.println(peliculas.toString());
        }
    }
    public void MostrarPelisLargas(ArrayList <Peliculas> pelicula){
       for (Peliculas peli : pelicula) {
           if (peli.getDuracion()> 1) {
               System.out.println(peli.toString());
           }
           
            
        } 
       
    }
    public void OrdenarPelis(ArrayList <Peliculas> pelicula){
        System.out.println("Orden de menor a mayor");
        Collections.sort(pelicula,comparadores.ordsch);
        for (Peliculas peliculas : pelicula) {
            System.out.println(peliculas);
        }
        System.out.println("Orden de mayor a menor");
        Collections.sort(pelicula, comparadores.ordasch);
        for (Peliculas peliculas : pelicula) {
            System.out.println(peliculas);
        }
        System.out.println("Orden alfabetico por Titulo");
        Collections.sort(pelicula,comparadores.ordTit);
         for (Peliculas peliculas : pelicula) {
            System.out.println(peliculas);
        }
        System.out.println("Orden alfabetico por Director");
        Collections.sort(pelicula,comparadores.ordDir);
        for (Peliculas peliculas : pelicula) {
            System.out.println(peliculas);
        }
    }
    
  
    
}
