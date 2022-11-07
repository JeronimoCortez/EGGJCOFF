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
public class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio(String seccion, int anoIncorporacion, int despacho, String nombreCompleto, int dni, String estadoCivil) {
        super(anoIncorporacion, despacho, nombreCompleto, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "PersonalServicio{" + "seccion=" + seccion + '}';
    }
    
    
}

