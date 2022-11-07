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
public class Circulo extends Geometria implements CalculosFormas{
    private double Radio;
    private double Diametro;
    
    public Circulo() {
    }

    public Circulo(double Radio, double Diametro, double Area, double Perimetro) {
        super(Area, Perimetro);
        this.Radio = Radio;
        this.Diametro = Diametro;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getDiametro() {
        return Diametro;
    }

    public void setDiametro(double Diametro) {
        this.Diametro = Diametro;
    }

    @Override
    public void calcularArea() {
      Area = 3.14 * Radio * Radio;
        System.out.println("El area del Circulo es: " + Area);
    }

    @Override
    public void calcularPerimetro() {
        Perimetro = 3.14 * Diametro;
        System.out.println("El perimetro del circulo es: " + Perimetro);
    }
    
        
}
