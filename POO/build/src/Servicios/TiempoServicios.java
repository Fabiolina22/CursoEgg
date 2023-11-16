/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Tiempo;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class TiempoServicios {

    Scanner leer = new Scanner(System.in);

    public void ImprimirHoraCompleta() {
        Tiempo time = new Tiempo();
        System.out.println("Ingresa una hora en formato 24 horas");
        time.setHoras(leer.nextInt());
        System.out.println("Ingresa los minutos");
        time.setMinutos(leer.nextInt());
        System.out.println("Ingrese los segundos");
        time.setSegundos(leer.nextInt());
        PasoTiempo(time);

    }

    public void PasoTiempo(Tiempo time) {

        if (time.getHoras() < 24 && time.getMinutos() < 60 && time.getSegundos() < 60) {
            for (int hora = 0; hora < 24; hora++) {
                for (int minuto = 0; minuto < 60; minuto++) {
                    if (time.getSegundos() == 0) {

                        for (int segundo = 0; segundo < 60; segundo++) {
                            System.out.println((time.getHoras() + hora) + ":" + (time.getMinutos() + minuto) + ":" + segundo + ":");
                            PasoSegundos();
                        }
                    } else {
                        for (int segundo = time.getSegundos(); segundo < (60); segundo++) {
                            System.out.println((time.getHoras() + hora) + ":" + (time.getMinutos() + minuto) + ":" + segundo + ":");
                            PasoSegundos();
                        }
                        time.setSegundos(0);

                    }

                }
            }
        }

    }

    private void PasoSegundos() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {

        }

    }

}
