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
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int ID, String nombre, boolean Mojado) {
        this.id = ID;
        this.nombre = nombre;
        this.mojado = Mojado;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean Mojado) {
        this.mojado = Mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + id + ", nombre=" + nombre + ", Mojado=" + mojado + '}';
    }
    
//    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
     
  public void disparo(Revolver r){
      
     if( r.mojar() == true){
         mojado = true;
         System.out.println("Jugador mojado");
         
     }else{
         mojado = false;
         System.out.println("El jugador no se mojo");
         
     }
  }
}
