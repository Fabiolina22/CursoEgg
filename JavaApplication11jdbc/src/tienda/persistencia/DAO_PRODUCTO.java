/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class DAO_PRODUCTO extends DAO {
    public void listarTodosLosProductos(ArrayList<String> nombres) throws Exception {
        try {
            String sql = "SELECT codigo, nombre FROM producto";
            consultarBase(sql);
            
            while (result.next()) {
                nombres.add( result.getString("codigo") + result.getString("nombre"));
            }
            desconectarBase();
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    public void NombrePrecio(ArrayList<String> nombresprec) throws Exception{
        try {
            String sql = "SELECT nombre, precio FROM producto";
            consultarBase(sql);
            
            while (result.next()) {
                nombresprec.add(result.getString("nombre")+"-------- $ "+ result.getString("precio"));
            }
            desconectarBase();
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    public void RangoPrecio(ArrayList<String> rango) throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 200";
            consultarBase(sql);
            
            while (result.next()) {
                rango.add(result.getString("nombre")+"-------- $ "+ result.getString("precio"));
            }
            desconectarBase();
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    public void AllPortatil(ArrayList<String> portatil) throws Exception{
        try {
            String sql = "SELECT nombre FROM producto WHERE nombre LIKE '%portatil%'";
            consultarBase(sql);
            
            while (result.next()) {
                portatil.add(result.getString("nombre"));
            }
            desconectarBase();
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    public void ProductoBarato(ArrayList<String> producto) throws Exception{
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1";
            consultarBase(sql);
            
            while (result.next()) {
                producto.add(result.getString("nombre")+"-------- $ "+ result.getString("precio"));
            }
            desconectarBase();
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    public void ingresarProducto(String sql) throws Exception{
        try {            
            insertarModificarEliminar(sql);                                   
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    public void EliminarProducto(String codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Producto es null");
            }

            String sql = ("DELETE FROM producto WHERE codigo = '" + Integer.valueOf(codigo) + "';");

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    public String consultarCodigo(String codigo) throws Exception{
        try {
            String sql = "SELECT codigo FROM producto ORDER BY codigo DESC LIMIT 1";
            consultarBase(sql);
            while (result.next()) {
                codigo = result.getString("codigo");
            }                        
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
        return codigo;
    }
}
