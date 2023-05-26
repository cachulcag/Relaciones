/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Ej02;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Juego {

    private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver revolver;
    private boolean i;

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
        revolver.llenarRevolver();

    }

    public boolean ronda() {

        jugadores.forEach(jugador -> {
            System.out.println(jugador.toString());
            if (jugador.disparo(revolver)) {
                System.out.println("Lastima te has mojado");
                System.out.println("JUEGO TERMINADO");
                i=false;
            }else{
                System.out.println("Tienes suerte!");
                System.out.println("SIGUIENTE PARTICIPANTE");
            }
        });
        return i;
    }

}
