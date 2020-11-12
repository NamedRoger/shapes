package com.NamedRoger.threads;

import com.NamedRoger.Triangulo;

import java.util.Scanner;

public class TrianguloThread extends Thread {
    private Scanner scanner;

    public TrianguloThread(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("-------------Triangulo----------");

        System.out.printf("Longitud de la base: ");
        var base = scanner.nextDouble();

        System.out.printf("Longitud del lado a: ");
        var ladoA = scanner.nextDouble();

        System.out.printf("Longitud del lado c: ");
        var ladoC = scanner.nextDouble();

        System.out.printf("Longitud de la Altura: ");
        var altura = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(ladoA,base,ladoC,altura);
        boolean running;
        do{
            running = true;

            System.out.println("" +
                    "(1) Area \n" +
                    "(2) Perimetro \n" +
                    "(3) Regresar");
            var op = scanner.nextInt();

            switch (op){
                case 1:
                    System.out.println("El area del triangulo es: "+triangulo.getArea());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("El perimetro del triangulo es: "+triangulo.getPerimeter());
                    System.out.println("");
                    break;
                default:
                    running = false;
                    break;
            }
        }while (running);
    }
}
