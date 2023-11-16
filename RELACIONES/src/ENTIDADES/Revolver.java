/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

/**
 *
 * @author USER
 */
public class Revolver {
    private int posicionAgua;
    private int posicionActual;

    public Revolver() {
    }

    public Revolver(int posicionAgua, int posicionActual) {
        this.posicionAgua = posicionAgua;
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionAgua=" + posicionAgua + ", posicionActual=" + posicionActual + '}';
    }
      public void llenarRevolver(){
        posicionActual = 1;
        posicionAgua = (int)(Math.random()*6+1);
        
    }
      public boolean Mojar(Revolver rev){
        boolean mojado = false;
        if (posicionActual==posicionAgua) {
            mojado = true;
        }
        return mojado;
        
    }
    public void siguientechorro(Revolver rev){
        posicionActual++;
    }
}
