/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import ENTIDADES.Equipo;
import ENTIDADES.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Relaciones_ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Jugador> jugadores = new ArrayList();
        Equipo e1 = new Equipo();
        System.out.println("Ingrese el nombre del equipo");
        e1.setNombre(leer.next());
        for (int i = 0; i < 3; i++) {
            Jugador j1 = new Jugador();
            
            System.out.println("Ingrese el nombre del jugador");
            j1.setNombre(leer.next());
            System.out.println("Ingrese el apellido del jugador");
            j1.setApellido(leer.next());
            System.out.println("Ingrese el posicion del jugador");
            j1.setPosicion(leer.next());
            System.out.println("Ingrese el numero del jugador");
            j1.setNumero(leer.nextInt());
            jugadores.add(j1);
        }
        System.out.println("Los jugadores del equipo "+e1.getNombre()+ " son ");
        System.out.println(jugadores.toString());
    }
    
}
