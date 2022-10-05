/*
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------

31

Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package servicio;

import entidad.ahorcado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioAhorcado {

    Scanner leer = new Scanner(System.in);

    public ahorcado crearJuego() {
        String palabrausuario;
        ahorcado A1 = new ahorcado();
        System.out.println("**** COMENCEMOS ARMANDO NUESTRO AHORCADO ****");
        System.out.println("Ingrese la palabra");
        palabrausuario = leer.nextLine();
        System.out.println("Ingrese cantidad de jugadas maximas");
        A1.setJugadasmax(leer.nextInt());
        A1.setLetras(0);
        int longitud = palabrausuario.length();
        String palabra[] = new String[longitud];
        String[] parcial = new String[longitud]; //usamos esta variable para mostrar los espacios de las letras faltantes con un guion, y mostrar las letras acertadas
        for (int i = 0; i < palabrausuario.length(); i++) {
            palabra[i] = palabrausuario.substring(i, i + 1);

        }
        for (int i = 0; i < palabrausuario.length(); i++) { //aca llenamos la variable parcial2 con los guiones ("_")
            parcial[i] = "_";
            System.out.print(parcial[i] + " ");

        }
        A1.setParcial(parcial);
        A1.setPalabra(palabra);
        return A1;

    }

    public int mostrarlongitud(ahorcado A1) {
        int longitud = A1.getPalabra().length;

        System.out.println("La longitud de la palabra es: " + longitud);
        return longitud;
    }

    public void buscar(ahorcado A1) {
        String ingresarletra;
        String[] parcial2 = A1.getParcial();
        int cont = 0;
        boolean verificar = false; //nos sirve para verificar las letras incorrectas y restar los intentos

        System.out.println("Ingrese una letra");
        ingresarletra = leer.next();
        for (int i = 0; i < A1.getPalabra().length; i++) {

            if (ingresarletra.equals(A1.getPalabra()[i])) {
                parcial2[i] = ingresarletra; // se reemplaza el guion por la letra
                verificar = true; 
            }

            if (parcial2[i].equals("_")) {
                cont = cont + 1; //se usa este contador para sumar la cantidad de guiones que quedan (nos va servir para darle valor a la cantidad de letras acertadas)
            }

        }
        if (verificar == false) {
            A1.setJugadasmax(A1.getJugadasmax() - 1); //usamos la variable jugadasmax para ir restando los intentos
        }
        for (int i = 0; i < A1.getParcial().length; i++) {
            System.out.print(parcial2[i] + " ");

        }
        A1.setLetras(A1.getPalabra().length - cont); //cantidad de letras acertadas
        System.out.println("La cantidad de letras encontradas y faltantes es (" + A1.getLetras() + "," + cont + ")");

    }

    public int intentos(ahorcado A1) {
        int intentos = A1.getJugadasmax();
        System.out.println("intentos restantes: " + A1.getJugadasmax());
        return intentos;
    }

    public void juego(ahorcado A1) {
        String palabra2 = "";
        String letra;
        for (int i = 0; i < A1.getPalabra().length; i++) { //usamos esto para poder mostrar la palabra como un String ya que la habiamos guardado en un vector
            letra = A1.getPalabra()[i];
            palabra2 = palabra2 + letra;
        }
        while (A1.getJugadasmax() > 0 && A1.getLetras() < A1.getPalabra().length) {
            mostrarlongitud(A1);
            buscar(A1);
            intentos(A1);
        }
        if (A1.getLetras() == A1.getPalabra().length) { 
            System.out.println("**** ADIVINASTE LA PALABARA ¡¡FELICITACIONES!! ****");
            System.out.println("LA PALABRA ES: " + palabra2);
        } else if (A1.getLetras() != A1.getPalabra().length && A1.getJugadasmax() == 0) {
            System.out.println("SE AGOTARON LOS INTENTOS, NO PUDISTE ADIVINAR, LA PALABRA ERA: " + palabra2);
        }

    }
}
