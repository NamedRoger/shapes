package com.NamedRoger;

public class Circulo implements IShape {
    private double radio;
    private double diametro;
    public static final double Pi = 3.1416;

    public Circulo(){

    }

    public Circulo(double diametro) {
        this.radio = diametro /2;
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Pi * (radio*radio);
    }

    public double getPerimeter() {
        return Pi * diametro;
    }
}
