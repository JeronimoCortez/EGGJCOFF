/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import interfaces.CalculosFormas;

/**
 *
 * @author Usuario
 */
public class Rectangulo extends Geometria implements CalculosFormas{
    private double Base;
    private double Altura;

    public Rectangulo() {
    }

    public Rectangulo(double Base, double Altura, double Area, double Perimetro) {
        super(Area, Perimetro);
        this.Base = Base;
        this.Altura = Altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
   //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    @Override
    public void calcularArea() {
       Area = Base * Altura;
        System.out.println("El area del rectangulo es: " + Area);
    }

    @Override
    public void calcularPerimetro() {
       Perimetro = (Base + Altura) * 2;
        System.out.println("El perimetro del rectangulo es: " + Perimetro);
    }
    
    
}
