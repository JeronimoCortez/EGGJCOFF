/*
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
 */
package servicio;

import entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioNif {
    Scanner leer = new Scanner(System.in);
    public NIF creanNif(){
     NIF n1 = new NIF();
        System.out.println("Ingrese su DNI sin puntos");
        n1.setDni(leer.nextLong());
        long calculo = (n1.getDni() % 23);
        switch((int)calculo){
            case 0:
                n1.setLetra("T");
            break;    
           case 1:
                n1.setLetra("R");
                break;
                case 2:
                n1.setLetra("W");
            break;
            case 3:
                n1.setLetra("A");
            break;
        
        case 4:
                n1.setLetra("G");
            break;
            case 5:
                n1.setLetra("M");
            break;
            case 6:
                n1.setLetra("Y");
            break;
            case 7:
                n1.setLetra("F");
            break;
            case 8:
                n1.setLetra("P");
            break;
            case 9:
                n1.setLetra("D");
            break;
            case 10:
                n1.setLetra("X");
            break;
            case 11:
                n1.setLetra("B");
            break;
            case 12:
                n1.setLetra("N");
            break;
            case 13:
                n1.setLetra("J");
            break;
            case 14:
                n1.setLetra("Z");
            break;
            case 15:
                n1.setLetra("S");
            break;
            case 16:
                n1.setLetra("Q");
            break;
            case 17:
                n1.setLetra("V");
            break;
            case 18:
                n1.setLetra("H");
            break;
            case 19:
                n1.setLetra("L");
            break;
            case 20:
                n1.setLetra("C");
            break;
            case 21:
                n1.setLetra("K");
            break;
            case 22:
                n1.setLetra("E");
            break;
        }
        return n1;
    }
    public void mostra(NIF n1){
        System.out.println("Su NIF es:" + n1.getDni() + "-" + n1.getLetra());
    }
}
