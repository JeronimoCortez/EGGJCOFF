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
public class Residencia extends ExtraHoteleros{

    private int habitaciones;
    private boolean gremio;
    private boolean campodeportivo;

    public Residencia() {
    }

    public Residencia(int habitaciones, boolean gremio, boolean campodeportivo, boolean privado, int metros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros2, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.gremio = gremio;
        this.campodeportivo = campodeportivo;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isGremio() {
        return gremio;
    }

    public void setGremio(boolean gremio) {
        this.gremio = gremio;
    }

    public boolean isCampodeportivo() {
        return campodeportivo;
    }

    public void setCampodeportivo(boolean campodeportivo) {
        this.campodeportivo = campodeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + super.toString() + "habitaciones=" + habitaciones + ", gremio=" + gremio + ", campodeportivo=" + campodeportivo + '}';
    }

   

}
