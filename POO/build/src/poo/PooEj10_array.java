/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Arrays;

/**
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un
 * arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números,
 * también reales. El programa deberá inicializar el arreglo A con números
 * aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de
 * menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20
 * elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los
 * dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 *
 * @author USER
 */
public class PooEj10_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arreglo1 = new double[50];
        double[] arreglo2 = new double[20];
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] =  (Math.random() * 10);
            System.out.println(arreglo1[i]);
        }
        Arrays.sort(arreglo1);

        arreglo2 = Arrays.copyOfRange(arreglo1, 0, 20);
        Arrays.fill(arreglo2, 10, 20, 0.5);
        System.out.println("este es el arreglo 1");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("(" + i + ") " + arreglo1[i]);
        }
        System.out.println("este es el arreglo 2");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("(" + i + ") " + arreglo2[i]);
        }

    }
}
