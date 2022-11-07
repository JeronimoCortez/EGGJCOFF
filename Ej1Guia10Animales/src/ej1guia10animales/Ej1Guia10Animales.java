/*
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. 
 */
package ej1guia10animales;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

/**
 *
 * @author Usuario
 */
public class Ej1Guia10Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal P1 = new Perro("ipa" , "alimento balanceado" , "buldog" , 2);
       Animal P2 = new Perro("luna" , "alimento balanceado" , "labrador" , 10);
       Animal G = new Gato("gato" , "alimento balanceado" , "calle" , 5);
       Animal C = new Caballo("Caba" , "pasto" , "pony" , 4);
       P1.alimenta();
       P2.alimenta();
       G.alimenta();
       C.alimenta();
    }
    
}
