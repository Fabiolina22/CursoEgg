/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Puntos;
import java.util.Scanner;

/**
 * Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
 *
 * @author USER
 */
public class PuntosServicios {
    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {
        Puntos puntos1 = new Puntos();
        System.out.println("Ingresa la cordenada de x1");
        puntos1.setX1(leer.nextInt());
        System.out.println("Ingresa la cordenada de x2");
        puntos1.setX2(leer.nextInt());
        System.out.println("Ingresa la cordenada de y1");
        puntos1.setY1(leer.nextInt());
        System.out.println("Ingresa la cordenada de y2");
        puntos1.setY2(leer.nextInt());
        return puntos1;

    }
//    a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos.
    public double CalcularDistancia (Puntos puntos){
       
       double distancia = Math.sqrt(Math.pow((puntos.getX2()-puntos.getX1()), 2)+Math.pow(puntos.getY2()-puntos.getY1(), 2));
        System.out.println("la distancia entre los puntos es: "+distancia);
        return distancia;
       
    }
}
