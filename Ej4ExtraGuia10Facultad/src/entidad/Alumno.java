/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Alumno extends Persona{
    private ArrayList<String> curso;

    public Alumno(String nombreCompleto, int dni, String estadoCivil) {
        super(nombreCompleto, dni, estadoCivil);
        this.curso = new ArrayList<String>();
    }

    public ArrayList<String> getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso.add(curso);
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "curso=" + curso + '}';
    }

    
}

