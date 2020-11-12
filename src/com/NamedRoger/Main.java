package com.NamedRoger;

import com.NamedRoger.threads.CirculoThread;
import com.NamedRoger.threads.CuadradoThread;
import com.NamedRoger.threads.TrianguloThread;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Thread th = null;
        boolean running;
        do{
            running = true;
            if(th == null || !th.isAlive()){
                System.out.println("" +
                        "(1) Circulo \n" +
                        "(2) Cuadrado \n" +
                        "(3) Triangulo \n" +
                        "(4) Salir");
                var op = scanner.nextInt();
                try{
                    isValid(op);

                    switch (op){
                        case 1:
                            th = new CirculoThread(scanner);
                            th.start();
                            break;
                        case 2:
                            th = new CuadradoThread(scanner);
                            th.start();
                            break;
                        case 3:
                            th = new TrianguloThread(scanner);
                            th.start();
                            break;
                        default:
                            running = false;
                            break;
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }



        }while (running);
    }

    public static void isValid(int op) throws Exception {
        if(op<1 || op > 4){
            throw new Exception("Introduce una opcion valida");
        }
    }
}
