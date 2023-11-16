/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.Fabricante;

/**
 *
 * @author USER
 */
public class DAO_FABRICANTE extends DAO {
    public void crearFabricante(Fabricante fabricante) throws Exception {

        try {
            if (fabricante == null) {
                throw new Exception("El fabricante no puede estar vacio");
            }
            String sql = "INSERT INTO fabricante (codigo,nombre)" + "values('"
                    + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "');";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    public void listarFabricantes(ArrayList<String> nombres) throws Exception {
        try {
            String sql = "SELECT DISTINCT codigo,nombre FROM fabricante";
            consultarBase(sql);
            
            while (result.next()) {
                nombres.add(result.getString("codigo") + ":" +  result.getString("nombre"));
            }
            desconectarBase();
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    public Fabricante buscarFabricanteNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM fabricante " + "WHERE nombre = '" + nombre + "'";
            consultarBase(sql);

            Fabricante fabricante = null;
            while (result.next()) {
                fabricante = new Fabricante();

                fabricante.setCodigo(result.getInt("codigo"));
                fabricante.setNombre(result.getString("nombre"));

            }

            desconectarBase();
            return fabricante;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        }
    }
    public String consultarCodigoFabricante(String codigo) throws Exception{
        try {
            String sql = "SELECT codigo FROM fabricante ORDER BY codigo DESC LIMIT 1";
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
    public void ingresarFabricante(String sql) throws Exception{
        try {            
            insertarModificarEliminar(sql);                                   
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
}
