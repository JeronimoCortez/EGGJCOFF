/*
 * protected String Nombre;
    protected String alimento;
    protected int edad;
    protected String raza;
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String Nombre, String alimento, String Raza, int Edad) {
        super(Nombre, alimento, Raza, Edad);
    }
    
    @Override
    public void alimenta(){
        System.out.println("El perro " + Nombre + " se alimenta con " + alimento);
    }
    
}
