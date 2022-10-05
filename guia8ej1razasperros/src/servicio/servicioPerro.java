/*
 * 1)) Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
2))Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package servicio;

import java.util.ArrayList;
import entidad.perros;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class servicioPerro {
    Scanner leer = new Scanner(System.in);
    ArrayList <String> P1 = new ArrayList<>();
    public void crearPerro(){
         String opcion;
        do{
        System.out.println("Ingrese la raza del perro");
        String raza = leer.nextLine(); 
        P1.add(raza);
      
        System.out.println("La lista de perros es:");
       for (String aux : P1) {
        System.out.println(aux); 
       }
       System.out.println("Se han cargado " + P1.size() + " perros");
       System.out.println("¿Desea continuar cargando perros (SI/NO)?");
       opcion = leer.nextLine();
       }while(!opcion.equalsIgnoreCase("no"));
       
    }
    public void buscarperros(){
        
        System.out.println("Ingrese la raza del perro que desea eliminar");
        String eliminado = leer.nextLine();
        int aux1 = P1.size();
        Iterator <String> it = P1.iterator();
        while(it.hasNext()){
         if(it.next().equalsIgnoreCase(eliminado) ){
          it.remove();
         } 
           
        }
        if(aux1 == P1.size()){ // se verifica si no se elimino ninguna raza y muestra el mensaje
         System.out.println("Esa raza no esta en la lista");   
        }
        Collections.sort(P1);
         System.out.println("La lista de perros es: ");
         for (String aux : P1) {
              System.out.println(aux);  
            }
    }
    
}
