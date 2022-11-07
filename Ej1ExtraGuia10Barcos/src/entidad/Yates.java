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
public class Yates extends Barco{
    private int Potencia;
    private int Camarotes;

    public Yates() {
    }

    public Yates(int Potencia, int Camarotes, int Matricula, int Eslora, int AñoFabricacion) {
        super(Matricula, Eslora, AñoFabricacion);
        this.Potencia = Potencia;
        this.Camarotes = Camarotes;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public int getCamarotes() {
        return Camarotes;
    }

    public void setCamarotes(int Camarotes) {
        this.Camarotes = Camarotes;
    }

    @Override
    public String toString() {
        return super.toString() + "Potencia=" + Potencia + ", Camarotes=" + Camarotes + '}';
    }
    @Override
    public void crearBarco(){
        Scanner leer = new Scanner(System.in);
        super.crearBarco();
        System.out.println("Ingrese la potencia");
        Potencia = leer.nextInt();
        System.out.println("Ingrese la cantidad de camarotes");
        Camarotes = leer.nextInt();
        
    }
     public void alquilarYates(Alquiler A){
       
        int Costo = A.alquilar() + (Potencia * 10) + (Camarotes * 10);
        System.out.println("El costo del alquiler es: " + Costo);
    }
    
}
