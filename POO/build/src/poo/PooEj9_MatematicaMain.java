/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Matematica;
import Servicios.MatematicaServicios;
import java.util.Scanner;

/**
 *Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 * @author USER
 */
public class PooEj9_MatematicaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        Matematica num1 = new Matematica();
        MatematicaServicios mate = new MatematicaServicios();
        num1.setNumero1((int) (Math.random()*10));
        num1.setNumero2((int) (Math.random()*10));
        System.out.println("el numero mayor es "+mate.devolverMayor(num1));
        System.out.println("el numero menor es "+mate.devolverMenor(num1));
        System.out.println("el numero mayor elevado a la potencia del numero menor es "+mate.calcularPotencia(num1));
        System.out.println("la raiz cuadrada de el numero menor es "+mate.calculaRaiz(num1));
    }
    
}
