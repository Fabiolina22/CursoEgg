/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;


import java.util.Date;
import java.util.Scanner;

/**
 *11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 * @author USER
 */
public class Poo_Ej11_Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anio;
        int mes;
        int dia;
        Scanner leer = new Scanner(System.in);
        dia = leer.nextInt();
        mes = leer.nextInt()-1;
        anio=leer.nextInt();
        Date fecha = new Date(anio,mes,dia);
        System.out.println(fecha);
        Date fechaActual = new Date();
        if (fechaActual.getDay()>=fecha.getDay()&&fechaActual.getMonth()>=fecha.getMonth()) {
            
           System.out.println(fechaActual.getYear()-fecha.getYear());
           
        }else{
           System.out.println(fechaActual.getYear()-fecha.getYear()-1); 
        }
        
        

    }

}
