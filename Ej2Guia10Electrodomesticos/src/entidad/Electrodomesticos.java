/*
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
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
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
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
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Electrodomesticos {
  protected int Precio;
  protected String Color;  
  protected String Consumo;
  protected double Peso;
    Scanner leer = new Scanner(System.in);
    public Electrodomesticos() {
    }

    public Electrodomesticos(int Precio, String Color, String Consumo, double Peso) {
        this.Precio = Precio;
        this.Color = Color;
        this.Consumo = Consumo;
        this.Peso = Peso;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getConsumo() {
        return Consumo;
    }

    public void setConsumo(String Consumo) {
        this.Consumo = Consumo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    
  public void comprobarConsumoEnergetico(){
      
      if(!Consumo.equalsIgnoreCase("A") && !Consumo.equalsIgnoreCase("B") && !Consumo.equalsIgnoreCase("C") && !Consumo.equalsIgnoreCase("D") && !Consumo.equalsIgnoreCase("E")){
          Consumo = "F";
      }
  }
  public void comprobarColor(){
    
      if (!Color.equalsIgnoreCase("negro") && !Color.equalsIgnoreCase("rojo") && !Color.equalsIgnoreCase("azul") && !Color.equalsIgnoreCase("gris")){
          Color = "blanco";
      }
  }
 
  public void crearElectrodomestico(){
      System.out.println("Ingrese el color del electrodomestico");
      Color = leer.next();
      System.out.println("Ingrese la letra del consumo del electrodomestico (A-F)");
      Consumo = leer.next();
      System.out.println("Ingrese el peso del elctrodomestico");
      Peso = leer.nextInt();
      Precio = 1000;
  }
   public void precioFinal(){
    comprobarColor();
    comprobarConsumoEnergetico();
   switch(Consumo.toUpperCase()){
       case "A":
           Precio = Precio + 1000;
           break;
           case "B":
           Precio = Precio + 800;
           break;
           case "C":
           Precio = Precio + 600;
           break;
           case "D":
           Precio = Precio + 500;
           break;
           case "E":
           Precio = Precio + 300;
           break;
           case "F":
           Precio = Precio + 100;
           break;
   }
   
   if(Peso >= 1 && Peso <= 19){
       Precio = Precio + 100;
   }else if(Peso >= 20 && Peso <= 49){
       Precio = Precio + 500;
   }else if(Peso >= 50 && Peso <= 79){
       Precio = Precio + 800;
   }else if(Peso >= 80){
       Precio = Precio + 1000;
   }
  
 }
}