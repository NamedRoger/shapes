package com.NamedRoger;

public class Cuadrado implements IShape {
    private double lado;

    public Cuadrado(){

    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    public double getArea() {
        return lado * lado;
    }


    public double getPerimeter() {
       return lado * 4;
    }
}
