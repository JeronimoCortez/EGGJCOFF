/*
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package servicio;

import entidad.raices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class raicesServicio {
    public raices crear(){
       raices R1 = new raices();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 3 valores");
        R1.setA(leer.nextInt());
        R1.setB(leer.nextInt());
        R1.setC(leer.nextInt());
        return R1;
    }
    public boolean tieneraices(raices R1){
        boolean tiene2 = false;
        System.out.println("El discriminante de sus valores es: " + (int)R1.getDiscriminante());
        if (R1.getDiscriminante() > 0){
            tiene2 = true;
            System.out.println("Sus valores tienen 2 posibles soluciones");
        }
       
        return tiene2;
    }
    public boolean tieneRaiz(raices R1){
       boolean tiene = false;
        if (R1.getDiscriminante() == 0){
            tiene = true;
            System.out.println("Sus valores tienen una unica posible solucion");
        }
    
        return tiene; 
    }
    public void obtenerRaices(raices R1, boolean tiene2){
        double resultado1 = (-R1.getB()+Math.sqrt((Math.pow(R1.getB(),2)-(4*R1.getA()*R1.getC())))/(2*R1.getA()));
        double resultado2 = (-R1.getB()-Math.sqrt((Math.pow(R1.getB(),2)-(4*R1.getA()*R1.getC())))/(2*R1.getA()));
        if (tiene2 = true){
            System.out.println("La primer solucion es: " + (-R1.getB()) + " + " + "√((" + R1.getB() + "^2)-(4*" + R1.getA() + "*"+ R1.getC()+")))/(2*" + R1.getA()+ ")=" + resultado1 );
            System.out.println("La segunda solucion es: " + (-R1.getB()) + " - " + "√((" + R1.getB() + "^2)-(4*" + R1.getA() + "*"+ R1.getC()+")))/(2*" + R1.getA()+ ")=" + resultado2 );
        }
    }
    public void obtenerRaiz(raices R1, boolean tiene){
        double resultado = (-R1.getB()+Math.sqrt((Math.pow(R1.getB(),2)-(4*R1.getA()*R1.getC())))/(2*R1.getA()));
        if(tiene = true){
        System.out.println("La unica solucion es: " + (-R1.getB()) + " + " + "√((" + R1.getB() + "^2)-(4*" + R1.getA() + "*"+ R1.getC()+")))/(2*" + R1.getA()+ ")=" + resultado ); //(-b±√((b^2)-(4*a*c)))/(2*a)
        }
    }
    public void calcular(raices R1, boolean tiene, boolean tiene2){
        if(tiene == true){
         obtenerRaiz(R1, tiene);
        }
        else if(tiene2 == true){
            obtenerRaices(R1,tiene2);
        }else{
            System.out.println("NO TIENE SOLUCION");
        }
    }
}
