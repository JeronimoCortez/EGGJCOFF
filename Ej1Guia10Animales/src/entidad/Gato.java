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
public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String Nombre, String alimento, String Raza, int Edad) {
        super(Nombre, alimento, Raza, Edad);
    }
     @Override
    public void alimenta(){
        System.out.println("El gato " + Nombre + " se alimenta con " + alimento);
    }
}
