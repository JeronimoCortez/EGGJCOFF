/*
 *Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package servicio;

import entidad.persona;
import entidad.porcentaje;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class serviciopersona {
    Scanner leer = new Scanner(System.in);
    porcentaje A = new porcentaje();
   public persona crearPersona(){
     persona P = new persona();
       System.out.println("Ingrese su nombre");
       P.setNombre(leer.next());
       System.out.println("Ingrese su sexo(H = hombre, M = mujero, O = otro)");
       P.setSexo(leer.next());
        while(!P.getSexo().equals("H") && !P.getSexo().equals("M") && !P.getSexo().equals("O")  ){
             System.out.println("ICORRECTO INGRESE SU SEXO NUEVAAMENTE(H = hombre, M = mujero, O = otro)");
       P.setSexo(leer.next());
        }
        System.out.println("Ingrese su edad");
        P.setEdad(leer.nextInt());
        System.out.println("Ingrese su peso");
        P.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura");
        P.setAltura(leer.nextDouble());
       return P;
   } 
   public int CalcularIMC( persona P){
       //kg/(altura^2 en mt2))
       double calculo = P.getPeso() / Math.pow(P.getAltura(),2);
       int resultado=0;
       if (calculo==20){
        resultado = -1;  
        A.setFlaco(A.getFlaco()+1);
       }    
       else if(calculo >= 20 && calculo <= 25){
           resultado = 0;
        A.setIdeal(A.getIdeal()+1);
       }
       else if(calculo < 25){
           resultado = 1;
           A.setSobrepeso(A.getSobrepeso()+1);
       }
       return resultado;
   }
   public boolean esMayorEdad(persona P){
       boolean Mayor = false;
       if(P.getEdad() >= 18){
           Mayor = true;
           A.setMayor(A.getMayor()+1);
       }else{
           A.setMenor(A.getMenor()+1);
       }
       return Mayor;
   }
   public void resultado(){
       System.out.println("El porcentaje de personas con bajo peso es: " + A.getFlaco()*100/4); 
       System.out.println("El porcentaje de personas con peso ideal es: "+ A.getIdeal()*100/4);
       System.out.println("El porcentaje de personas con sobrepeso es: " + A.getSobrepeso()*100/4); 
       System.out.println("El porcentaje de personas mayores de edad es: "+ A.getMayor()*100/4);
       System.out.println("El porcentaje de personas menores de edad es: " + A.getMenor()*100/4);
   }
}
