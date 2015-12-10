/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppioo;

import aula1.Car;
import java.util.Scanner;

/**
 *
 * @author guest-rEwJYe
 */
public class PPIOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aula1();
    }

    public static void Aula1() {
        int step = 0;
        Scanner in = new Scanner(System.in);
        Car carro = new Car();
        int option;
        System.out.println("Bem-vindo ao teste de carro.");
        do {
            System.out.println("Por favor escolha o modelo do carro:");
            System.out.println("1- Ferrari;");
            System.out.println("2- Lamborghini;");
            System.out.println("3- Outro (digitar).");
            while (!in.hasNextInt()) {
                in.nextLine();
            }
            option = in.nextInt();
            switch (option) {
                case 1:
                    carro.setModel("Ferrari");
                    step++;
                    break;
                case 2:
                    carro.setModel("Lamborghini");
                    step++;
                    break;
                case 3:
                    System.out.println("Por favor digite o modelo do carro:");
                    carro.setModel(in.next());
                    step++;
                    break;
            }
        } while (step == 0);
        do {
            System.out.println("Por favor escolha a cor do carro:");
            System.out.println("1- Branco;");
            System.out.println("2- Preto;");
            System.out.println("3- Azul Marinho;");
            System.out.println("4- Vermelho;");
            System.out.println("5- Outra (digitar).");
            while (!in.hasNextInt()) {
                in.nextLine();
            }
            option = in.nextInt();
            switch (option) {
                case 1:
                    carro.setColor("Branco");
                    step++;
                    break;
                case 2:
                    carro.setColor("Preto");
                    step++;
                    break;
                case 3:
                    carro.setColor("Azul Marinho");
                    step++;
                    break;
                case 4:
                    carro.setColor("Vermelho");
                    step++;
                    break;
                case 5:
                    System.out.println("Por favor digite a cor do carro:");
                    carro.setColor(in.next());
                    step++;
                    break;
            }
        } while (step == 1);
        do {
            System.out.println("Por favor escolha a capacidade do motor do carro:");
            System.out.println("1- 1.0;");
            System.out.println("2- 1.4;");
            System.out.println("3- 1.6;");
            System.out.println("4- 2.0;");
            System.out.println("5- Outra (digitar).");
            while (!in.hasNextInt()) {
                in.nextLine();
            }
            option = in.nextInt();
            switch (option) {
                case 1:
                    carro.setEngineCapacity(1f);
                    step++;
                    break;
                case 2:
                    carro.setEngineCapacity(1.4f);
                    step++;
                    break;
                case 3:
                    carro.setEngineCapacity(1.6f);
                    step++;
                    break;
                case 4:
                    carro.setEngineCapacity(2f);
                    step++;
                    break;
                case 5:
                    System.out.println("Por favor digite a capacidade do motor do carro:");
                    while (!in.hasNextFloat() && !in.hasNextDouble()) {
                        in.nextLine();
                    }
                    carro.setEngineCapacity((in.hasNextFloat() ? in.nextFloat() : (float) in.nextDouble()));
                    step++;
                    break;
            }
        } while (step == 2);
        System.out.println(carro);
        do {
            System.out.println("Por favor escolha uma ação:");
            System.out.println("1- Acelerar;");
            System.out.println("2- Frear;");
            System.out.println("3- Ver Estado;");
            System.out.println("4- Sair;");
            while (!in.hasNextInt()) {
                in.nextLine();
            }
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Por favor digite a velocidade para acelerar:");
                    while (!in.hasNextFloat()) {
                        in.nextLine();
                    }
                    carro.accelerate(in.nextFloat());
                    break;
                case 2:
                    System.out.println("Por favor digite a velocidade para frear:");
                    while (!in.hasNextFloat()) {
                        in.nextLine();
                    }
                    carro.brake(in.nextFloat());
                    break;
                case 3:
                    carro.getState();
                    break;
                case 4:
                    step++;
                    break;
            }
        } while (step == 3);
        System.out.println("Obrigado por testar!");
    }

}
