/*
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicios;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Usuario
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> lista = new ArrayList();

    public void crearPelicula() {
       String respuesta;
       
        do{
        Pelicula P1 = new Pelicula();

        System.out.println("Ingrese los datos de la película.");
        System.out.println("Título");
        P1.setTitulo(leer.next());
        System.out.println("Director");
        P1.setDirector(leer.next());
        System.out.println("Duración en horas");
        P1.setDuracion(leer.nextDouble());
        do{
        System.out.println("¿Desea ingresar los datos de otra película? SI/NO");
        respuesta = leer.next();
        if(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")){
            System.out.println("POR FAVOR INGRESE SI/NO");
        }
        }while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
        lista.add(P1);
        }while(respuesta.equalsIgnoreCase("si"));
        

     
    }


    public void mostrarListado() {
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
    }

    public void peliculaDuracionMayor1() {
     
       
       
        for (int i = 0; i < lista.size(); i++) {
             
            if (lista.get(i).getDuracion() > 1) {
                System.out.println(lista.get(i));
            }
           
        }
        
    }
    public void ordenarAscendenteDuracion(){
      
        Collections.sort(lista, Comparadores.duracionAscendente);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
    }
    public void ordenarDescendenteDuracion(){
      
        Collections.sort(lista, Comparadores.duracionDescendente);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
    }
    public void tituloAlfabeticamente(){
       
        Collections.sort(lista, Comparadores.tituloAlfabeticamente);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
    }
    public void directorAlfabeticamente(){
      
        Collections.sort(lista, Comparadores.directorAlfabeticamente);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
    }
    public void menu(){
        int opcion;
        String salir = "no";
        System.out.println("***** BIENVENIDO *****");
        do{
        
        System.out.println("----- INGRESE UNA OPCION -----");
        System.out.println("");
        System.out.println("1. INGRESAR PELICULAS");
        System.out.println("2. MOSTRAR LISTADO DE PELICULAS");
        System.out.println("3. MOSTRAR PELICULAS CON DURACION MAYOR A 1 HORA");
        System.out.println("4. ORDENAR LAS PELICULAS DE MAYOR A MENOR SEGUN SU DURACION");
        System.out.println("5. ORDENAR LAS PELICULAS DE MENOR A MAYOR SEGUN SU DURACION");
        System.out.println("6. ORDENAR LAS PELICULAS SEGUN SU TITULO (A-Z)");
        System.out.println("7. ORDENAR LAS PELICULAS SEGUN SU DIRECTOR (A-Z)");
        System.out.println("8. SALIR");
            System.out.println("");
        opcion = leer.nextInt();
            System.out.println("");
            System.out.println("***** ELIJIO LA OPCION '" + opcion + "' *****");
            System.out.println("");
        switch(opcion){
            case 1:
                crearPelicula();
                break;
            case 2:
                System.out.println("");
                System.out.println("----- PELICULAS -----");
                System.out.println("");
                mostrarListado();
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                System.out.println("----- PELICULAS DE MAS DE 1 HORA -----");
                System.out.println("");
                peliculaDuracionMayor1();
                System.out.println("");
                break;
            case 4:
                System.out.println("");
                System.out.println("----- PELICULAS DE LA MAS LARGA A LA MAS CORTA -----");
                System.out.println("");
                ordenarAscendenteDuracion();
                System.out.println("");
                break;
            case 5:
                System.out.println("");
                System.out.println("----- PELICULAS DE LA MAS CORTA A LA MAS LARGA -----");
                System.out.println("");
                ordenarDescendenteDuracion();
                System.out.println("");
                break;
            case 6:
                System.out.println("");
                System.out.println("----- PELICULAS ORDENANDAS SEGUN SU TITULO(A/Z) -----");
                System.out.println("");
                tituloAlfabeticamente();
                System.out.println("");
                break;
            case 7:
                System.out.println("");
                System.out.println("----- PELICULAS ORDENADAS SEGUN SU DIRECTOR -----");
                System.out.println("");
                directorAlfabeticamente();
                System.out.println("");
                break;
            case 8:
                System.out.println("");
                do{
                    System.out.println("¿ESTA SEGURO QUE DESEA SALIR? (SI/NO)"); 
                    salir = leer.next();
                    if(!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no")){
                        System.out.println("INGRESE SI/NO");
                    }
                }while(!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no"));
                System.out.println("");
        }
        }while(!salir.equalsIgnoreCase("si"));
    }
    
}
