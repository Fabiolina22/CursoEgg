/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CuentaBancaria;
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
public class ServicioCuenta {
    Scanner leer = new Scanner (System.in);
    
    public CuentaBancaria CrearCuenta(){
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Ingrese el número de cuenta: ");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su número de DNI: ");
        cuenta1.setDNI(leer.nextLong());
        System.out.println("Ingrese el saldo actual: ");
        cuenta1.setSaldoActual(leer.nextInt());
        return cuenta1;
        
        
    }
    public void Ingresar (CuentaBancaria cuenta1){
        System.out.println("Digite la cantidad de dinero que desea Ingresar a la cuenta: ");
        cuenta1.setSaldoActual(cuenta1.getSaldoActual()+(int)leer.nextDouble());
        System.out.println("La cantidad de dinero que ha ingresado es: "+cuenta1.getSaldoActual());
        
    }
    public void Retirar (CuentaBancaria cuenta1){
        System.out.println("Ingrese la cantidad que desea retirar: ");
        double retiro = leer.nextDouble();
        if (cuenta1.getSaldoActual() < retiro ) {
            cuenta1.setSaldoActual(0);
            System.out.println("Fondos insuficientes");
            
        }else{
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-(int)retiro);
            System.out.println("su retiro fue de $"+retiro);
        }
    }
    public void ExtraccionRapida (CuentaBancaria cuenta1){
        System.out.println("Ingrese la cantidad que desea extraer (maximo el 20% de el saldo de cuenta)");
        double extraccion = leer.nextDouble();
        if (extraccion <= (cuenta1.getSaldoActual()*0.20) ) {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-(int)extraccion);
            System.out.println("Usted ha retirado $"+extraccion);
        }else{
            System.out.println("La cantidad ingresada es mayor al 20% del saldo de su cuenta");
        }
    }
    public void ConsultarSaldo (CuentaBancaria cuenta1){
        System.out.println("el saldo actual de la cuenta es de: $"+cuenta1.getSaldoActual());
        
    }
    public void ConsultarDatos (CuentaBancaria cuenta1){
        System.out.println(cuenta1.toString());
        
    }
}
