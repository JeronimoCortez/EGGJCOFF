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
public class Empleado extends Persona {
    protected int anoIncorporacion;
    protected int despacho;

    public Empleado(int anoIncorporacion, int despacho, String nombreCompleto, int dni, String estadoCivil) {
        super(nombreCompleto, dni, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.despacho = despacho;
    }

    public int getAnoIncorporacion() {
        return anoIncorporacion;
    }

    public void setAnoIncorporacion(int anoIncorporacion) {
        this.anoIncorporacion = anoIncorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "anoIncorporacion=" + anoIncorporacion + ", despacho=" + despacho + '}';
    }
    
    
}
