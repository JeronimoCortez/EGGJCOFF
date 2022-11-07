/*
 * Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
package entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Alquiler {
    protected String Nombre;
    protected int Documento;
    protected Date FechaAlquiler;
    protected Date FechaDevolucion;
    protected int Amarre;
    protected Barco Barco;

    public Alquiler() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public Date getFechaAlquiler() {
        return FechaAlquiler;
    }

    public void setFechaAlquiler(Date FechaAlquiler) {
        this.FechaAlquiler = FechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(Date FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public int getAmarre() {
        return Amarre;
    }

    public void setAmarre(int Amarre) {
        this.Amarre = Amarre;
    }

    public Barco getBarco() {
        return Barco;
    }

    public void setBarco(Barco Barco) {
        this.Barco = Barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "Nombre=" + Nombre + ", Documento=" + Documento + ", FechaAlquiler=" + FechaAlquiler + ", FechaDevolucion=" + FechaDevolucion + ", Amarre=" + Amarre + ", Barco=" + Barco + '}';
    }
    public int alquilar(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        Nombre = leer.next();
        System.out.println("Ingrese su documento");
        Documento = leer.nextInt();
         System.out.println("Ingrese el año de la fecha de Alquiler ");
     int anio = leer.nextInt();
       System.out.println("Ingrese el mes de la fecha de Alquiler ");
     int mes = leer.nextInt();
       System.out.println("Ingrese el dia de la fecha de Alquiler ");
     int dia = leer.nextInt();
     Date fechaI = new Date(anio - 1900, mes -1, dia);
     FechaAlquiler = fechaI;
      System.out.println("Ingrese el año de la fecha de Devolucion ");
     int anioF = leer.nextInt();
       System.out.println("Ingrese el mes de la fecha de Devolucion ");
     int mesF = leer.nextInt();
       System.out.println("Ingrese el dia de la fecha de Devolucion ");
     int diaF = leer.nextInt();
     Date fechaF = new Date(anioF - 1900, mesF -1, diaF);
     FechaDevolucion = fechaF;
     int DiasAlquilados = ((mesF * 30) + diaF + anioF * 365) - ((mes * 30) + dia + (anio*365));
//     Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//multiplicando por 10 los metros de eslora).
     int Costo = DiasAlquilados * (Barco.getEslora() * 10);
     return Costo;  
    }
}
