/*
 * Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
package ej4extraguia10facultad;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.ServicioFacultad;
import entidad.Alumno;
import entidad.Persona;
import entidad.PersonalServicio;
import entidad.Profesor;

public class Ej4ExtraGuia10Facultad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ServicioFacultad log1 = new ServicioFacultad();
        ArrayList<Persona> personas = new ArrayList();
        PersonalServicio alfonso = new PersonalServicio(null,1946, 4, "Alfonso Ferreira", 8456898, "viudo");
        Profesor alberto = new Profesor("Programacion", 1975, 2, "Federico Cortez", 25849033, "casado");
        Alumno elegante = new Alumno("Queloque Elegante", 4284755, "soltero");
        Scanner leer = new Scanner(System.in);
        personas.add(alfonso);
        personas.add(alberto);
        personas.add(elegante);
        
        int opcion =0;
        do{
        System.out.println("Elija la opcion deseada");
         System.out.println("1 - Cambiar estado civil de una persona");
        System.out.println("2 - Reasignar despacho a empleado");
        System.out.println("3 - Matricular estudiante");
        System.out.println("4 - Cambio de curso de profesor");
        System.out.println("5 - Traslado de sector de empleado de servicio");
        System.out.println("6 - Imprimir info de individuo");
        System.out.println("7 - Salir");
        opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    log1.cambioEstadoCivil(log1.elegirPersona(personas));
                    break;
                case 2:
                    log1.reasignarDespacho(log1.elegirPersona(personas));
                    break;
                case 3:
                    log1.matricularEstudiante(elegante);
                    break;
                case 4:
                    log1.cambiarCurso(alberto);
                    break;
                case 5:
                    log1.trasladarPersonal(alfonso);
                    break;
                case 6:
                     System.out.println((log1.elegirPersona(personas)).toString());
                    break;
                case 7: System.out.println("Programa terminado");
            }

        }while(opcion != 7);
    }
}


    

