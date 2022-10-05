/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Libro {

    public int ISBN;
    public int Paginas;
    public String Autor;
    public String Titulo;

    public Libro() {
    }

    public Libro(int ISBN, int Paginas, String Titulo, String Autor) {
        this.ISBN = ISBN;
        this.Paginas = Paginas;
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Paginas=" + Paginas + ", Autor=" + Autor + ", Titulo=" + Titulo + '}';
    }

}
