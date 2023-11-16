/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

/**
 * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que
 * tiene la frase ingresada. b) Método invertirFrase(), deberá invertir la frase
 * ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
 * Salida: "acnalb asac". c) Método vecesRepetido(String letra), recibirá un
 * carácter ingresado por el usuario y contabilizar cuántas veces se repite el
 * carácter en la frase, por ejemplo: d) Entrada: frase = "casa blanca". Salida:
 * El carácter 'a' se repite 4 veces. e) Método compararLongitud(String frase),
 * deberá comparar la longitud de la frase que compone la clase con otra nueva
 * frase ingresada por el usuario. f) Método unirFrases(String frase), deberá
 * unir la frase contenida en la clase Cadena con una nueva frase ingresada por
 * el usuario y mostrar la frase resultante. g) Método reemplazar(String letra),
 * deberá reemplazar todas las letras “a” que se encuentren en la frase, por
 * algún otro carácter seleccionado por el usuario y mostrar la frase
 * resultante. h) Método contiene(String letra), deberá comprobar si la frase
 * contiene una letra que ingresa el usuario y devuelve verdadero si la contiene
 * y falso si no.
 *
 * @author USER
 */
public class CadenaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ;

    public void MostrarVocales(Cadena cadena) {
        int vocal = 0;
        char letra;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = cadena.getCadena().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocal++;

            }
        }
        System.out.println("la cantidad de vocales es " + vocal);
    }

    public void InvertirFrase(Cadena cadena) {
        String frase = "", frase1 = cadena.getCadena() + "";

        for (int i = cadena.getLongitud(); i > 0; i--) {

            System.out.print(frase1.substring(i - 1, i));

        }
        System.out.println(" ");
    }

    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    //contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void VecesRepetido(Cadena cadena) {
        char letra;
        System.out.println("Indique la letra a buscar");
        int cant = 0;
        letra = leer.next().charAt(0);
        int posicion = cadena.getCadena().indexOf(letra);
        while (posicion != -1) {
            cant++;

            posicion = cadena.getCadena().indexOf(letra, posicion + 1);
        }

        System.out.println("el caracter '" + letra + "' se encontro " + cant + " veces.");
    }
    //e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.

    public void CompararLongitud(Cadena cadena) {
        System.out.println("ingrese una nueva frase");
        String newfrase = leer.next();
        System.out.println(cadena.getLongitud() + " " + newfrase.length());
        if (newfrase.length() > cadena.getLongitud()) {
            System.out.println("la frase " + newfrase + " es mas larga que la frase " + cadena.getCadena());

        }
        if (cadena.getLongitud() == newfrase.length()) {
            System.out.println("la frase " + cadena.getCadena() + " es igual a " + newfrase);

        } if (cadena.getLongitud()>newfrase.length()) {
            System.out.println("la frase " + cadena.getCadena() + " es mas larga que la frase " + newfrase);
        }
 
            
        
    }

    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void UnirFrase(Cadena cadena) {
        System.out.println("ingrese una frase ");
        String frase = leer.next();
        System.out.println(cadena.getCadena().concat(frase));
    }

    //g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
    //public void Reemplazar(Cadena cadena){
      //  System.out.println("Ingrese una letra para reemplazar la letra 'a' en la frase");
        //char letra = leer.next().charAt(0);
        //for (int i = 0; i < cadena.getLongitud(); i++) {
          //  if (cadena.getCadena().substring(i, i+1).equals('a')) {
               // System.out.println(i);
                
           // }
            
        //}
    //}
    public String Reemplazar(Cadena cadena){
        Scanner lire = new Scanner(System.in);
        System.out.println("Ingrese un caracter cualquiera a ser cambiado");
        String car2=lire.nextLine();
        String cambio= cadena.getCadena().replace("a",car2);
        System.out.println("La nueva frase es: "+cambio);
       return cambio;
    }            
    //h) Método contiene(String letra), deberá comprobar si la frase
 //* contiene una letra que ingresa el usuario y devuelve verdadero si la contiene
 //* y falso si no.
    public void Contiene(Cadena cadena){
        System.out.println("ingrese la letrra que quiere buscar");
        char letra = leer.next().charAt(0);
        if (cadena.getCadena().contains(Character.toString(letra))){
            System.out.println("si contiene la letra");
            
        }else{
            System.out.println("no contiene la letra");
        }
        
    }
}
