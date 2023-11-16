/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import utilidades.comparadores;

/**
 *
 * @author USER
 */
public class MascotaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Mascota> razas = new ArrayList();

    public void Menu() {
        int op = 0;
        do {
            System.out.println("---------------");
            System.out.println("MENU");
            System.out.println("1.Crear Raza");
            System.out.println("2.Salir");
            System.out.println("---------------");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    crearRaza(razas);
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("ERROR! ingrese un valor correcto ");
                    break;
            }

        } while (op != 2);
        for (Mascota raza : razas) {
            System.out.println(raza.toString());
            

        }
        BorrarRaza();
        
    }
    
        public void BorrarRaza (){
        System.out.println("Ingrese una raza a buscar");
        String raza1 = leer.next();
        int cont = razas.size();
//        if (razas.contains(raza1)) {
//            System.out.println("no se encontro la raza!");
//        }
        Iterator<Mascota> it = razas.iterator();
         
        while (it.hasNext()) {
            if (it.next().getRaza().equals(raza1)) {
                it.remove();

            }
            

        }
            if (cont == razas.size()) {
                System.out.println("no se encontro la raza!");
                
            }
            
        for (Mascota raza : razas) {
            System.out.println(raza.toString());
            

        }
            System.out.println("lista orden ascendente");
        Collections.sort(razas,comparadores.ordenasc );
        System.out.println("lista orden descendente");
        Collections.sort(razas,comparadores.ordendes );
        
        
    }
        

    public void crearRaza(ArrayList <Mascota> razas) {
        Mascota mascota1 = new Mascota();
        System.out.println("Ingrese la raza de su mascota: ");
        mascota1.setRaza(leer.next());
        razas.add(mascota1);
    }

}
