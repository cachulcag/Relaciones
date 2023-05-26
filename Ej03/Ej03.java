/*
Realizar una baraja de cartas españolas orientada a objetos. 

Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). 

Esta clase debe
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
 */
package Ej03;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Ej03 {

    public static void main(String[] args) {
        Baraja juego = new Baraja();
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenido al juego de Cartas");
        System.out.println("");
        juego.iniciarJuego();
        do {

            System.out.println("Que desea hacer?");
            System.out.println("");
            System.out.println("1. Barajar las cartas");
            System.out.println("2. Siguiente carta");
            System.out.println("3. Indicar las cartas disponibles");
            System.out.println("4. Pedir cartas");
            System.out.println("5. Mostrar cartas eliminadas");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Volver a iniciar");
            System.out.println("8. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    juego.barajar();
                    break;
                case 2:
                    juego.siguienteCarta();
                    break;
                case 3:
                    juego.cartasDisponibles();
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cartas que desea");
                    juego.darCartas(leer.nextInt());
                    break;
                case 5:
                    juego.cartasMonton();
                    break;
                case 6:
                    juego.mostrarBaraja();
                    break;
                case 7:
                    juego.iniciarJuego();
                    break;

                default:
                    System.out.println("Opción incorrecta");

            }

        } while (opcion != 8);

    }

}
