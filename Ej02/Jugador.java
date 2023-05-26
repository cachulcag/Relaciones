/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a true y el método
devuelve true, sino false.
 */
package Ej02;

/**
 *
 * @author crist
 */
public class Jugador {

    private static int id = 0;
    private String nombre;
    private boolean mojado;

    //constructor
    public Jugador(String nombre) {
        Jugador.id++;
        this.nombre = nombre + " " + id;
        this.mojado = false;
    }

    //getter y setters
    public static int getId() {
        return id;
    }

    //metodos de clase
    public boolean disparo(Revolver revolver) {
        if (revolver.mojar()) {
            mojado = true;
        } else {
            revolver.siguienteChorro();
        }
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre;
    }

}
