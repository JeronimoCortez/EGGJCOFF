/*
 * una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lavadora extends Electrodomesticos {
    Scanner leer = new Scanner(System.in);
    private int Carga;

    public Lavadora() {
    }

    public Lavadora(int Carga, int Precio, String Color, String Consumo, double Peso) {
        super(Precio, Color, Consumo, Peso);
        this.Carga = Carga;
    }

    public int getCarga() {
        return Carga;
    }

    public void setCarga(int Carga) {
        this.Carga = Carga;
    }
    
    public void crearLavadora(){
        System.out.println("~~~~ CREANDO LAVADORA ~~~~");
        crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga de la lavadora");
        Carga = leer.nextInt();
    }
    @Override
    public void precioFinal(){
        
        super.precioFinal();
        if(Peso >= 30){
            Precio = Precio + 500;
        }
        System.out.println("El precio final de la lavadora " + Color + " es: $" + Precio);
    }
}
