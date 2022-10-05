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
package servicio;

import entidad.Matematica;

/**
 *
 * @author Usuario
 */
public class matematicaServicio {
 public double devolverMayor(Matematica M){
   double Mayor = Math.max(M.getNum1(), M.getNum2());
     return Mayor;
 }   
 public double calcularPotencia(Matematica M){
     int mayor = Math.max((int)M.getNum1(),(int)M.getNum2());
     int menor = Math.min((int)M.getNum1(),(int)M.getNum2());
     double potencia = Math.pow(mayor, menor);
     return potencia;        
 }
 public double calcularRaiz(Matematica M){
     double menor = Math.min(M.getNum1(), M.getNum2());
     int absoluto = Math.abs((int)menor);
     double raiz = Math.sqrt((double)absoluto);
     return raiz;
 }
}
