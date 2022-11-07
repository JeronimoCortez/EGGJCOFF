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
public class Hotel4 extends Hotel{
    protected String gimnasio;
    protected String restaurant;
    protected int capacidadrestaurant;

    public Hotel4(String gimnasio, String restaurant, int capacidadrestaurant, int cantidadhabitaciones, int numcamas, int cantidadpisos, Integer precio, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadhabitaciones, numcamas, cantidadpisos, precio, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.restaurant = restaurant;
        this.capacidadrestaurant = capacidadrestaurant;
    }

    public Hotel4() {
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public int getCapacidadrestaurant() {
        return capacidadrestaurant;
    }

    public void setCapacidadrestaurant(int capacidadrestaurant) {
        this.capacidadrestaurant = capacidadrestaurant;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        int precioresto = precioResto();
        int gimnasio = precioGimnasio();
        precio= precio+gimnasio+precioresto;
}
    
    
    public int precioResto(){
       if (capacidadrestaurant<30){
           return 10;
       }else if(capacidadrestaurant>30&&capacidadrestaurant<50){
           return 30;
       }else if (capacidadrestaurant>=50){
           return 50;
       }
       return 0;
    }
    
    
    public int precioGimnasio(){
        if (gimnasio.equals("A")){
            return 50;
        }else if (gimnasio.equals("B")){
            return 30;
        }
        return 0;
    }

    @Override
    public String toString() {
        
        return "Hotel4{" + super.toString() + "gimnasio=" + gimnasio + ", restaurant=" + restaurant + ", capacidadrestaurant=" + capacidadrestaurant + '}';
    }
        
}
