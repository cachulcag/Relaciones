/*
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author crist
 */
public class Baraja {

    private List<Cartas> baraja = new ArrayList();
    private List<Cartas> eliminadas = new ArrayList();
    private final String[] palo = {"Oro", "Copas", "Espadas", "Bastos"};

    public void llenar() {
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < 12; j++) {
                if (j < 7 || j > 8) {
                    baraja.add(new Cartas(palo[i], j + 1));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(baraja);

    }

    public void siguienteCarta() {
        if (baraja.isEmpty()) {
            System.out.println("se acabaron las cartas");
        } else {
            eliminadas.add(baraja.get(0));
            System.out.println(baraja.get(0));
            baraja.remove(0);
        }
        System.out.println("-------------------");
    }

    public void cartasDisponibles() {
        System.out.println("Las cartas disponibles son:" + baraja.size());
        System.out.println("--------------------");
    }

    public void darCartas(int cantidad) {
        if (cantidad <= baraja.size()) {
            for (int i = 0; i < cantidad; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("No hay cartas suficientes");
            System.out.println("---------------------");
        }
    }

    public void cartasMonton() {
        eliminadas.forEach(carta -> System.out.println(carta));
    }

    public void mostrarBaraja() {
        baraja.forEach(carta -> System.out.println(carta));
    }

    public void iniciarJuego() {
        llenar();
        barajar();
        System.out.println("Tu primera carta es: ");
        siguienteCarta();
    }

}
