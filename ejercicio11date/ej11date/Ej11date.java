/*
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ej11date;

import entidad.dateE;
import java.util.Date;
import java.util.Scanner;

public class Ej11date {

    public static void main(String[] args) {  
        Scanner leer = new Scanner(System.in);
        dateE d1 = new dateE();
     Date fechaActual = new Date();
        System.out.println("Ingrese el dia");
       d1.setDia(leer.nextInt());
        System.out.println("Ingrese el mes");
       d1.setMes(leer.nextInt());
        System.out.println("Ingrese el año");
       d1.setAnio(leer.nextInt());
       Date fecha = new Date(d1.getAnio()-1900, d1.getMes()-1, d1.getDia());
        System.out.println(fecha);  
        System.out.println("Hay " + (fechaActual.getYear() - fecha.getYear()) + " años de diferencia entre la fecha actual y la fecha ingresada");
    }
    
}
