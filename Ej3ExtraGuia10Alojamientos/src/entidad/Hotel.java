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
public class Hotel extends Alojamiento{
    protected int cantidadhabitaciones;
    protected int numcamas;
    protected int cantidadpisos;
    protected Integer precio;

    public Hotel(int cantidadhabitaciones, int numcamas, int cantidadpisos, Integer precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadhabitaciones = cantidadhabitaciones;
        this.numcamas = numcamas;
        this.cantidadpisos = cantidadpisos;
        this.precio = precio;
    }

    public Hotel() {
    }

    public int getCantidadhabitaciones() {
        return cantidadhabitaciones;
    }

    public void setCantidadhabitaciones(int cantidadhabitaciones) {
        this.cantidadhabitaciones = cantidadhabitaciones;
    }

    public int getNumcamas() {
        return numcamas;
    }

    public void setNumcamas(int numcamas) {
        this.numcamas = numcamas;
    }

    public int getCantidadpisos() {
        return cantidadpisos;
    }

    public void setCantidadpisos(int cantidadpisos) {
        this.cantidadpisos = cantidadpisos;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    public void precioFinal(){
        precio= 50 + (1*numcamas);
     
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantidadhabitaciones=" + cantidadhabitaciones + ", numcamas=" + numcamas + ", cantidadpisos=" + cantidadpisos + ", precio=" + precio + '}';
    }
    

}
