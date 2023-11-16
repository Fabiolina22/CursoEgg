/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda1;

import java.util.Scanner;
import tienda.servicios.TiendaServicio;

/**
 *
 * @author USER
 */
public class Tienda1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaServicio serviceP = new TiendaServicio();

        int op = 0;
        do {
            System.out.println("-------MENU--------");
            System.out.println("1 - Nombre de productos");
            System.out.println("2 - Nombres y precios de los productos");
            System.out.println("3 - Productos entre $120 y $200 ");
            System.out.println("4 - Todos los portatiles");
            System.out.println("5 - Nombre y precio del producto mas barato");
            System.out.println("6 - Ingresar un nuevo producto");
            System.out.println("7 - Ingresar un nuevo fabricante");
            System.out.println("8 - Editar un producto");
            System.out.println("9 - Eliminar un producto");
            System.out.println("10 - Salir");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    serviceP.listarNombreProductos();
                    break;
                case 2:
                    serviceP.precioNombre();
                    break;
                case 3:
                    serviceP.Rango();
                    break;
                case 4:
                    serviceP.Portatil();
                    break;
                case 5:
                    serviceP.Barato();
                    break;
                case 6:
                    serviceP.ingresarProducto();
                    break;
                case 7:
                    serviceP.ingresarFabricante();
                    break;
                case 8:
                    
                    break;
                case 9:
                    serviceP.EliminarProductoCodigo();
                    break;
                case 10:
                    System.out.println("Saliendo. . . .");
                    break;
                default:
                    System.out.println("Error. Vuelva a ingresar una opcion");
                    break;
            }
        } while (op != 10);
    }
}
