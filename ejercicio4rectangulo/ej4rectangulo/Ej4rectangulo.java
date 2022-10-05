/*
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ej4rectangulo;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;
import java.util.Scanner;
public class Ej4rectangulo {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ServicioRectangulo v = new ServicioRectangulo ();
        Rectangulo v1 = v.CrearRectangulo();
        
        int seleccion = 0;
        String confirmar = "N";
        
        do {
                v.Dibujar(v1);
                System.out.println("");
                System.out.println("********************************");
                System.out.println("            BIENVENIDO          ");
                System.out.println("********************************");
                System.out.println("");
                System.out.println("- SELECCIONE UNA OPERACIÓN");
                System.out.println("");
                System.out.println("    1. CALCULAR SUPERFICIE");
                System.out.println("    2. CALCULAR PERíMETRO");
                System.out.println("    3. SALIR");
                System.out.println("");
                System.out.print(">>>: ");
                seleccion = leer.nextInt();
                leer.nextLine();
                System.out.println("");
                
                switch (seleccion) {
                    case 1:
                        v.Superficie(v1);
                        System.out.println("");
                        break;
                    case 2:
                        v.Perimetro(v1);
                        System.out.println("");
                        break;
                    
                    case 3:
                        System.out.println("");
                        System.out.println("Usted ha seleccionado SALIR. Esta seguro (S/N): ");
                        confirmar = leer.nextLine();
                        confirmar = confirmar.toUpperCase();
                        System.out.println(".............. EL PROGRAMA HA FINALIZADO!!! ..............");
                        break;
                }

        } while (confirmar.equals("N"));
        
    }
    
}
    
    

