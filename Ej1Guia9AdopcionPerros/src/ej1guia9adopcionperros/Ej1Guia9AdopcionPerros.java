/*
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package ej1guia9adopcionperros;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import servicio.ServicioAdopcion;

/**
 *
 * @author Usuario
 */
public class Ej1Guia9AdopcionPerros {

    public static void main(String[] args) {
//       Scanner leer = new Scanner (System.in);
//   Perro perro1 = new Perro ("Mila", "Salchicha", 4, "pequeña");
//   Perro perro2 = new Perro ("Canela", "Boxer", 3, "mediana");
//   
//   Persona persona1 = new Persona ("C", "D", 35, 326664981, null);
//   persona1.setPerro(perro1);
//   
//   Persona persona2 = new Persona ("0", "A", 42, 227266543 , null);
//   persona2.setPerro(perro2);
//        System.out.println("Los datos del dueño con su mascota son" + persona1.toString()); 
//        System.out.println("");
//        System.out.println("Los datos del dueño con su mascota son" + persona1.toString());
//  
//    }
        ServicioAdopcion s1 = new ServicioAdopcion();
        Scanner leer = new Scanner(System.in);
       int op ;
        do {
            System.out.println("*** INGRESE UNA OPCION ***");
            System.out.println("1. INGRESAR PERSONAS");
            System.out.println("2. INGRESAR PERROS");
            System.out.println("3. MOSTRAR lISTA DE PERROS");
            System.out.println("4. MOSTRAR LISTA DE PERSONAS");
            System.out.println("5. ADOPTAR UN PERRO");
            System.out.println("6. SALIR");

            op = leer.nextInt();
            switch (op) {
                case 1:
                    s1.crearPersonas();
                    break;
                case 2:
                    s1.crearPerro();
                    break;
                case 3:
                    s1.mostraPerro();
                    break;
                case 4:
                    s1.mostrarPersonas();
                    break;
                case 5:
                    s1.elegirMascota();
                    break;
                case 6:
                    System.out.println("ELIGIO LA OPCION SALIR, GRACIAS POR USAR NUESTRO PROGRAMA");
                    break;

            }

        } while (op != 6);
    }
}
