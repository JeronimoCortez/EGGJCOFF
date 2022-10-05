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
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

public class ServicioOperacion {
    Scanner leer = new Scanner(System.in);
 public Operacion Crearoperacion(){
  Operacion N = new Operacion();
     System.out.println("Ingrese dos numeros");
     N.setNum1(leer.nextInt());
     N.setNum2(leer.nextInt());
     return N;
 } 
 public void sumar(Operacion N){
    int sumar = N.getNum1() + N.getNum2();
     System.out.println("La suma de los dos numeros es: " + sumar);
    
 }
 public void restar(Operacion N){
    int restar = N.getNum1() - N.getNum2();
     System.out.println("La resta de los dos numeros es: "+ restar);
 }
 public void multiplicar(Operacion N){
     if(N.getNum1() == 0 || N.getNum2() == 0){
         System.out.println("ERROR, uno de los dos numeros es 0");   
     }
     else{
      int multiplicar = N.getNum1()*N.getNum2();
         System.out.println("La multiplicacion de los dos numeros es: " + multiplicar);
         
     }
 }
 public void division(Operacion N){
     if(N.getNum1() == 0 || N.getNum2() == 0){
         System.out.println("ERROR, uno de los dos numeros es 0");   
     }
     else{
      int division = N.getNum1()/N.getNum2();
         System.out.println("La division de los dos numeros es: " + division);
         
     }
 }
}





