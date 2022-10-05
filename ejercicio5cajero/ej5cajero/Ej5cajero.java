/*
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ej5cajero;

import Entidad.CuentaBancaria;
import Servicios.ServiciosCB;
import java.util.Scanner;

public class Ej5cajero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosCB S1 = new ServiciosCB();
        CuentaBancaria C1 = S1.CrearCuenta();
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("Ingrese una opcion");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    S1.Ingreso(C1);
                    break;
                case 2:
                    S1.Retirar(C1);
                    break;
                case 3:
                    S1.extraccionrapida(C1);
                    break;
                case 4:
                    S1.consultarsaldo(C1);
                    break;
                case 5:
                    S1.consultardatos(C1);
                    break;

            }
        }
    }

}
