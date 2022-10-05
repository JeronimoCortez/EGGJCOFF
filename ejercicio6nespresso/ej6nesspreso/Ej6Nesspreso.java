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
package ej6nesspreso;

import ENTIDAD.Cafetera;
import Servicio.ServicioCafetera;
import java.util.Scanner;

public class Ej6Nesspreso {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCafetera S1 = new ServicioCafetera();
        Cafetera C1 = new Cafetera();
        int op = 0;
        while (op != 5) {
            System.out.println("Ingrese una opcion");
            System.out.println("1.Llenar cafetera");
            System.out.println("2.Servir taza");
            System.out.println("3.Vaciar cafetera");
            System.out.println("4.Agregar cafe");
            System.out.println("5.Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    S1.llenarcafetera(C1);
                    break;
                case 2:
                    S1.servirTaza(C1);
                    break;
                case 3:
                    S1.vaciarCafetera(C1);
                    break;
                case 4:
                    S1.ingresarCafe(C1);
                    break;
                
            }
        }
    }
}
