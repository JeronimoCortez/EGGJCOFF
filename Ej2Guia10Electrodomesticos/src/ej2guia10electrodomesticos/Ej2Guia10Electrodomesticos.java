/*
 * Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package ej2guia10electrodomesticos;

import entidad.Electrodomesticos;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;



/**
 *
 * @author Usuario
 */
public class Ej2Guia10Electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList <Electrodomesticos> Electrodomesticos = new ArrayList<>();
     
     Lavadora L = new Lavadora(40,1000, "negro", "A", 40d);
     Lavadora LUno = new Lavadora(100,1000, "blanco", "L", 80d);
     Televisor T =  new Televisor(42, true, 1000, "azul", "B", 30d);
     Televisor TUno =  new Televisor(32, false, 1000, "celeste", "C", 20d);
     Electrodomesticos.add(L);
     Electrodomesticos.add(LUno);
     Electrodomesticos.add(T);
     Electrodomesticos.add(TUno);
        for (Electrodomesticos aux : Electrodomesticos) {
            if(aux instanceof Lavadora){
                aux.precioFinal();
            }
            if(aux instanceof Televisor){
                aux.precioFinal();
            }
        }
     
     
    int PrecioTotal = 0;
    for(int i = 0; i < Electrodomesticos.size(); i++){
      PrecioTotal =PrecioTotal + Electrodomesticos.get(i).getPrecio();
    }
    
        System.out.println("El precio de todos los electrodomesticos de la lista es: $" + PrecioTotal);
        }
}
