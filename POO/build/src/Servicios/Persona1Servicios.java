/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona1;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Persona1Servicios {

    Scanner leer = new Scanner(System.in);

    public Persona1 CrearPersona() {
        Persona1 usuario = new Persona1();
        System.out.println("Ingrese su nombre: ");
        usuario.setNombre(leer.next());
        System.out.println("ingrese su edad: ");
        usuario.setEdad(leer.nextInt());
        System.out.println("elija su sexo: H(hombre), M (mujer), O(otro)");
        usuario.setSexo(leer.next().charAt(0));
        while (usuario.getSexo() != 'H' && usuario.getSexo() != 'M' && usuario.getSexo() != 'O'&& usuario.getSexo() != 'h' && usuario.getSexo() != 'm' && usuario.getSexo() != 'o') {
            System.out.println("Introduce el Sexo de nuevo");
            usuario.setSexo(leer.next().charAt(0));
        }
        System.out.println("Ingrese su peso en kg: ");
        usuario.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura en metros");
        usuario.setAltura(leer.nextDouble());
        return usuario;
       


    }
    public int CalcularIMC (Persona1 usuario){
        int cont = 0;
       
        double IMC = (usuario.getPeso()/(usuario.getAltura()*usuario.getAltura()));
        if (IMC < 20) {
            cont = -1;
            
        }
        if (IMC>20 && IMC<25) {
            cont = 0;
            
        }
        if (IMC>25) {
            cont=1;
            
        }
        return cont;
        
    }
    public boolean MayorDeEdad (Persona1 usuario){       
        
        try{
            if (usuario.getEdad()>18) {
            return true;
            
        }
        }catch(Exception e){
            System.out.println("la persona no se encontro ");
        }   
        return false;
         
        
        
    }
    
}
