/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicioaprendizaje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos: ");
        String letra = null;
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int result = 0;
        double result2 = 0;
        int opcion = 0;
        do {
            System.out.println("Elija una opcion: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    result = num1 + num2;
                    System.out.println("la suma de " + num1 + " y " + num2 + " es " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("la resta de " + num1 + " y " + num2 + " es " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("la multiplicacion de " + num1 + " y " + num2 + " es " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No es posible realizar esta operación");
                    } else {
                        System.out.println("la multiplicacion de " + num1 + " y " + num2 + " es " + result);
                    }

                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    letra = leer.next();
            } 
        }while ("N".equalsIgnoreCase(letra));
    }
    
}
