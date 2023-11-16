/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Juego {
    private ArrayList<Juga> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Juga> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Juga> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Juga> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
  
    public int crearJuego(Revolver rev){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Juego juego1 = new Juego();
        ArrayList <Juga> jugadores2 = new ArrayList<Juga>();
        String nombre;
        System.out.println("ingrese la cantidad de jugadores entre 1 - 6");
        int cant = leer.nextInt();
        while (6<cant){
            System.out.println("Error, ingrese un valor entre 1 - 6");
            cant=leer.nextInt();
        } 
            
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre del jugador ");
            nombre = leer.next();
            Juga j1 = new Juga();
            j1.setId(i+1);
            j1.setNombre(nombre);
            jugadores2.add(j1);
        }
         for (Juga juga : jugadores2) {
                System.out.println(juga.toString());
            }
        jugadores = jugadores2;
        return cant;
        
    }
//       • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
     public void Ronda(Revolver rev,Juego jugador1){
        
         System.out.println("----------------");
        System.out.println("Comienza el juego.");
        ArrayList<Juga> jugadores3 = jugadores;
        boolean fin = false;
         do {
            for (Juga jugadore : jugadores3) {
               
               if (jugadore.disparo(rev)==true) {
                   System.out.println("Juego finalizado");
                    fin = true;
                   break;
               }
               
           } 
         } while (fin != true);
           System.out.println("los jugadores tienen el siguiente status");
           for (Juga jugadore : jugadores3) {
               System.out.println(jugadore.toString());
        }  
   }
}
