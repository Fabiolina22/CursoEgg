/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Curso;
import java.util.Scanner;

/**
 *

 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 * @author USER
 */
public class CursoServicios {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String [] CargarAlumnos(Curso alumnos){
               
        String [] alumno = new String [alumnos.getAlumnos().length];
        for (int i = 0; i <alumnos.getAlumnos().length; i++) {
            System.out.print("alumno "+(i+1)+" ");
            alumno[i]= leer.next(); 
        }
        return alumno;
      
    }
    public Curso crearCurso(){
        Curso alumnos1 = new Curso ();
        System.out.print ("Por favor ingrese el nombre del curso. ");
        alumnos1.setNombreCurso(leer.next());
        System.out.print("Por favor ingrese la cantidad de horas impartidas por día ");
        alumnos1.setCantidadHorasPorDia(leer.nextInt());
        System.out.print("Por favor ingrese la candidad de dias por semana en que se imparte el curso ");
        alumnos1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.print("Por favor ingrese el turno: 1 -> Mañana | 2 -> Tarde ");
        alumnos1.setTurno(leer.next());
        System.out.print("Por favor ingrese el precio por hora ");
        alumnos1.setPrecioPorHora(leer.nextInt());
        System.out.println("Ingrese el nombre de sus alumnos");
        alumnos1.setAlumnos(CargarAlumnos(alumnos1));
        return alumnos1;
        
    }
//   //  Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
////en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
    public double calcularGananciaSemanal(Curso alumnos1){
        
         return (alumnos1.getCantidadHorasPorDia()*alumnos1.getPrecioPorHora()*alumnos1.getCantidadDiasPorSemana()*alumnos1.getAlumnos().length);
        
    }
}
