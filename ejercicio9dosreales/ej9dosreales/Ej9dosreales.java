/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ej9dosreales;

import entidad.Matematica;
import servicio.matematicaServicio;

/**
 *
 * @author Usuario
 */
public class Ej9dosreales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matematicaServicio S1 = new matematicaServicio();
        Matematica M1 = new Matematica();
        M1.setNum1(Math.random()*20);
        M1.setNum2(Math.random()*20);
        System.out.println("El primer numero es: " + M1.getNum1());
        System.out.println("El segundo numero es: " + M1.getNum2());
        System.out.println("El mayor de los dos numeros es: " + S1.devolverMayor(M1));
        System.out.println("El resultado del mayor numero potenciado al menor es: " + S1.calcularPotencia(M1));
        System.out.println("La raiz cuadrada del numero menor es: " + S1.calcularRaiz(M1));
    }
    
}
