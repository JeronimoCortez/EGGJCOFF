/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej5paises;

import servicios.ServicioPaises;


public class Guia8ej5paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioPaises S1 = new ServicioPaises();
       S1.ingresarPaises();
       S1.ordenarPais();
       S1.eliminarPais();
    }
    
}
