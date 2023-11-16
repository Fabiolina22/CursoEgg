/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;


import java.util.HashMap;
import java.util.Scanner;

/**
 *Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 * @author USER
 */
public class TiendaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void menu(){
       HashMap <String,Integer> Tienda = new HashMap(); 
       int op = 0;
        
        
        do {
            System.out.println("---------------------");
            System.out.println("MENU");
            System.out.println("1 - Ingresar producto");
            System.out.println("2 - Cambiar precio");
            System.out.println("3 - Eliminar producto");
            System.out.println("4 - Mostrar productos");
            System.out.println("5 - Salir");
            System.out.println("---------------------");
            op = leer.nextInt();
            switch (op){
                case 1: 
                    CrearProducto(Tienda);
                case 2:
                    
            } 
            
        } while (op !=5);
        
       
    }
    public void CrearProducto(HashMap <String,Integer> Tienda){
        
        System.out.println("Ingrese el nombre del producto y el precio");
        Tienda.put(leer.next(),leer.nextInt());
    }
}
