/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import servicios.DivisionNumero;

/**
 *
 * @author USER
 */
public class Eje_03Excepciones_Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DivisionNumero div = new DivisionNumero();
        try {
        System.out.println("Ingrese un numero");
        
        int nu = leer.nextInt();

        System.out.println("Ingrese otro numero ");
        String num = leer.next();
        
            div.setNum1((nu));

            div.setNum2(Integer.parseInt(num));
        } catch (NumberFormatException e) {
            System.out.println("ERROR! Ingrese un caracter valido, solo numeros");
        }catch(InputMismatchException im){
            System.out.println("Error al ingresar valores por teclado ");
        }
        
        div.Division();
    }

}
