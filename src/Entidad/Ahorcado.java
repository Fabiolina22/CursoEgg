/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 * @author USER
 */
public class Ahorcado {
    private final String lista [] = {"PERRO", "LAPIZ", "ORDENADOR", "TECLADO", "PROCESADOR", "SISTEMA", "INTERFAZ", "UNIX", "PROGRAMA", "DISCO", "CONECTOR", "CABLEADO", "ALMOHADILLA", "VENTANA", "JERSEY", "CAMISETA", "PANTALON", "RECREO", "MONITOR", "BOCADILLO" };
    Random azar = new Random();
    private final int palabra = azar.nextInt();
    //private String buscar[] = lista [palabra];
}
