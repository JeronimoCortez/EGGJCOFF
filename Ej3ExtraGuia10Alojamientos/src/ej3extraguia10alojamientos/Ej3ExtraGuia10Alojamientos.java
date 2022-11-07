/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3extraguia10alojamientos;
import entidad.Alojamiento;
import entidad.Camping;
import entidad.ExtraHoteleros;
import entidad.Hotel;
import entidad.Hotel4;
import entidad.Hotel5;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidad.Comparador;

public class Ej3ExtraGuia10Alojamientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        ArrayList<Hotel> hoteles = new ArrayList();

        Hotel hotel1 = new Hotel5(3, 4, 6, "A", "Parrilla", 40, 25, 32, 4, 0, "HILTON", "Corrientes 2345", "CABA", "EDGAR");
        alojamientos.add(hotel1);
        Hotel hotel2 = new Hotel5(5, 10, 9, "A", "TACOS ATR", 45, 27, 39, 8, 0, "FOR SEASON", "Cordoba 765", "MENDOZA", "JERONIMO");
        alojamientos.add(hotel2);

        Hotel hotel3 = new Hotel4("A", "POLLO HERMANOS", 12, 34, 10, 6, 0, "PANAMERICANO", "SANTA FE 1765", "RIO CORDOBA", "INGRID");
        alojamientos.add(hotel3);
        Hotel hotel4 = new Hotel4("B", "BURGER KING", 20, 40, 10, 9, 0, "HYAT", "LAVALLE 1765", "ENTRE RIOS", "TANIA");
        alojamientos.add(hotel4);

        ExtraHoteleros residencia1 = new Residencia(12, true, false, true, 38, "LAS MELLIZAS", "LFAYETTE 22", "SALTA", "CARLA");
        alojamientos.add(residencia1);

        ExtraHoteleros camping1 = new Camping(50, 6, true, false, 200, "CAMPO LIBRE", "SUIPACHE 105", "TUCUMAN", "JOAN");
        alojamientos.add(camping1);

        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Hotel5) {
                ((Hotel5) aux).precioFinal();
                System.out.println(((Hotel5) aux).getPrecio());
                continue;
            }
            if (aux instanceof Hotel4) {
                ((Hotel4) aux).precioFinal();
                System.out.println(((Hotel4) aux).getPrecio());
                continue;
            }
        }
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Hotel) {
                hoteles.add((Hotel) aux);
                continue;
            }
        }

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("***********BIENVENIDOS TURISTAS**********");
            System.out.println("1-MOSTRAR ALOJAMIENTOS");
            System.out.println("2-MOSTRAR HOTELES DE MAYOR VALOR A MENOR VALOR");
            System.out.println("3-CAMPING CON RESTAURANTES INCLUIDOS");
            System.out.println("4-RESIDENCIAS CON DESCUENTO");
            System.out.println("5-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("-");
                    for (Alojamiento aux : alojamientos) {

                        System.out.println(aux);

                    }
                    break;
                case 2:
                    System.out.println("-");
                    Collections.sort(hoteles, Collections.reverseOrder(Comparador.mascaro));
                    for (Hotel aux : hoteles) {
                        System.out.println(aux);

                    }
                    break;
                case 3:
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Camping) {
                            if (((Camping) aux).isRestaurant() == true) {
                                System.out.println(aux);
                            }
                        }
                    }
                    break;
                case 4:
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Residencia) {
                            if (((Residencia) aux).isGremio() == true) {
                                System.out.println(aux);
                            }
                        }
                    }

                    break;

            }

        }
    }
    }


    

