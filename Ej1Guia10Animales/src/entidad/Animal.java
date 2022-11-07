/*
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class Animal {
    
    protected String Nombre;
    protected String alimento;
    protected String Raza;
    protected int Edad;

    public Animal() {
    }

    public Animal(String Nombre, String alimento, String Raza, int Edad) {
        this.Nombre = Nombre;
        this.alimento = alimento;
        this.Raza = Raza;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public void alimenta(){
        
    }
}
