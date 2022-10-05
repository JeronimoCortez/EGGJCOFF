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
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

public class ServicioCircun {
 Circunferencia R = new Circunferencia(); 
 Scanner leer = new Scanner(System.in);
  public Circunferencia crearCircunferencia(){
      System.out.println("Ingrese el radio");
      R.setRadio(leer.nextDouble());
      return R;
  }
  public void area(Circunferencia R){
    double area = Math.PI * (Math.pow(R.getRadio(),2 )) ;
      System.out.println("El aerea de la circunferencia es: " + area);
  }
  public void perimetro(Circunferencia R){
      double perimetro = 2 * Math.PI * R.getRadio();
      System.out.println("El perimetro de la circunferencia es: " + perimetro);
  }
}
