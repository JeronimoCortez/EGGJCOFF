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
public class Camping extends ExtraHoteleros{
    private int carpas;
    private int banios;
    private boolean restaurant;

    public Camping() {
    }

    public Camping(int carpas, int banios, boolean restaurant, boolean privado, int metros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros2, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banios = banios;
        this.restaurant = restaurant;
    }

    public int getCarpas() {
        return carpas;
    }

    public void setCarpas(int carpas) {
        this.carpas = carpas;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Camping{" + super.toString() + "carpas=" + carpas + ", baÃ±os=" + banios + ", restaurant=" + restaurant + '}';
    }

}
