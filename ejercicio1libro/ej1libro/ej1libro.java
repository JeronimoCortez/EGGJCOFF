/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1libro;

import Servicio.LibroServicio;
import Entidad.Libro;

public class ej1libro {

    public static void main(String[] args) {

        LibroServicio LibroS = new LibroServicio();
        Libro LibroL1 = LibroS.CargarLibro();
        LibroS.Mostrar(LibroL1);

    }

}
