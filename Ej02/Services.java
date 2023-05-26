/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Juego juego = new Juego();
    private Revolver revolver = new Revolver();
    private ArrayList<Jugador> jugadores = new ArrayList();

    //metodos 
    public void ingresarJugadores() {
        do {
            System.out.println("Ingrese el nombre del jugador");
            jugadores.add(new Jugador(leer.next()));
            System.out.println("Desea Ingresar otro jugador?");
        } while (leer.next().equalsIgnoreCase("Si"));
        juego.llenarJuego(jugadores, revolver);
    }

    public void iniciarJuego() {
        do {
            mostrarPosicion();
        } while (juego.ronda());

    }

    public void mostrarJugadores() {
        jugadores.forEach(jugador -> System.out.println(jugador));
    }

    public void mostrarPosicion() {
        System.out.println(revolver.toString());
    }
}
