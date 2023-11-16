/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

import Enums.Numero;
import Enums.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 *
 * @author USER
 */
public class Baraja {

    private ArrayList<Carta> carta;
    private ArrayList<Carta> mazoEliminado;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> carta, ArrayList<Carta> mazoEliminado) {
        this.carta = carta;
        this.mazoEliminado = mazoEliminado;
    }

    public ArrayList<Carta> getCarta() {
        return carta;
    }

    public void setCarta(ArrayList<Carta> carta) {
        this.carta = carta;
    }

    public ArrayList<Carta> getMazo() {
        return mazoEliminado;
    }

    public void setMazo(ArrayList<Carta> mazoEliminado) {
        this.mazoEliminado = mazoEliminado;
    }

    public void CrearBaraja() {
        carta=new ArrayList<>();
        mazoEliminado = new ArrayList<>();
        for (Numero num : Numero.values()) {
            for (Palos palo : Palos.values()) {
                carta.add(new Carta(num, palo));
            }

        }
    }

    public void Barajar() {
        Collections.shuffle(carta);
        for (Carta carta1 : carta) {
            System.out.println(carta1);
        }
    }

    public void SiguienteCarta() {
        
        System.out.println(carta.get(0));
        mazoEliminado.add(carta.get(0));
        carta.remove(0);
    }

    public void CartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles es: ");
        System.out.println(carta.size());
    }

    public void DarCartas() {
        System.out.println("ingrese la cantidad de cartas que quiere dar:");
        int cant = leer.nextInt();
        if (carta.size() >= cant) {
            for (int i = 0; i < cant; i++) {
                SiguienteCarta();
            }
        } else {
            System.out.println("la cantidad de cartas de la baraja no alcanza");
        }
    }
    
    public void Monton(){
        if (mazoEliminado.isEmpty()) {
            System.out.println("Aún no ha salido ninguna carta");
            
        }else{
            for (Carta mazo1 : mazoEliminado) {
                System.out.println(mazo1);
            }
        }
          
    }
   
    public void MostrarBaraja(){
        for (Carta carta1 : carta) {
            System.out.println(carta1);
        }
    }
}
