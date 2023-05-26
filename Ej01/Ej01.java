/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Ej01;

/**
 *
 * @author crist
 */
public class Ej01 {
    
    public static void main(String[] args) {
        
        
        Persona carolina = new Persona();
        carolina.setNombre("Carolina");
        
        Persona mario = new Persona();
        mario.setNombre("Mario");
        
        Perro chiquito = new Perro();
        chiquito.setNombre("chiquito");
        
        Perro pelao = new Perro();
        pelao.setNombre("pelao");
        
        //a cada persona se le da un perro
        carolina.setPerro(chiquito);
        mario.setPerro(pelao);
        
        System.out.println(carolina.toString());
        System.out.println(mario.toString());
    }
    
}
