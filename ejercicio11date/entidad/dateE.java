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
public class dateE {
  private dateE fecha;
  private int dia;
  private int mes;
  private int anio;
    public dateE() {
    }

    public dateE(dateE fecha, int dia, int mes, int anio) {
        this.fecha = fecha;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

   

    public dateE getFecha() {
        return fecha;
    }

    public void setFecha(dateE fecha) {
        this.fecha = fecha;
    }
  
}
