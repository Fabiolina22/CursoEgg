/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Movil;
import java.util.Scanner;

/**
 *  Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular y poder cargarlo en nuestro programa.  Método ingresarCodigo(): este método permitirá ingresar el código completo de siete números de un celular. Para ello, puede utilizarse un bucle repetitivo
 *
 * @author USER
 */
public class MovilServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Movil CargarCelular() {
        Movil cel = new Movil();
        System.out.println("Ingrese la marca: ");
        cel.setMarca(leer.next());
        System.out.println("Ingrese el precio: ");
        cel.setPrecio(leer.nextInt());
        System.out.println("Ingrese el modelo: ");
        cel.setModelo(leer.next());
        System.out.println("Ingrese la capacidad de memoria RAM en GB: ");
        cel.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese la capacidad de almacenamiento en GB: ");
        cel.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingresar codigo de 7 digitos: ");
        cel.setCodigo(IngresarCodigo(cel));

        return cel;

    }
    public int[] IngresarCodigo (Movil cel){
        int [] codigo = new int [cel.getCodigo().length];
        String codigo1 = leer.next();
        for (int i = 0; i < cel.getCodigo().length; i++) {
            codigo[i]=Integer.parseInt(codigo1.substring(i, i+1));
        }
        return codigo;
        
    }
}