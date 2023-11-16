/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 * @author USER
 */
public class NFIServicios {
    Scanner leer = new Scanner(System.in);
    public NIF  crearNif(){
        NIF letra = new NIF();
        System.out.println("ingrese su número de DNI: ");
        letra.setDNI(leer.nextLong());
        letra.setLetra(CalcularLetra(letra.getDNI()));
        
        return letra;
        
    }
    public String CalcularLetra(long DNI){
        int resto =(int) DNI % 23 ;
        String[] letra = new String[23];
        String palabra = "TRWAGMYFPDXBNJZSQVHLCKE";
        for (int i = 0; i < letra.length; i++) {
            letra[i]= palabra.substring(i, i+1);
        }
        
        return letra[resto];
        
    }
   //  Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//en mayúscula; por ejemplo: 00395469-F).
    public void Mostrar(NIF letra){
        System.out.println(letra.getDNI()+"-"+letra.getLetra());
    }
}
