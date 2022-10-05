/*
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package servicios;

import entidad.cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioCadena {

    Scanner leer = new Scanner(System.in);

    public void mostrarVocales(cadena f1) {
        int contvocal = 0;
        String f = f1.getFrase().toLowerCase();
        for (int i = 0; i < f1.getLongitud(); i++) {
            if ((f.charAt(i) == ('a') || f.charAt(i) == ('e') || f.charAt(i) == ('i') || f.charAt(i) == ('o') || f.charAt(i) == ('u'))) {
                contvocal = contvocal + 1;

            }

        }
        System.out.println("La cantidad de vocales que tiene su frase es " + contvocal);

    }

    public void invertirFrase(cadena f1) {
        String f = f1.getFrase();
        String cadenaInvertida = "";
        for (int i = f.length() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + f.charAt(i);

        }
        System.out.println("La frase invertida es " + cadenaInvertida);
    }

    public void vecesRepetido(cadena f1) {

        String f = f1.getFrase();

        System.out.println("Ingrese el caracter que desee contabilizar.");
        char letra = leer.next().charAt(0); //Esto es para leer caracteres. El 0 corresponde a la posición.
        int contvocal = 0;

        for (int i = 0; i < f1.getLongitud(); i++) {
            if ((f.charAt(i) == (letra))) {
                contvocal = contvocal + 1;
            }
        }
        System.out.println("El caracter indicado se repite en su frase " + contvocal + " veces.");
    }
  public void compararLongitud (cadena f1) {
        System.out.println("Ingrese una nueva frase.");
        String f2 = leer.next();
        
        int long2 = f2.length();
        if (f1.getLongitud() == long2){
            System.out.println("Sus cadenas tienen la misma cantidad de caracteres.");
        } else {
            System.out.println("Sus cadenas no tienen la misma longitud.");
        }
    }
public void unirFrases (cadena f1) {
        System.out.println("Ingrese una nueva frase.");
        String f3 = leer.next();
        System.out.println("Sus frases unidas son: " + f1.getFrase() + " " + f3);
    }
public void reemplazar (cadena f1){
        System.out.println("Indique el nuevo caracter que desea introducir. ");
        char letra = leer.next().charAt(0);
        
        String f5 = f1.getFrase().replace('a', letra);
        System.out.println("Su nueva frase es "+ f5);
        
    }
public void contiene (cadena f1){
       System.out.println("Indique el nuevo caracter que desea reconocer. ");
        char letra = leer.next().charAt(0);
        String f = f1.getFrase();
        boolean verificarletra = false;
        for (int i = 0; i < f1.getLongitud(); i++) {
            if ((f.charAt(i) == (letra))) {
              verificarletra = true;
            }
            }    
        System.out.println(verificarletra);
         
    }

}
