/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Tiempo;
import Servicios.TiempoServicios;

/**
 *
 * @author USER
 */
public class PooEjEXT02_Horas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tiempo tiempo = new Tiempo();
        TiempoServicios servicios = new TiempoServicios();
        servicios.ImprimirHoraCompleta();
    }
    
}
