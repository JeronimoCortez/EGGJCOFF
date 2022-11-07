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
public class ExtraHoteleros extends Alojamiento{
    protected boolean privado;
    protected int metros2;

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(boolean privado, int metros2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros2 = metros2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetros2() {
        return metros2;
    }

    public void setMetros2(int metros2) {
        this.metros2 = metros2;
    }
    
}
