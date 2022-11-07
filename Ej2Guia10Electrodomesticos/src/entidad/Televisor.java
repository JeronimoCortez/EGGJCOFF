/*
 * Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Televisor extends Electrodomesticos {
    Scanner leer = new Scanner(System.in);
    private int Resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int Resolucion, boolean TDT, int Precio, String Color, String Consumo, double Peso) {
        super(Precio, Color, Consumo, Peso);
        this.Resolucion = Resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return Resolucion;
    }

    public void setResolucion(int Resolucion) {
        this.Resolucion = Resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearTelevisor(){
        System.out.println("~~~~ CREANDO TELEVISOR ~~~~");
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion en cantidad de pulgadas");
        Resolucion = leer.nextInt();
        System.out.println("Ingrese si tiene sintonizador TDT (TRUE/FALSE)");
        TDT = leer.nextBoolean();
    }
    @Override
     public void precioFinal(){
         super.precioFinal();
         if(Resolucion > 40){
             Precio = Precio + ((Precio * 30) / 100);
         }
         if(TDT == true){
             Precio = Precio + 500;
         }
         System.out.println("El precio final del telvisor " + Color + " es: $" + Precio);
     }
    
}
