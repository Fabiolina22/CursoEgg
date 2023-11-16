/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Mascota;
import entidades.Peliculas;
import java.util.Comparator;

/**
 *
 * @author USER
 */
public class comparadores {

    public static Comparator<Mascota> ordenasc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t.getRaza().compareTo(t1.getRaza());
        }
    };

    public static Comparator<Mascota> ordendes = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getRaza().compareTo(t.getRaza());
        }
    };
    
    public static Comparator<Peliculas> ordTit = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
             
    };
    public static Comparator<Peliculas> ordDir = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
             
    };
    public static Comparator<Peliculas> ordasch = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return Double.compare(t1.getDuracion(), t.getDuracion());
        }
             
    };
    public static Comparator<Peliculas> ordsch = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return Double.compare(t.getDuracion(), t1.getDuracion());
        }
    };
}
