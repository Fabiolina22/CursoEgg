/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Raices;

/**Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:





 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 *
 * @author USER
 */
public class RaicesServicios {
    public double getDiscriminante(Raices discriminante){
        int a = discriminante.getA();
        int b = discriminante.getB();
        int c = discriminante.getC();
        
        
        return Math.pow(b, 2)-4*a*c;
        
    }
    public boolean tieneRaices (Raices discriminante){
        double disc = getDiscriminante(discriminante);
        
        return disc >=0;
        
    }
    public boolean tieneRaiz (Raices discriminante){
        double disc = getDiscriminante(discriminante);
        
        return disc == 0;
    }
    public void obtenerRaices(Raices discriminante){
        int a = discriminante.getA();
        int b = discriminante.getB();
        int c = discriminante.getC();
        double raiz1 = (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        double raiz2 = (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        System.out.println("la raiz 1 es: "+raiz1);
        System.out.println("la raiz 2 es: "+raiz2);
    } 
//     Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raices discriminante){
        int a = discriminante.getA();
        int b = discriminante.getB();
        int c = discriminante.getC();
        double raiz = 0;
        if ((-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))%(2*a)==0) {
            raiz=(-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        }else{
            raiz=(-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        }
        System.out.println("la raiz es "+raiz);
    }
//     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
    public void Calcular(Raices discriminante){
        if (tieneRaiz(discriminante) ) {
            
            obtenerRaiz(discriminante);
            
            
        }else if (tieneRaices(discriminante)) {
            obtenerRaices(discriminante);
        }
        else{
            System.out.println("no tiene solucion"); 
        }
    }
    
}
