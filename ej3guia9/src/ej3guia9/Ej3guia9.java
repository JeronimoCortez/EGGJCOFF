/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3guia9;

import entidad.Carta;
import java.util.Scanner;
import servicio.ServicioCarta;

/**
 *
 * @author Usuario
 */
public class Ej3guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCarta s1 = new ServicioCarta();
        
        s1.crearBaraja();
        s1.menu();
    }
}
