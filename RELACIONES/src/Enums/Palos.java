/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author USER
 */
public enum Palos {
    
    ESPADA("Espada"),COPAS("Copas"),BASTOS("Bastos"),ORO("Oro");
    private String palo;

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    private Palos(String palo) {
        this.palo = palo;
    }

}
