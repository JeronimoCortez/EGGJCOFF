/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package ej3operacion;

import Entidad.Operacion;
import Servicio.ServicioOperacion;
import java.util.Scanner;

public class Ej3operacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioOperacion S1 = new ServicioOperacion();
        Operacion O1 = S1.Crearoperacion();
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Ingrese una opcion");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    S1.sumar(O1);
                    break;
                case 2:
                    S1.restar(O1);
                    break;
                case 3:
                    S1.multiplicar(O1);
                    break;
                case 4:
                    S1.division(O1);
                    break;

            }
        }

    }

}
