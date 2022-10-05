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
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class ServiciosCB {
 public CuentaBancaria CrearCuenta(){
     Scanner leer = new Scanner(System.in);
     CuentaBancaria C = new CuentaBancaria();
     System.out.println("Ingrese su numero de DNI sin puntos");
     C.setDNI(leer.nextLong());
     System.out.println("Ingrese su numero de cuenta");
     C.setNrocuenta(leer.nextInt());
     System.out.println("Ingrese su nombre completo");
     C.setNombre(leer.next());
    
     return C;
}   
 public void Ingreso(CuentaBancaria C){
     Scanner leer = new Scanner(System.in);
     double Ingreso;
     System.out.println("Cuanto dinero desea ingresar");
     Ingreso = leer.nextDouble();
     C.setSaldoact(C.getSaldoact() + (int)Ingreso);
     
 }
 public void Retirar(CuentaBancaria C){
     Scanner leer = new Scanner(System.in);
     double retirar;
     System.out.println("Cuento dinero desea retirar");
     retirar = leer.nextDouble();
     if (retirar > C.getSaldoact()){
         C.setSaldoact(0);
     }else{
         C.setSaldoact(C.getSaldoact() - (int)retirar);
     }    
 }
 public void extraccionrapida(CuentaBancaria C){
     Scanner leer = new Scanner(System.in);
     int retirar;
     System.out.println("Eligio la opcion de extraccion rapida (le permite sacar hasta el %20 de su saldo)");
     System.out.println("Su saldo acual es: " + C.getSaldoact());
     System.out.println("¿Cuanto dinero desea retirar?");
     retirar = leer.nextInt();
     if ( retirar > C.getSaldoact() * 0.2){
         System.out.println("NO PUEDE RETIRAR MAS DEL %20 DE SU SALDO");
     }
     else{
         C.setSaldoact(C.getSaldoact() - retirar);
     }
 }
 public void consultarsaldo(CuentaBancaria C){
     Scanner leer = new Scanner(System.in);
     System.out.println("Su saldo en cuenta es: " + C.getSaldoact());
 }
 public void consultardatos(CuentaBancaria C){
     System.out.println("El titular de esta cuenta es: " + C.getNombre());
     System.out.println("El DNI del titular de esta cuenta es: " + C.getDNI());
     System.out.println("Su numero de DNI es: " + C.getNrocuenta());
 }
}









