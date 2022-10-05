/*
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
package servicio;

import entidad.puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioPuntos {
    Scanner leer = new Scanner(System.in);
 public puntos crearPuntos(){
  puntos p1 = new puntos();  
     System.out.println("Ingrese el numero las coordenadas X1, Y1");
     p1.setX1(leer.nextInt());
     p1.setY1(leer.nextInt());
     System.out.println("Ingrese el numero las cordenadas X2, Y2");
     p1.setX2(leer.nextInt());
     p1.setY2(leer.nextInt());
     return p1;
   
 }   
 public void calculo(puntos p1){
     
        double distancia = Math.sqrt(Math.pow((p1.getX2()-p1.getX1()),2)+Math.pow((p1.getY2()-p1.getY1()), 2));
        double raiz = Math.pow((p1.getX2()-p1.getX1()),2)+Math.pow((p1.getY2()-p1.getY1()), 2);
        System.out.println(raiz);
        System.out.println("La distancia entre ambos es "+distancia);

 }
}
