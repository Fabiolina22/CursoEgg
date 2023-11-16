/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author USER
 */
public class Ejercicioaprendizaje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese la cantidad de euros que desea convertir: ");
        double euros = leer.nextDouble();
        System.out.println("Elija la moneda a la que quiere convertir: ");
        System.out.println("libras");
        System.out.println("dolares");
        System.out.println("yenes");
        String moneda = leer.next();
      
        ConvierteMoneda (euros, moneda);
        
    }
     public static void ConvierteMoneda (double euros, String moneda){
        switch (toLowerCase(moneda)){
            case "libras": {
                double r = euros * 0.86;
                System.out.println("el resultado es: "+r+" libras");
                break;
            }
            case "dolares": {
                double r = euros * 1.28611;
                System.out.println("el resultado es: "+r+" dolares");
                break;
            }
            case "yenes":{
                double r = euros * 129.852;
                System.out.println("el resultado es: "+r+" yenes");
                break;
            }
            default: {
                System.out.println("moneda ingresada incorrecta");
            }
                
        }

}
    
}
