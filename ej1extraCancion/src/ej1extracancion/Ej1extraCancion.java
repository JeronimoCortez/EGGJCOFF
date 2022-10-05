/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extracancion;

import entidad.cancion;
import servicio.servicioCancion;

/**
 *
 * @author Usuario
 */
public class Ej1extraCancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioCancion s1 = new servicioCancion();
        cancion ca1 = s1.crearCancion();
        System.out.println("El nombre de la cancion es: " +  ca1.getTitulo());
        System.out.println("El autor de la cancion es: " +  ca1.getAutor());
       

    }

}
