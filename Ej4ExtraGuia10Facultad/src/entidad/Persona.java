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
public class Persona {
    
    protected String nombreCompleto;
    protected int dni;
    protected String estadoCivil;

    public Persona(String nombreCompleto, int dni, String estadoCivil) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
    

}
