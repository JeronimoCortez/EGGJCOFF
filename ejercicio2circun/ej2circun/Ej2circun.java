/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package ej2circun;

import Entidad.Circunferencia;
import Servicio.ServicioCircun;
import java.util.Scanner;

public class Ej2circun {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCircun S1 = new ServicioCircun();
        Circunferencia C1 = S1.crearCircunferencia();
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Ingrese una opcion");
            System.out.println("1. Calcular area de la circunferencia");
            System.out.println("2. Calcular perimetro de la circunferencia");
            System.out.println("3. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    S1.area(C1);
                    break;
                case 2:
                    S1.perimetro(C1);
                    break;

            }

        }
    }

}
