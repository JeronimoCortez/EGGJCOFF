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
public class porcentaje {
   private int sobrepeso;
   private int flaco;
   private int ideal;
   private int menor;
   private int mayor;

    public porcentaje() {
    }

    public porcentaje(int sobrepeso, int flaco, int ideal, int menor, int mayor) {
        this.sobrepeso = sobrepeso;
        this.flaco = flaco;
        this.ideal = ideal;
        this.menor = menor;
        this.mayor = mayor;
    }

    public int getSobrepeso() {
        return sobrepeso;
    }

    public void setSobrepeso(int sobrepeso) {
        this.sobrepeso = sobrepeso;
    }

    public int getFlaco() {
        return flaco;
    }

    public void setFlaco(int flaco) {
        this.flaco = flaco;
    }

    public int getIdeal() {
        return ideal;
    }

    public void setIdeal(int ideal) {
        this.ideal = ideal;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
   
}
