/*
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package ej1extraguia10barcos;

import entidad.Alquiler;
import entidad.Barco;
import entidad.Motorizados;
import entidad.Veleros;
import entidad.Yates;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej1ExtraGuia10Barcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alquiler> Alquiler = new ArrayList<>();
        ArrayList<Barco> Barcos = new ArrayList<>();
        Veleros V1 = new Veleros();
        Motorizados M1 = new Motorizados();
        Yates Y1 = new Yates();
        int opcion;
        do {
            System.out.println("Elija la opcion deseada");
            System.out.println("1 - Ingresar Barcos");
            System.out.println("2 - Ver listado de barcos");
            System.out.println("3 - Alquilar Barcos");
            System.out.println("4 - Ver lista de inquilinos ");
            System.out.println("5 - Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("Elija la opcion deseada");
                    System.out.println("1 - Ingresar veleros");
                    System.out.println("2 - Ingresar motorizados");
                    System.out.println("3 - Ingresar yates");
                    System.out.println("4 - Volver al menu");
                    int opcionB = leer.nextInt();
                    switch (opcionB) {
                        case 1:
                            Veleros V = new Veleros();
                            V.crearBarco();
                            Barcos.add(V);
                            break;
                        case 2:
                            Motorizados M = new Motorizados();
                            M.crearBarco();
                            Barcos.add(M);
                            break;
                        case 3:
                            Yates Y = new Yates();
                            Y.crearBarco();
                            Barcos.add(Y);
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Elija la opcion deseada");
                    System.out.println("1 - Ver veleros");
                    System.out.println("2 - Ver motorizados");
                    System.out.println("3 - Ver yates");
                    System.out.println("4 - Volver al menu");
                    int opcionV = leer.nextInt();
                    switch (opcionV) {
                        case 1:
                            for (Barco aux : Barcos) {
                                if (aux instanceof Veleros) {
                                    System.out.println(aux);
                                }
                            }
                            break;
                        case 2:
                            for (Barco aux : Barcos) {
                                if (aux instanceof Motorizados) {
                                    System.out.println(aux);
                                }
                            }
                            break;
                        case 3:
                            for (Barco aux : Barcos) {
                                if (aux instanceof Yates) {
                                    System.out.println(aux);
                                }
                            }
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Elija la opcion deseada");
                    System.out.println("1 - Alquilar veleros");
                    System.out.println("2 - Alquilar motorizados");
                    System.out.println("3 - Alquilar yates");
                    System.out.println("4 - Volver al menu");
                    int opcionA = leer.nextInt();
                    Alquiler A = new Alquiler();
                    switch (opcionA) {
                        case 1:

                            for (Barco aux : Barcos) {
                                if (aux instanceof Veleros) {
                                    System.out.println(aux);

                                }
                                if (aux instanceof Veleros) {
                                    System.out.println("Ingrese la matricula del barco que desea alquilar");
                                    int Al = leer.nextInt();
                                    if (Al == aux.getMatricula()) {
                                        A.setBarco(aux);
                                        System.out.println("Ingrese el amarre");
                                        A.setAmarre(leer.nextInt());
                                        V1.alquilarVeleros(A);
                                        Alquiler.add(A);
                                    }
                                }
                            }

//                V.alquilarVeleros(A);
                            break;
                        case 2:
                            for (Barco aux : Barcos) {
                                if (aux instanceof Motorizados) {
                                    System.out.println(aux);

                                }
                                if (aux instanceof Motorizados) {
                                    System.out.println("Ingrese la matricula del barco que desea alquilar");
                                    int Al = leer.nextInt();
                                    if (Al == aux.getMatricula()) {
                                        A.setBarco(aux);
                                       System.out.println("Ingrese el amarre");
                                        A.setAmarre(leer.nextInt());
                                        M1.alquilarMotorizado(A);
                                        Alquiler.add(A);
                                    }
                                }
                            }
                            break;
                        case 3:
                            for (Barco aux : Barcos) {
                                if (aux instanceof Yates) {
                                    System.out.println(aux);

                                }
                                if (aux instanceof Yates) {
                                    System.out.println("Ingrese la matricula del barco que desea alquilar");
                                    int Al = leer.nextInt();
                                    if (Al == aux.getMatricula()) {
                                        A.setBarco(aux);
                                        System.out.println("Ingrese el amarre");
                                        A.setAmarre(leer.nextInt());
                                        Y1.alquilarYates(A);
                                        Alquiler.add(A);
                                    }
                                }
                            }
                            break;
                        case 4:

                            break;
                    }
                    break;
                case 4:
                    for (Alquiler aux1 : Alquiler) {
                        System.out.println(aux1);
                    }
                    break;
                case 5:
                    System.out.println("Salio");
                    break;
            }
        } while (opcion != 5);

    }

}
