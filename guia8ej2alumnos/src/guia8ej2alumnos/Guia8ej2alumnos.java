/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej2alumnos;

import entidad.Alumnos;
import servicios.ServicioAlumnos;

/**
 *
 * @author Usuario
 */
public class Guia8ej2alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ServicioAlumnos S1 = new ServicioAlumnos();
     
     S1.general();
     S1.mostrar();
     S1.notaFinal();
    }
    
}
