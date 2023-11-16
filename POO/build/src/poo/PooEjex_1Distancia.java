/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Puntos;
import Servicios.PuntosServicios;

/**
 *
 * @author USER
 */
public class PooEjex_1Distancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntosServicios servicio = new PuntosServicios();
        Puntos coor = servicio.crearPuntos();
        servicio.CalcularDistancia(coor);
        
    }
    
}
