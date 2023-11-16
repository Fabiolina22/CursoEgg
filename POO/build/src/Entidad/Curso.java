/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 * @author USER
 */
public class Curso {
    private String NombreCurso;
    private int CantidadHorasPorDia;
    private int CantidadDiasPorSemana;
    private String turno;
    private int PrecioPorHora;
    private String[] alumnos = new String [5];

    public Curso() {
    }

    public Curso(String NombreCurso, int CantidadHorasPorDia, int CantidadDiasPorSemana, String turno, int PrecioPorHora) {
        this.NombreCurso = NombreCurso;
        this.CantidadHorasPorDia = CantidadHorasPorDia;
        this.CantidadDiasPorSemana = CantidadDiasPorSemana;
        this.turno = turno;
        this.PrecioPorHora = PrecioPorHora;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return CantidadHorasPorDia;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void setCantidadHorasPorDia(int CantidadHorasPorDia) {
        this.CantidadHorasPorDia = CantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return CantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int CantidadDiasPorSemana) {
        this.CantidadDiasPorSemana = CantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return PrecioPorHora;
    }

    public void setPrecioPorHora(int PrecioPorHora) {
        this.PrecioPorHora = PrecioPorHora;
    }

    
            
}
