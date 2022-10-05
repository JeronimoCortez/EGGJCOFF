/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4extranif;

import entidad.NIF;
import servicio.servicioNif;

/**
 *
 * @author Usuario
 */
public class Ej4extraNIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       servicioNif s1 = new servicioNif();
       NIF n1 = s1.creanNif();
       s1.mostra(n1);
    }
    
}
