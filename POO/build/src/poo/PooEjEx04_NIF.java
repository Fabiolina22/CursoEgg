/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.NIF;
import Servicios.NFIServicios;

/**
 *
 * @author USER
 */
public class PooEjEx04_NIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NFIServicios servicios = new NFIServicios();
        NIF letra = servicios.crearNif();
        servicios.Mostrar(letra);
        
    }
    
}
