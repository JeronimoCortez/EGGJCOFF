/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Juego {

   private Revolver r1;
    private ArrayList<Jugador> jugadores;

    public Juego() {
    }

    public Juego(Revolver R1, ArrayList<Jugador> jugadores) {
       this.r1 = R1;
        this.jugadores = jugadores;
    }

    public Revolver getR1() {
        return r1;
    }

    public void setR1(Revolver R1) {
        this.r1 = R1;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void llenarRevolver() {

    }
//    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//
//10
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

    public void llenarJuego(ArrayList<Jugador> listaJugadores, Revolver r) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String salir;
        System.out.println("****** COMENCEMOS ARMANDO EL JEUGO ******");
        do{
        Jugador j1 = new Jugador();
        System.out.println("Ingrese el ID del jugador: ");
        j1.setID(leer.nextInt());
        System.out.println("Ingrese el nombre del jugador: ");
        j1.setNombre(leer.next());
        j1.setMojado(false);
        listaJugadores.add(j1);
        System.out.println("¿Desea cargar otro jugador? (SI/NO)");
        do{
         
         salir = leer.next();
         if( !salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no")){
             System.out.println("Por favor ingrese SI/NO");
         }
        }while(!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no"));
        }while(salir.equalsIgnoreCase("si"));
        
        r1 = r;
        r1.llenarRevolver();
        jugadores = listaJugadores;
       
        System.out.println("Juego lleno");
        System.out.println("");
        System.out.println("La lista de jugadores es :");
        System.out.println("");
        for (Jugador aux : listaJugadores) {
            System.out.println(aux);
        }

    }

    public void ronda() {
        Jugador aux = new Jugador();
         String proxRonda;
        Scanner leer = new Scanner(System.in);
        System.out.println("*** COMIENZA EL JUEGO ***");
        do {
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println("La posicion del revolver es: " + r1.getPosicionActual());
                aux = jugadores.get(i);
                System.out.println("Es tu turno: " + jugadores.get(i).toString());
                System.out.println("*** DISPARO ***");
               
                aux.disparo(r1);
               
                if (aux.isMojado() == true) {
                    System.out.println("Juego terminado, el jugador " + aux.toString() + "se mojo");
                    System.out.println("La posicion del agua en el revolver era: " +r1.getPosicionAgua());
                    break;
                }
                r1.siguienteChorro();
            
            if(aux.isMojado() == false){
            System.out.println("¿Estan listo para la siguiente ronda?(SI/NO), SI ELIGE NO EL JUEGO SE TERMINA");
            proxRonda = leer.next();
              if(proxRonda.equalsIgnoreCase("si") && aux.isMojado() == false){
                System.out.println("**** SIGUIENTE RONDA ****");
            }else if(proxRonda.equalsIgnoreCase("no")){
                System.out.println("JUEGO TERMINADO");
                break;
            }
              
            }
            }
        } while (aux.isMojado() == false);
    }
}
