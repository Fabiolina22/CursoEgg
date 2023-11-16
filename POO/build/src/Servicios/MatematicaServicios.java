/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Matematica;

/**
 *
 * @author USER
 */
public class MatematicaServicios {
    Matematica mate = new Matematica();

    public double devolverMayor(Matematica mate) {
        //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
       double num1 = mate.getNumero1();
       double num2 = mate.getNumero2();
       return Math.max(num2, num1);

    }
    public double devolverMenor(Matematica mate) {
        //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
       double num1 = mate.getNumero1();
       double num2 = mate.getNumero2();
       return Math.min(num2, num1);

    }

    public double calcularPotencia(Matematica mate) {
        //b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
        //elevado al menor número. Previamente se deben redondear ambos valores.
        long min = Math.round(devolverMenor(mate));
        long max = Math.round(devolverMayor(mate));
        return Math.pow(max , min);

    }

    public double calculaRaiz(Matematica mate) {
        //c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
        
        return Math.sqrt(Math.abs(devolverMenor(mate)));
        

    }

   
}
