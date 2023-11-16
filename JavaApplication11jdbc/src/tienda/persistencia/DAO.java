/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet result = null;
    protected Statement sentencia = null;

    private final String User = "root";
    private final String Password = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, User, Password);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }
    
    protected void desconectarBase() throws Exception{
        try{
            if (result != null ) {
                result.close();
            }
            if (result != null) {
                result.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
        }
        catch (Exception ex) {
            throw ex;
    }
    }
    protected void insertarModificarEliminar(String sql) throws ClassNotFoundException, SQLException{
        try{
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            
        }
        catch (ClassNotFoundException | SQLException ex) {
            throw ex;
            
        
    }
    }
    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            result = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }
}
