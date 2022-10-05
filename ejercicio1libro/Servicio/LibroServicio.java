/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

public class LibroServicio {

    public Scanner leer = new Scanner(System.in);

    public Libro CargarLibro() {
        Libro LibroS = new Libro();
        System.out.println("Ingrese el titulo del libro");
        LibroS.setTitulo(leer.next());
        System.out.println("Ingrese el Autor del libro");
        LibroS.setAutor(leer.next());
        System.out.println("Ingrese el ISBN del libro");
        LibroS.setISBN(leer.nextInt());
        System.out.println("Ingrese el numero de paginas");
        LibroS.setPaginas(leer.nextInt());
        return LibroS;
    }

    public void Mostrar(Libro LibroS) {
        System.out.println(LibroS.toString());
    }
}
