/*
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package servicios;

import entidad.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import utilidades.Comparadores;

/**
 *
 * @author Usuario
 */
public class ServicioPaises {
  Set <Paises> lista = new HashSet();
   Scanner leer = new Scanner(System.in).useDelimiter("\n");;
   public void ingresarPaises(){
       String salir;
       do{
          Paises P1 = new Paises(); 
         System.out.println("Ingrese un pais");
         P1.setPais(leer.next());
         lista.add(P1);
         do{
        System.out.println("¿Desea ingresar otro pais? SI/NO");
        salir = leer.next();
        if(!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no")){
            System.out.println("POR FAVOR INGRESE SI/NO");
        }
        } while(!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no"));
       }while(salir.equalsIgnoreCase("si"));
       System.out.println("La lista de Paises es: ");
       for (Paises aux : lista) {
           System.out.println(aux);
       }
      
   }
   public void ordenarPais(){
    ArrayList <Paises> ordenar = new ArrayList(lista);
    Collections.sort(ordenar, Comparadores.ordenarAlfabeticamete);
       System.out.println("La lista de paises ordenana alfabeticamente es: ");
       for (Paises aux : ordenar) {
           
           System.out.println(aux);
       }
   }
   public void eliminarPais(){
       System.out.println("Ingrese el pais que desea eliminar");
       String eliminar = leer.next();
        int aux1 = lista.size();
    Iterator <Paises> it = lista.iterator();
    while(it.hasNext()){
        if(it.next().getPais().equalsIgnoreCase(eliminar)){
            it.remove();
            System.out.println("La nueva lista de paises es: ");
        }
    }
       if(aux1 == lista.size()){//Se verifica que siga siendo la misma longitud( no estaba el pais ingresado asi que no se elimino nada de la lista)
           System.out.println("El pais ingresado no se encuentra en la lista");
       }
       if(aux1 != lista.size()){ //Solo se muestra la lista en caso de que se haya eliminado algun pais
       for (Paises aux : lista) {
           System.out.println(aux);
       }
   }
   }
}
