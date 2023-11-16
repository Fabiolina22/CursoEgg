/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

/**
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:

 * @author USER
 */
public class PooEj8_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CadenaServicios service = new CadenaServicios();
        Cadena frase = new Cadena();
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase ");
        frase.setCadena(leer.next().toLowerCase());
        frase.setLongitud(frase.getCadena().length());
        System.out.println(frase.getLongitud());
        service.MostrarVocales(frase);
        service.InvertirFrase(frase);
        service.VecesRepetido(frase);
        service.CompararLongitud(frase);
        service.UnirFrase(frase);
        service.Reemplazar(frase);
        service.Contiene(frase);
    }
    
}
