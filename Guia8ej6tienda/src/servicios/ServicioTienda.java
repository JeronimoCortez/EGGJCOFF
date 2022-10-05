/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicios;

import entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioTienda {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");;
    Tienda T1 = new Tienda();
    HashMap <String , Integer> Mapa = new HashMap();
    public void ingresarProductos(){
        String salir;
        do{
        System.out.println("INGRESE EL PRODUCTO");
        T1.setProductos(leer.next());
        System.out.println("INGRESE EL PRECIO DEL PRODUCTO");
        T1.setPrecios(leer.nextInt());
        Mapa.put(T1.getProductos(), T1.getPrecios());
                        do{
                    System.out.println("¿DESEA INGRESAR OTRO PRODUCTO? (SI/NO)"); 
                    salir = leer.next();
                    if(!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no")){
                        System.out.println("INGRESE SI/NO");
                    }
                }while(!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no"));
                System.out.println("");
        }while(salir.equalsIgnoreCase("si"));
       
    }
    public void mostrarLista(){
       for (Map.Entry<String, Integer> aux : Mapa.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println("Producto: " + key + " $" + value);
        }  
    }
    public void eliminarProducto(){
        int aux1  = Mapa.size();
        System.out.println("Ingrese el producto que desea eliminar");
        String eliminado = leer.next();
        Mapa.remove(eliminado);
        if(aux1 != Mapa.size()){
        System.out.println("*** EL PRODCUTO [" + eliminado + "] SE ELIMINO EXITOSAMENTE, LA NUEVA LISTA DE PRODUCTOS ES: ***");
          for (Map.Entry<String, Integer> aux : Mapa.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println("Producto: " + key + " $" + value);
        } 
        }else {
         System.out.println("***** NO SE ELIMINO NINGUN PRODUCTO YA QUE EL INGRESADO NO ESTABA EN LA LISTA *****");
                }

    } 
    public void menu(){
     int opcion;
        String salir = "no";
        System.out.println("***** BIENVENIDO *****");
        do{
        
        System.out.println("----- INGRESE UNA OPCION -----");
        System.out.println("");
        System.out.println("1. INGRESAR PRODUCTOS");
        System.out.println("2. MOSTRAR LISTADO DE PRODUCTOS");
        System.out.println("3. ELIMINAR PRODUCTO");
        System.out.println("4. SALIR");
       
            System.out.println("");
        opcion = leer.nextInt();
            System.out.println("");
            System.out.println("***** ELIJIO LA OPCION '" + opcion + "' *****");
            System.out.println("");
        switch(opcion){
            case 1:
               ingresarProductos();
                break;
            case 2:
                System.out.println("");
                System.out.println("----- LISTADO DE PRODUCTOS -----");
                System.out.println("");
                mostrarLista();
                System.out.println("");
                break;
            case 3:
                System.out.println("");
               eliminarProducto();
                System.out.println("");
                break;

            case 4:
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

