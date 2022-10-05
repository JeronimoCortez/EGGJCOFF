/*
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioPersona {
    
    Scanner leer = new Scanner(System.in);
  public Persona crearPersona(){
      Persona p1 = new Persona();
      System.out.println("Ingrese su nombre");
      p1.setNombre(leer.nextLine());
      System.out.println("Ingrese su fecha de nacimiento");
      System.out.print("Dia: ");
      int dia = leer.nextInt();
      System.out.print("Mes: ");
      int mes = leer.nextInt();
      System.out.print("Año: ");
      int año = leer.nextInt();
      Date fecha = new Date(año - 1900, mes - 1, dia);
      p1.setNacimiento(fecha);
      return p1;
  }
  public int calcularEdad(Persona p1){
      
      Date fechaActual = new Date();
      int edad =  (fechaActual.getYear() - p1.getNacimiento().getYear());
      return edad;
  }
  public void menorQue(int edad){
      boolean comparacion;
      int edad2;
      System.out.println("Ingrese la edad de la persona que desea comparar");
      edad2 = leer.nextInt();
      if(edad2 < edad){
          comparacion = true;
      }
      else{
          comparacion = false;
      }
      System.out.println("Usted es mayor que la persona " + comparacion);
      
  }
  public void mostrarPersona(Persona p1, int edad){
       System.out.println("Su edad es: " + edad + " años");
       System.out.println("Su nombre es: " + p1.getNombre());
  }
}
