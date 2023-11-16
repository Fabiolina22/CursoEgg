/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**

Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 *
 * @author USER
 */
public class AlumnosServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumnos> alumno = new ArrayList();
    

    public void crearAlumno() {
        int op = 0;
        do {
            System.out.println("---------------");
            System.out.println("MENU");
            System.out.println("1.Crear Alumno");
            System.out.println("2.Salir");
            System.out.println("---------------");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    Alumnos alumno1 = new Alumnos();

                    System.out.println("Ingrese el nombre del alumno");
                    alumno1.setNombre(leer.next());
                    ArrayList<Integer> notas = new ArrayList();

                    for (int i = 0; i < 3; i++) {
                        
                        System.out.println("ingrese la nota # " + (i + 1));
                        notas.add(leer.nextInt());
                        alumno1.setNotas(notas);
                    }
                    alumno.add(alumno1);
                    

            

            break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                    

          default:
                    System.out.println("ERROR! ingrese un valor correcto ");
                    break;
       
        }    
    }
    while (op != 2);
        
}


    public void MostrarAlumno (){
        System.out.println("alumnos actuales");
        for (Alumnos aux : alumno) {
            System.out.println(aux);
        }
    }
    public void notaFinal(){
    System.out.println("Ingrese el nombre del alumno para calcular su nota final:");
    String nombre = leer.next();
    for (Alumnos a : alumno) {
        a.getNombre().equals(nombre);
            ArrayList<Integer> notas = a.getNotas();
            int sum = 0;
            
            for (Integer nota : notas) {
                sum += nota;
                
            }
            double promedio = (double) sum / notas.size();
         if (a.getNombre().equals(nombre)){
            System.out.println("El promedio final de " + a.getNombre() + " es " + promedio);
         }
        
    }
  
            
            
            
        
    }
}
