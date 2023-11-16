/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

import Enums.Numero;
import Enums.Palos;

/**
 *
 * @author USER
 */
public class Carta {
    private Numero numero;
    private Palos palo;

    public Carta(Numero numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Carta() {
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
}
