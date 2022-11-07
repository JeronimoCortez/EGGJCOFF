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
public class Hotel5 extends Hotel4{
    private int cantidadconferencia;
    private int cantidadsuites;
    private int cantidadlimusinas;

    public Hotel5() {
    }

    public Hotel5(int cantidadconferencia, int cantidadsuites, int cantidadlimusinas, String gimnasio, String restaurant, int capacidadrestaurant, int cantidadhabitaciones, int numcamas, int cantidadpisos, Integer precio, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, restaurant, capacidadrestaurant, cantidadhabitaciones, numcamas, cantidadpisos, precio, nombre, direccion, localidad, gerente);
        this.cantidadconferencia = cantidadconferencia;
        this.cantidadsuites = cantidadsuites;
        this.cantidadlimusinas = cantidadlimusinas;
    }

    public int getCantidadconferencia() {
        return cantidadconferencia;
    }

    public void setCantidadconferencia(int cantidadconferencia) {
        this.cantidadconferencia = cantidadconferencia;
    }

    public int getCantidadsuites() {
        return cantidadsuites;
    }

    public void setCantidadsuites(int cantidadsuites) {
        this.cantidadsuites = cantidadsuites;
    }

    public int getCantidadlimusinas() {
        return cantidadlimusinas;
    }

    public void setCantidadlimusinas(int cantidadlimusinas) {
        this.cantidadlimusinas = cantidadlimusinas;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        int preciolimusinas= cantidadlimusinas*15;
        precio= precio+preciolimusinas;
        
    }

    @Override
    public String toString() {
        return "Hotel5{"+ super.toString() + "cantidadconferencia=" + cantidadconferencia + ", cantidadsuites=" + cantidadsuites + ", cantidadlimusinas=" + cantidadlimusinas + '}';
    }
    
  

}
