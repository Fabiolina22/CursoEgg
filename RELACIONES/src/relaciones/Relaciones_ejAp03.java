/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import ENTIDADES.Baraja;
import java.util.Scanner;

/**
 *Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 * @author USER
 */
public class Relaciones_ejAp03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja b1 = new Baraja();
        b1.CrearBaraja();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op = 0;
    
        do {
            System.out.println("------------------");
            System.out.println("MENU");
            System.out.println("1 - Barajar");
            System.out.println("2 - Cartas disponibles");
            System.out.println("3 - Dar cartas");
            System.out.println("4 - Cartas eliminadas");
            System.out.println("5 - Mostrar mazo");
            System.out.println("6 - Siguiente carta");
            System.out.println("7 - Salir");
            System.out.println("------------------");
            op = leer.nextInt();
            while (op > 7) {
                System.out.println("Error. ingrese una opcion valida");
                System.out.println("------------------");
                System.out.println("MENU");
                System.out.println("1 - Barajar");
                System.out.println("2 - Cartas disponibles");
                System.out.println("3 - Dar cartas");
                System.out.println("4 - Cartas eliminadas");
                System.out.println("5 - Mostrar mazo");
                System.out.println("6 - Siguiente carta");
                System.out.println("7 - Salir");
                System.out.println("------------------");
                op = leer.nextInt();
            }

            switch (op) {
                case 1:
                    b1.Barajar();
                    break;
                case 2:
                    b1.CartasDisponibles();
                    break;
                case 3:
                    b1.DarCartas();
                    break;
                case 4:
                    b1.Monton();
                    break;
                case 5:
                    b1.MostrarBaraja();
                    break;
                case 6:
                    b1.SiguienteCarta();
                    break;
                case 7:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Error. Opcion invalida");
                    break;
            }
        } while (op != 7);
       
    }
    
}
