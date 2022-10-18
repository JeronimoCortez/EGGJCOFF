/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioAdopcion {
     Scanner leer = new Scanner (System.in).useDelimiter("\n");
   
   ArrayList <Persona> duenios = new ArrayList <>();
    ArrayList <Perro> mascota = new ArrayList <>();
      ArrayList <Perro> mascotaDisp = new ArrayList <>(); 
  public void crearPersonas (){
       String rta;
      do { 
           System.out.println("Ingrese los datos de las personas que quieran adoptar mascotas.");
            Persona p = new Persona ();
        System.out.println("NOMBRE");
             p.setNombre(leer.next());
          System.out.println("APELLIDO");
          p.setApellido(leer.next());
            System.out.println("DNI");
          p.setDni(leer.nextInt());
            System.out.println("EDAD");
           p.setEdad(leer.nextInt());
       duenios.add(p);
        System.out.println("");
            System.out.println("¿Desea ingresar los datos de otra persona?");
            rta= leer.next();
     } while (rta.equalsIgnoreCase("si"));
    }
 public void crearPerro (){
       String rta;
      do { 
           System.out.println("Ingrese los datos de las mascotas.");
            Perro p = new Perro ();
        System.out.println("NOMBRE");
             p.setNombre(leer.next());
          System.out.println("RAZA");
          p.setRaza(leer.next());
            System.out.println("EDAD");
          p.setEdad(leer.nextInt());
            System.out.println("TAMAÑO");
           p.setTamanio(leer.next());
       mascota.add(p);
       mascotaDisp.add(p);
        System.out.println("");
            System.out.println("¿Desea ingresar los datos de otra mascota?");
            rta= leer.next();
     } while (rta.equalsIgnoreCase("si"));
    }
 
 public void elegirMascota (){
       String rta;
       String respuesta;
       String opcion= "no";
       int cont = 0;
       int cPersona = 0; //Lo utilizo para chequear si se ingreso un nombre que se encuentra en la lista de las personas
       int cPerro = mascota.size(); //Lo utilizo para chequear si se ingreso un nombre que se encuentra en la lista de perros
        do {
            if(mascota.size() == 0){
                System.out.println("No hay mascotas para adoptar");
                break;
            }
         System.out.println("---------------------------------------------------------- ");
         System.out.println("Ingrese el nombre de la persona que quiere tener un perro");
        respuesta = leer.next();
        System.out.println("-----------------------------------------------------------");
        
        System.out.println("Ingrese el nombre de la mascota que desea adoptar");
        rta = leer.next ();    
        
        Iterator <Persona> it = duenios.iterator();
        Iterator <Perro> itDos = mascota.iterator();
         while(it.hasNext()){
         Persona aux = it.next();
         
         if(respuesta.equalsIgnoreCase(aux.getNombre())){
             cPersona = 1; // si ingresa es porque el nombre estaba en la lista de personas
             while(itDos.hasNext()){
                 Perro auxDos = itDos.next();
                 if(rta.equalsIgnoreCase(auxDos.getNombre())){
                     aux.setPerro(auxDos);
                     mascotaDisp.remove(auxDos); // se remueve del listado de mascota disponibles 
                     auxDos.setAdoptado(true);
                     cont = cont +1;
                 }
                 
             }
         }
         }   
         if(cPersona == 0){ //Si no se ha incrementado este contador es porque no ingresaron un nombre regitrado en la lista de personas
             System.out.println("LA PERSONA INGRESADA NO ESTA EN EL REGISTRADA EN EL SISTEMA ");
             
         }   else if (cPerro == (mascota.size()- cont)){ // si el cont esta en 0 es que no ingreso nunca al bucle, es decir que no han ingresado nombre de perro registrados
             System.out.println("EL PERRO INGRESADO NO ESTA REGISTRADO EN EL SISTEMA");
         }
         
        if((mascota.size() - cont) > 0 && (duenios.size() - cont) > 0){ // verifica que hayan mas perros por adoptar o personas sin perros
        System.out.println("Quedan " + (mascota.size() - cont) + " perritos para adoptar.");
        System.out.println("");
        System.out.println("¿Alguien más desea adoptar una mascota? ");
            opcion = leer.next();
            System.out.println("");
               System.out.println("Todavía quedan las siguientes mascotas por adoptar");
            for (Perro aux : mascotaDisp) {
                System.out.println(aux.toString());  
            }
        }
        } while (opcion.equalsIgnoreCase("si"));
      
        
    }
    public void mostraPerro(){
           System.out.println("El listado de mascotas es: ");
            for (Perro aux : mascota) {
                System.out.println(aux.toString());  
            }
    }
    public void mostrarPersonas () {
        System.out.println("Los datos de la adopión de perros son :");
        for (Persona aux : duenios) {
            System.out.println(aux.toString());
        }
    }
}


