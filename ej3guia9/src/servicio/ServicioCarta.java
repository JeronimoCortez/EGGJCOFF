/*
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package servicio;

import entidad.Carta;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCarta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Carta> baraja = new ArrayList<>();
    ArrayList<Carta> eliminadas = new ArrayList<>();
 
    public void crearBaraja() {

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {

                if (j == 8) {
                    j = 10;
                }
                baraja.add(new Carta(j, Integer.toString(i)));
               
            }

        }
        
        System.out.println("");
       

    }

    public void barajar() {
        shuffle(baraja);
        System.out.println("");
        System.out.println("Mezclando baraja");
        System.out.println("*** BARAJA MEZCLADA ***");
        System.out.println("");

    }

    public void siguienteCarta() {
        System.out.println("");
        String salir;
        System.out.println("Mostrar carta");
        for (int i = 0;;) { //i++ no va porque al eliminar el primer el elemento, el siguiente siempre tiene que ocupar la posicion 0
            System.out.println("");
            System.out.println(baraja.get(i));
            eliminadas.add(baraja.get(i));
            baraja.remove(i);
            System.out.println("¿Desea ver la siguiente carta?");
            salir = leer.next();
            if (salir.equalsIgnoreCase("no")) {
                break;
            } else if (baraja.size() == 0) {
                System.out.println("No quedan mas cartas");
            }
        }
    }
    public void cartasDisponibles(){
        System.out.println("La cantidad de cartas disponibles es: " + baraja.size());
    }
    
    public void darCartas(){
        int cant;
        System.out.println("¿Cuantas cartas quiere repartir?");
        cant = leer.nextInt();
        if(cant > baraja.size()){
            System.out.println("No hay suficientes cartas");
        }else{
            for(int i = 0 ; i < baraja.size() ; ){
              eliminadas.add(baraja.get(i));
              baraja.remove(i);
            
            }
            System.out.println("Ahora quedan " + baraja.size() + " cartas");
        }
    }
    public void mostrarMonton(){
        if(eliminadas.size()== 0){
            System.out.println("No se ha sacado ninguna carta del mazo");
            
        }else{
            System.out.println("Las cartas que estan fuera del mazo son: ");
            for (Carta aux : eliminadas) {
                System.out.println(aux.toString());
            }
        }
    }
    public void mostrarBaraja(){
        System.out.println("La baraja quedo");
        for (Carta aux : baraja) {
            System.out.println(aux.toString());
        }
    }
    public void menu(){
        
        int op;
          do {
            System.out.println("*** INGRESE UNA OPCION ***");
            System.out.println("1. BARAJAR CARTAS");
            System.out.println("2. MOSTRAR LA SIGUIENTE CARTA");
            System.out.println("3. MOSTRAR CANTIDAD DE CARTAS DISPONIBLES");
            System.out.println("4. DAR CARTAS");
            System.out.println("5. MOSTRAR LAS CARTAS DEL MONTON");
            System.out.println("6. MOSTRAR BARAJA ACTUAL");
            System.out.println("7. SALIR");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    barajar();
                    break;
                case 2:
                   siguienteCarta();
                    break;
                case 3:
                  cartasDisponibles();
                    break;
                           case 4:
                 darCartas();
                    break;
                      case 5:
                 mostrarMonton();
                    break;
                      case 6:
                  mostrarBaraja();
                    break;
                      case 7:
                        
                          break;
            }

            
            
          
           
        } while (op != 7 && baraja.size() > 0  );
        System.out.println("JUEGO TERMINADO");
    }
}
