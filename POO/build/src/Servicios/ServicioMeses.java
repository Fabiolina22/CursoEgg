/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ServicioMeses {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void AdivinarMes(Meses secreto){
        String mes, AdivinarMes = secreto.getSecreto();
        System.out.println("Ingresa un mes");
        mes = leer.next().toLowerCase();
        while(!mes.equalsIgnoreCase(AdivinarMes)){
            System.out.println("Has fallado");
            System.out.println("Intenta nuevamente");
            mes = leer.next().toLowerCase();
            
        }
        System.out.println("!Has acertado¡");
    }
}
