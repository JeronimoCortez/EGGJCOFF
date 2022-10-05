/*
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ej10dosarreglos;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Ej10dosarreglos {
    
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.random() * 10;
        }
        System.out.println("El arreglo A es: " + Arrays.toString(arregloA));
        Arrays.sort(arregloA);
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j < 20; j++) {
                arregloB[i] = arregloA[i]; //igualo la posicion i del vector A con la posicion i del vector B (se rellena el vector B)
                arregloB[j] = 0.5; // relleno las posicines 10 hasta la 20 con 0.5
            }
        }
        System.out.println("El arreglo A ordenado de menor a mayor es: " + Arrays.toString(arregloA));
        System.out.println("El arreglo B es: " + Arrays.toString(arregloB));
    }
    
}
