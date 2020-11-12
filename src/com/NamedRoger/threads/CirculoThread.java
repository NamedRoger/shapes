package com.NamedRoger.threads;

import com.NamedRoger.Circulo;

import java.util.Scanner;

public class CirculoThread extends Thread{
    private Scanner scanner;

    public CirculoThread(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run() {
        System.out.println("-------------Circulo----------");
        System.out.printf("Longitud del diametro: ");

        var diametro = scanner.nextInt();
        Circulo circulo = new Circulo(diametro);

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
                    System.out.println("El area del circulo es: " + circulo.getArea());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("El perimetro del circulo es: " +circulo.getPerimeter());
                    System.out.println("");
                    break;
                default:
                    running = false;
                    break;
            }
        }while (running);
    }
}
