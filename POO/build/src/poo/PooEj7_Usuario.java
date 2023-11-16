/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Persona1;
import Servicios.Persona1Servicios;

/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos:
 * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el
 * alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se
 * implementarán son:  Un constructor por defecto.  Un constructor con todos
 * los atributos como parámetro.  Métodos getters y setters de cada atributo. 
 * Metodo crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 *  Método calcularIMC(): calculara si la persona está en su peso ideal (peso
 * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 *  Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. A continuación, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad. Por último,
 * guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables, para después en el main, calcular un porcentaje de esas
 * 4 personas
 *
 * cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
 * encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
 * cuantos menores
 *
 * @author USER
 */
public class PooEj7_Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona1 persona = null;
        Persona1Servicios serviper = new Persona1Servicios();
        
            serviper.MayorDeEdad(persona);
        
        
        

        
        

        double menorPeso = 0, pesoIdeal = 0, mayorPeso = 0, mayorEdad = 0, menorEdad = 0;

        Persona1[] personas = new Persona1[4];

        for (int i = 0; i < personas.length ; i++) {

            personas[i] = serviper.CrearPersona();
            int imc = serviper.CalcularIMC(personas[i]);

            if (imc == -1) {
                menorPeso++;
            } else if (imc == 0) {
                pesoIdeal++;
            } else {
                mayorPeso++;
            }
            boolean edad = serviper.MayorDeEdad(personas[i]);
            if (edad) {
                mayorEdad++;
            } else {
                menorEdad++;
            }
            System.out.println(serviper.CalcularIMC(personas[i]));
        }
        

        System.out.println("Hay " + menorPeso + " con bajo peso, " + pesoIdeal + " con peso ideal y " + mayorPeso + " con sobre peso.");
        System.out.println("Hay " + mayorEdad + " personas mayores y " + menorEdad + " personas menores de edad.");
    }

}
