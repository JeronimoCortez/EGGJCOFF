/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import java.util.ArrayList;
import java.util.Scanner;
import entidad.Alumno;
import entidad.Empleado;
import entidad.Persona;
import entidad.PersonalServicio;
import entidad.Profesor;

public class ServicioFacultad {
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cambioEstadoCivil(Persona per){
        System.out.println("Ingrese el nuevo estado civil");
        String estado = leer.next();
        per.setEstadoCivil(estado);

    }
    
    public void reasignarDespacho(Persona emp){
     System.out.println("Ingrese el nuevo estado civil");
        String estado = leer.next();
        emp.setEstadoCivil(estado);
    }
    
    public void matricularEstudiante(Alumno alum){
        System.out.println("Ingrese el nuevo curso a inscribirse");
        String curso = leer.next();
        alum.setCurso(curso);
    }
    
    public void cambiarCurso(Profesor prof){
        System.out.println("Ingrese a que curso desea cambiarse");
        String curso = leer.next();
        prof.setCurso(curso);
    }
    
    public void trasladarPersonal(PersonalServicio per){
        System.out.println("A que area desea cambiarse?");
        System.out.println("1 - Lavanderia");
        System.out.println("2 - Biblioteca");
        System.out.println("3 - Secretaria");
        System.out.println("4 - Decanato");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1: per.setSeccion("Lavanderia");
                break;
                case 2: per.setSeccion("Biblioteca");
                break;
                case 3: per.setSeccion("Secretaria");
                break;
                case 4: per.setSeccion("Decanato");
                break;
                default: System.out.println("La opcion es incorrecta");
        }
    }
    
    public Persona elegirPersona(ArrayList<Persona> per){
        for (Persona aux : per) {
            System.out.println(aux.getNombreCompleto() + " " +  aux.getClass());
        }
        System.out.println("Ingrese el nombre de la persona tal cual lo vio");
        String nombre = leer.next();
        
        for (Persona persona : per) {
            if(nombre.equals(persona.getNombreCompleto())){
                return persona;   
        }
        }
        System.out.println("Persona no encontrada");
        return null;
    }
    
    
}


