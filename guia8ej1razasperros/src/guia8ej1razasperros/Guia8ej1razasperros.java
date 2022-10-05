/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1razasperros;

import entidad.perros;
import servicio.servicioPerro;

/**
 *
 * @author Usuario
 */
public class Guia8ej1razasperros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    servicioPerro S1 = new servicioPerro();
    perros P1 = new perros();
    S1.crearPerro();
    S1.buscarperros();
    
    }
    
}
