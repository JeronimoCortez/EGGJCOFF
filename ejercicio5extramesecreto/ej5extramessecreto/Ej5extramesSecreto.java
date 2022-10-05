/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5extramessecreto;

import entidad.mesSecreto;
import servicio.servicioMesSecreto;

/**
 *
 * @author Usuario
 */
public class Ej5extramesSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       servicioMesSecreto S1 = new servicioMesSecreto();
       mesSecreto M1 = new mesSecreto();
       S1.adivinar();
    }
    
}
