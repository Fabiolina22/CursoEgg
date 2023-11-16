/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.DAO_FABRICANTE;
import tienda.persistencia.DAO_PRODUCTO;

/**
 *
 * @author USER
 */
public class TiendaServicio {
    DAO_PRODUCTO DAOP = new DAO_PRODUCTO();
    DAO_FABRICANTE DAOF = new DAO_FABRICANTE();
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
    public void Menu(){
        
    }
    public void listarNombreProductos() throws Exception{
        ArrayList<String> nombres = new ArrayList<String>();
        DAOP.listarTodosLosProductos(nombres);       
        for (String aux : nombres) {
            System.out.println(aux);
        }
        
    }
    public void precioNombre() throws Exception{
        ArrayList<String> nombresprec = new ArrayList<String>();
        DAOP.NombrePrecio(nombresprec);
        for (String aux : nombresprec) {
            System.out.println(aux);
        }
    }
    public void Rango() throws Exception{
        ArrayList<String> rango = new ArrayList<String>();
        DAOP.RangoPrecio(rango);
        for (String aux : rango) {
            System.out.println(aux);
        }
    }
    public void Portatil() throws Exception{
        ArrayList<String> portatil = new ArrayList<String>();
        DAOP.AllPortatil(portatil);
        for (String aux : portatil) {
            System.out.println(aux);
        }
    }
    public void Barato() throws Exception{
        ArrayList<String> producto = new ArrayList<String>();
        DAOP.ProductoBarato(producto);
        for (String aux : producto) {
            System.out.println(aux);
        }
    }
    public void ingresarProducto() throws Exception{
        
        String codigo = "", nombre = "", precio = "", codFab = "";
        codigo = String.valueOf(Integer.parseInt(DAOP.consultarCodigo(codigo))+1);
        System.out.println("Producto N°" + codigo);    
        System.out.println("Ingrese el nombre del producto");
        nombre = leer.next();
        System.out.println("Ingrese el precio del producto");
        precio = leer.next();
        listarNombresFabricantes();
        System.out.println("Ingrese el codigo del fabricante");
        codFab = leer.next();
        String sql = "INSERT INTO producto VALUES(" + codigo + ",'" + nombre + "'," + precio + "," + codFab +");";
        DAOP.ingresarProducto(sql);
    }
    public void listarNombresFabricantes() throws Exception{
        ArrayList<String> nombres = new ArrayList<String>();
        DAOF.listarFabricantes(nombres);       
        for (String aux : nombres) {
            System.out.println(aux);
        }
        
    }
    public void EliminarProductoCodigo() throws Exception {
        String codigo = "";
        System.out.println("Ingrese el codigo del producto");
        codigo = leer.next();
        try {
            if (codigo == null || codigo.trim().isEmpty()) {
                throw new Exception("Indique el codigo del producto a eliminar");
            }

            DAOP.EliminarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }
    }
    public void ingresarFabricante() throws Exception{
        
        String codigo = "", nombre = "";
        codigo = String.valueOf(Integer.parseInt(DAOF.consultarCodigoFabricante(codigo))+1);
        System.out.println("Fabricante N°" + codigo);    
        System.out.println("Ingrese el nombre del fabricante");
        nombre = leer.next();
        String sql = "INSERT INTO fabricante VALUES(" + codigo + ",'" + nombre + "');";
        DAOF.ingresarFabricante(sql);
        listarNombresFabricantes();
    }
    
    
}
