/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author guest-OWf6WU
 */
public class Traficante {

    public static void main(String[] args) {

        Doce doce3 = new Doce("Chocolate", 2, 3);
        Doce doce4 = new Doce("Pe de Moleque", 1.1, 3);
        Doce doce5 = new Doce("Brigadeiro", 1, 3);
        Doce doce6 = new Doce("Beijinho", 1.5, 3);
        Doce doce7 = new Doce("Paçoca", 2.2, 3);
        Doce doce8 = new Doce("LSD", 2.1, 3);

        Scanner in = new Scanner(System.in);
        int option = 0;

        System.out.println("E aí doido ta afim de fazer um pedido de uns doce?");
        System.out.println("1 - Vai logo doido.");
        System.out.println("0 - To de boa, flw.");
        option = in.nextInt();
        switch (option) {
            case 0:
                break;
            case 1: {
                Cliente cliente = new Cliente();
                Pedido vila = new Pedido();
                String nome = new String();
                String telefone = new String();

                System.out.println("Maninho fala teu nome ai: ");
                nome = in.next();
                cliente.setNome(nome);
                System.out.println(nome + " né. Entao " + nome + " manda teu telefone ai: ");
                telefone = in.next();
                cliente.setTelefone(telefone);

                vila.setNumero(1);
                vila.setCliente(cliente);
                List<ItemPedido> itens = new ArrayList<>();
                vila.setItens(itens);

                System.out.print("\nEntao hoje tem: \n");
                System.out.println("1 - " + doce3);
                System.out.println("2 - " + doce4);
                System.out.println("3 - " + doce5);
                System.out.println("4 - " + doce6);
                System.out.println("5- " + doce7);
                System.out.println("6 - " + doce8);
                System.out.println("Vai leva o que?");
                option = in.nextInt();
                int quantidade, exit = -1;
                do {
                    switch (option) {
                        case 1: {
                            System.out.println("Vai leva quantos " + doce3.getNome() + "?");
                            quantidade = in.nextInt();
                            in.nextLine();
                            vila.insereItemPedido(quantidade, doce3);
                            System.out.println("Vai leva só isso? \n 0 - Sim");
                            exit = in.nextInt();
                        }
                        break;
                        case 2: {
                            System.out.println("Vai leva quantos " + doce4.getNome() + "?");
                            quantidade = in.nextInt();
                            in.nextLine();
                            vila.insereItemPedido(quantidade, doce4);
                            System.out.println("Vai leva só isso? \n 0 - Sim");
                            exit = in.nextInt();

                        }
                        break;
                        case 3: {
                            System.out.println("Vai leva quantos " + doce5.getNome() + "?");
                            quantidade = in.nextInt();
                            in.nextLine();
                            vila.insereItemPedido(quantidade, doce5);
                            System.out.println("Vai leva só isso? \n 0 - Sim");
                            exit = in.nextInt();

                        }
                        break;
                        case 4: {
                            System.out.println("Vai leva quantos " + doce6.getNome() + "?");
                            quantidade = in.nextInt();
                            in.nextLine();
                            vila.insereItemPedido(quantidade, doce6);
                            System.out.println("Vai leva só isso? \n 0 - Sim");
                            exit = in.nextInt();
                        }
                        break;
                        case 5: {
                            System.out.println("Vai leva quantos " + doce7.getNome() + "?");
                            quantidade = in.nextInt();
                            in.nextLine();
                            vila.insereItemPedido(quantidade, doce7);
                            System.out.println("Vai leva só isso? \n 0 - Sim");
                            exit = in.nextInt();
                        }
                        break;
                        case 6: {
                            System.out.println("Vai leva quantos " + doce8.getNome() + "?");
                            quantidade = in.nextInt();
                            in.nextLine();
                            vila.insereItemPedido(quantidade, doce8);
                            System.out.println("Vai leva só isso? \n 0 - Sim");
                            exit = in.nextInt();
                        }
                        break;
                    }
                    if (exit != 0) {
                        System.out.println("O que mais?");
                        option = in.nextInt();
                    }
                } while (exit != 0);
                System.out.println("O pedido fico o seguinte: ");
                System.out.println(cliente);
                System.out.println(vila.getResumo());
            }
        }
    }
}
