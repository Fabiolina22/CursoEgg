/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ServiciosOperacion {
    public void CrearOperacion (Operacion inicio){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros: ");
        inicio.setNumero1(leer.nextFloat());
        inicio.setNumero2(leer.nextFloat());
    }
    public void Adicion (Operacion suma){
        System.out.println("la suma de los numeros es: "+(suma.getNumero1()+suma.getNumero2()));
    }
     public void Sustraccion (Operacion resta){
        System.out.println("la resta de los numeros es: "+(resta.getNumero1()-resta.getNumero2()));
    }
      public void Mult (Operacion Multiplica){
        if (Multiplica.getNumero1()==0 || Multiplica.getNumero2()==0 ){
            System.out.println("ERROR! el resultado es igual a 0");
        }else{
             System.out.println("la multiplicación de los numeros es: "+(Multiplica.getNumero1()*Multiplica.getNumero2()));
        } 
                          
      
    }
      public void Division (Operacion divide){
        if (divide.getNumero1()==0 || divide.getNumero2()==0 ){
            System.out.println("ERROR! el resultado es igual a 0");
        }else{
             System.out.println("la división de los números es: "+(divide.getNumero1()/divide.getNumero2()));
        } 
    }
            
}
