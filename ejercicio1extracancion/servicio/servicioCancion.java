/*
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */
package servicio;

import entidad.cancion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioCancion {
    
    Scanner leer = new Scanner(System.in);
    public cancion crearCancion(){
        cancion c1 = new cancion();
        System.out.println("Ingrese el titulo de la cancion");
        c1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la cancion");
        c1.setAutor(leer.nextLine());
        return c1;
    }
   
}
