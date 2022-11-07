/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class Profesor extends Empleado{
    private String curso;

    public Profesor(String curso, int anoIncorporacion, int despacho, String nombreCompleto, int dni, String estadoCivil) {
        super(anoIncorporacion, despacho, nombreCompleto, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesores{" + "curso=" + curso + '}';
    }
    
    
    
}
