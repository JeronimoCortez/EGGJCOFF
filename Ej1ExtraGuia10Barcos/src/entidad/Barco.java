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
public class Barco {
   protected int Matricula;
   protected int Eslora;
   protected int AñoFabricacion;

    public Barco() {
    }

    public Barco(int Matricula, int Eslora, int AñoFabricacion) {
        this.Matricula = Matricula;
        this.Eslora = Eslora;
        this.AñoFabricacion = AñoFabricacion;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public int getEslora() {
        return Eslora;
    }

    public void setEslora(int Eslora) {
        this.Eslora = Eslora;
    }

    public int getAñoFabricacion() {
        return AñoFabricacion;
    }

    public void setAñoFabricacion(int AñoFabricacion) {
        this.AñoFabricacion = AñoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "Matricula=" + Matricula + ", Eslora=" + Eslora + ", AnioFabricacion=" + AñoFabricacion ;
    }
   public void crearBarco(){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese la matricula del barco");
       Matricula = leer.nextInt();
       System.out.println("Ingrese los Metros de eslora del barco");
       Eslora = leer.nextInt();
       System.out.println("Ingrese el año de fabricacion");
       AñoFabricacion = leer.nextInt();
   }
}
