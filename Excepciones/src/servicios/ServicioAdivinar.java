/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el carácter fallido como un intento.
 *
 * @author USER
 */
public class ServicioAdivinar {

    Scanner leer = new Scanner(System.in);

    public boolean Juego(int numr)throws InputMismatchException {
        try{ 
        boolean ganador = false;
        
        System.out.println("Ingresa un numero entre 1 y 500");
        int numusuario = leer.nextInt();
        if (numusuario > numr) {
            System.out.println("El numero ingresado es mayor al numero que vas a adivinar ");
        } else if (numusuario < numr) {
            System.out.println("El numero ingresado es menor al numero que vas a adivinar ");
        } else {
            System.out.println("Adivinaste!!!");
            ganador = true;
        }
        return ganador;
        }catch (InputMismatchException ex) {
            throw ex;
        }

    }
}
