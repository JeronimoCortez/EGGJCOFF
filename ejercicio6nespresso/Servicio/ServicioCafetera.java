/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import ENTIDAD.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {
    Scanner leer = new Scanner(System.in); 
 public Cafetera llenarcafetera(Cafetera C){
     C.setCapacidadmax(1000);
     System.out.println("La capacidad maxima de la cafetera es de 1000 cc");
     C.setCapacidadactual(C.getCapacidadmax());
     System.out.println("La capacidad actual de la cafetera es de 1000 cc");
     return C;
 }   
 public void servirTaza(Cafetera C){
     int taza;
     System.out.println("Ingrese el tamaño de la taza");
     taza = leer.nextInt();
     if (taza >= C.getCapacidadactual()){
         System.out.println("Su taza solo se lleno hasta: " + C.getCapacidadactual());
         C.setCapacidadactual(0);            
     }else{
         C.setCapacidadactual(C.getCapacidadactual()-taza);
         System.out.println("Su taza se lleno completa, le queda " + C.getCapacidadactual() + " cc de cafe");
     }
 }
 public void vaciarCafetera(Cafetera C){
   C.setCapacidadactual(0);
     System.out.println("Se vacio la cafetera");
 }
 
 public void ingresarCafe(Cafetera C){
    int ingresarCafe;
     System.out.println("Ingrese la cantidad de cafe que desea ingresar");
     ingresarCafe = leer.nextInt();
     if (ingresarCafe <= C.getCapacidadmax()){
     C.setCapacidadactual(ingresarCafe);
     }else{
         C.setCapacidadactual(C.getCapacidadmax());
         System.out.println("SUPERO LA CAPACIDAD DE LA CAFETERA, SOLO SE LLENO 1000 CC");
     }
 }
}
