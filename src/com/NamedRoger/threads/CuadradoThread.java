package com.NamedRoger.threads;

import com.NamedRoger.Cuadrado;

import java.util.Scanner;

public class CuadradoThread extends Thread {
    private Scanner scanner;

    public CuadradoThread(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("-------------Cuadrado----------");

        System.out.printf("Longitud de lado: ");

        var lado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);

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
                    System.out.println("El area del cuadrado es: " +cuadrado.getArea());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("El perimetro del cuadrado es: "+ cuadrado.getPerimeter());
                    System.out.println("");
                    break;
                default:
                    running = false;
                    break;
            }
        }while (running);
    }
}
