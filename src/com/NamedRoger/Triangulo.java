package com.NamedRoger;

public class Triangulo implements IShape {
    private double a;
    private double b;
    private double c;
    private double altura;

    public Triangulo(){

    }

    public Triangulo(double a, double b, double c, double altura) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.altura = altura;
    }

    public double getArea() {
        return (b * altura)/2;
    }

    public double getPerimeter() {
        return a+b+c;
    }
}
