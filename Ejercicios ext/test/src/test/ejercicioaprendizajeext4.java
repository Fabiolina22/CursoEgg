/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ejercicioaprendizajeext4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner  (System.in);
        System.out.println("ingrese un numero de 1 a 10: ");
        int numero = leer.nextInt();
        switch(numero){
            case 1: {
                System.out.println("el numero "+numero+" es I en romanos");
                break;
            }
            case 2: {
                System.out.println("el numero "+numero+" es II en romanos");
                break;
            }
            case 3: {
                System.out.println("el numero "+numero+" es III en romanos");
                break;
            }
            case 4: {
                System.out.println("el numero "+numero+" es IV en romanos");
                break;
            }
            case 5: {
                System.out.println("el numero "+numero+" es V en romanos");
                break;
            }
            case 6: {
                System.out.println("el numero "+numero+" es VI en romanos");
                break;
            }
            case 7: {
                System.out.println("el numero "+numero+" es VII en romanos");
                break;
            }
            case 8: {
                System.out.println("el numero "+numero+" es VIII en romanos");
                break;
            }
            case 9: {
                System.out.println("el numero "+numero+" es IX en romanos");
                break;
            }
            case 10: {
                System.out.println("el numero "+numero+" es X en romanos");
                break;
            }
            default: {
                System.out.println("el numero es incorrecto");
            }
            
            

                
        }
                
                
    
    }
}
