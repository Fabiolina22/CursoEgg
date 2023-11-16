/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Personas;
import java.util.Date;
import java.util.Scanner;

/**
 *Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:



 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 * @author USER
 */
public class PersonasServicios {
    Scanner leer = new Scanner(System.in);
    
    public Personas CrearPersona (){
        Personas persona1 = new Personas();
        int dia;
        int mes;
        int anio;
        System.out.println("ingrese el nombre");
        
        persona1.setNombre(leer.next());
        System.out.println("ingrese la fecha de nacimiento");
        System.out.println("ingrese el dia");
        dia = leer.nextInt();
        System.out.println("ingrese el mes");
        mes=leer.nextInt()-1;
        System.out.println("ingrese el año");
        anio = leer.nextInt()-1900;
        Date fecha = new Date (anio,mes,dia);
        persona1.setFecha(fecha);
        return persona1 ;
        
    }
    public int CalcularEdad(Personas persona1){
        Date fechaActual = new Date();
        int edad=0;
        //System.out.println(fechaActual.getDay()+" "+persona1.getFecha().getDay());
        if (fechaActual.getDay()>=persona1.getFecha().getDay()) {
            if (fechaActual.getMonth()>=persona1.getFecha().getMonth()) {
                edad = fechaActual.getYear()-persona1.getFecha().getYear();
            }
            
        }else{
          edad =  fechaActual.getYear()-persona1.getFecha().getYear()-1; 
        }
        System.out.println("la edad de la persona es: "+edad);
        return edad;
    }
    
    public boolean menorQue (int edad,Personas persona1){
        boolean respuesta = false;
        int edad2;
        System.out.println("ingrese la edad de alguien más para saber si es menor que "+persona1.getNombre());
        edad2=leer.nextInt();
        if (edad2<edad) {
            respuesta = true;
        }
        return respuesta;
        
    }
    public void MostrarPersona(Personas persona1){
        System.out.println(persona1.toString()); 
    }
    
}
