/*
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Veleros extends Barco {
    private int Mastiles;

    public Veleros() {
    }

    public Veleros(int Mastiles, int Matricula, int Eslora, int AñoFabricacion) {
        super(Matricula, Eslora, AñoFabricacion);
        this.Mastiles = Mastiles;
    }

    public int getMastiles() {
        return Mastiles;
    }

    public void setMastiles(int Mastiles) {
        this.Mastiles = Mastiles;
    }

    @Override
    public String toString() {
        return super.toString() + " Mastiles = " + Mastiles + '}';
    }
    @Override
    public void crearBarco(){
        Scanner leer = new Scanner(System.in);
        super.crearBarco();
        System.out.println("Ingrese la cantidad de mastiles");
        Mastiles = leer.nextInt();
    }
    public void alquilarVeleros(Alquiler A){
        
        int Costo = A.alquilar() + (Mastiles * 10);
        System.out.println("El costo del alquiler es: " + Costo);
    }
    
}
