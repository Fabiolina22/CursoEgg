/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.CuentaBancaria;
import Servicios.ServicioCuenta;
import java.util.Scanner;

/**Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 * @author USER
 */
public class PooEj5_CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer = new Scanner (System.in);
      ServicioCuenta servicio = new ServicioCuenta();
      CuentaBancaria cuenta1 = servicio.CrearCuenta();
        
        int opcion;
        
        do {
            System.out.println("---------------------");
            System.out.println("MENU");
            System.out.println("1 - Ingresar dinero"); 
            System.out.println("2 - Retirar dinero"); 
            System.out.println("3 - Extraccion rapida"); 
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Consultar datos");
            System.out.println("6 - SALIR"); 
            System.out.println("---------------------"); 
            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    servicio.Ingresar(cuenta1);
                    break;
                case 2:
                    servicio.Retirar(cuenta1);
                    break;
                case 3:
                    servicio.ExtraccionRapida(cuenta1);
                    break;
                case 4:
                    servicio.ConsultarSaldo(cuenta1);
                    break;
                case 5:
                    servicio.ConsultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Saliendo . . . .");
                    break;
                default:
                    System.out.println("Error al elegir una opcion. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }
    
}
