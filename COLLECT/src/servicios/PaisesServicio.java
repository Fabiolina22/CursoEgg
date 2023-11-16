/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        TreeSet<String> paises = new TreeSet();
        int op = 0;
        do {
            crearPais(paises);
            System.out.println("Desea ingresar otro pais: ");
            System.out.println("1 - Si");
            System.out.println("2 - No");
            op = leer.nextInt();

            while (op != 1 && op != 2) {
                System.out.println("ERROR. Ingrese una opcion valida.");
                System.out.println("Desea ingresar otro pais: ");
                System.out.println("1 - Si");
                System.out.println("2 - No");
                op = leer.nextInt();
            }

        } while (op != 2);
        
        for (String p : paises) {
            System.out.println(p);
        }

        System.out.println("-----------------------");

        eliminarPais(paises);

    }
  
    
    public void crearPais(TreeSet<String> paises) {
        System.out.println("--------------------------------");
        System.out.println("Ingrese el nombre de un pais: ");
        System.out.println("--------------------------------");
        paises.add(leer.next());
    }
    
    
    public void eliminarPais(TreeSet<String> paises){
       
        Iterator<String> it = paises.iterator();
        System.out.println("Ingrese el nombre del pais que desea borrar");
        String pais1 = leer.next();
        int cont = 0;
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase(pais1)) {
                it.remove();
                cont++;
            }
        }
        if (cont==0) {
            System.out.println("El pais no se ha encontrado :(");
            
        }
        for (String p : paises) {
            System.out.println("--------------------------------");
            System.out.println(p);
            System.out.println("--------------------------------");
        }
    }
}