/*
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicio;
import Entidad.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
    public Rectangulo CrearRectangulo () {
        
        Scanner leer = new Scanner(System.in);
        Rectangulo v = new Rectangulo ();
        System.out.println("Ingrese el valor de la base del rectángulo: ");
        v.setBase(leer.nextInt());
        System.out.println("Ingrese el valor de la altura del rectángulo: ");
        v.setAltura(leer.nextInt());
        
        return v;
    } 
    
    public void Dibujar (Rectangulo v){
        
        for (int i = 0; i < v.getAltura(); i++) {
            for (int j = 0; j < v.getBase(); j++) {
                if (j == 0 || i == 0 || j == (v.getBase() - 1) || i == (v.getAltura() - 1)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
    public void Superficie (Rectangulo v){
        
        int superficie = v.getBase() * v.getAltura();
        System.out.println("La superficie del rectángulo es: "+superficie);
    }
    
    public void Perimetro (Rectangulo v){
        
        int Perimetro = (v.getBase() + v.getAltura()) * 2;
        System.out.println("El perímetro del rectánculo es: "+Perimetro);
    }
}
