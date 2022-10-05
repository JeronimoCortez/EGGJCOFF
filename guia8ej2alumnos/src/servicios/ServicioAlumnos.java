/*
 * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package servicios;

import entidad.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioAlumnos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumnos> nombres = new ArrayList();
    
    public Alumnos crearAlumno() {
        Alumnos A1 = new Alumnos();
        ArrayList<Integer> N = new ArrayList();
        
        String nombre;
        
            System.out.println("Ingrese el nombre del alumno");
            nombre = leer.next();
            System.out.println("Ingrese las notas del alumno");
            
            for (int i = 0; i < 3; i++) {
                N.add(leer.nextInt());
                
            }
            nombres.add(new Alumnos(nombre , N));
            
//    System.out.println(A1.getNombre() );
//    System.out.println(A1.getNotas().toString());
     
        
        return A1;
    }
    public void general(){
        String salir;
         do {
            crearAlumno();
            System.out.println("¿Desea ingresar otro alumno?(SI/NO)");
            salir = leer.next();
            
        } while (!salir.equalsIgnoreCase("no"));
    }
    public void mostrar(){
        for (Alumnos aux : nombres) {
            System.out.println(aux);
        }
   
    }

    public void notaFinal() {
        String buscar;
        ArrayList <Integer> N = new ArrayList();//Arrays auxiliar para recorrer las notas.
        
        Integer tresnotas = 0;
        System.out.println("¿De que alumnos deseea calcular el promedio?");
        buscar = leer.next();
        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).getNombre().equalsIgnoreCase(buscar)) {
              N = nombres.get(i).getNotas();
            }
            }
        for (int i = 0; i < N.size();i ++){
        tresnotas = tresnotas + N.get(i);
          
        }
        double promedio = (double)tresnotas / 3; //tresnotas lo converti a double porque estaba declarado como integer
        System.out.println("El promedio del alumno es: " + promedio);
        }
        
    
}
