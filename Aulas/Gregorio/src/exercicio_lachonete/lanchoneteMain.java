package exercicio_lachonete;

import java.util.Scanner;

/**
 * Created by gregorio on 22/12/15.
 */
public class lanchoneteMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = 1;
        double conta = 0;
        while (menu != 0) {
            clearScreen();
            menu();
            if (conta != 0)
                System.out.println("Total conta: " + conta);
            System.out.print("Escolha sua opcao: ");
            menu = in.nextInt();
            switch (menu) {
                case 1: {
                    System.out.println("Saindo um " + Bebida.REFRI.getNome() + ".");
                    conta += Bebida.REFRI.getPrecoFinal();
                }
                break;
                case 2: {
                    System.out.println("Saindo uma " + Bebida.AGUA.getNome() + ".");
                    conta += Bebida.AGUA.getPrecoFinal();
                }
                break;
                case 3: {
                    System.out.println("Saindo um " + Bebida.SUCO.getNome() + ".");
                    conta += Bebida.SUCO.getPrecoFinal();
                }
                break;
                case 4: {
                    System.out.println("Saindo uma " + Comida.FRENCHFRIES.getNome() + ".");
                    conta += Comida.FRENCHFRIES.getPrecoFinal();
                }
                break;
                case 5: {
                    System.out.println("Saindo um " + Comida.HAMBURGUER.getNome() + ".");
                    conta += Comida.HAMBURGUER.getPrecoFinal();
                }
                break;
                case 6: {
                    System.out.println("Saindo um " + Comida.HOTDOG.getNome() + ".");
                    conta += Comida.HOTDOG.getPrecoFinal();
                }
                break;
                default:
                    break;
            }
        }
        System.out.println("Sua conta deu R$" + conta + ". \nEscolha um dos seguintes metodos de pagamento: ");
        metodosDePagamento();
        switch (in.nextInt()) {
            case 1: {
                System.out.println("Total: R$" + Pagamentos.AVISTA.calculaTotal(conta));
            }
            break;
            case 2: {
                System.out.println("Total: R$" + Pagamentos.DEBITO.calculaTotal(conta));
            }

            break;
            case 3: {
                System.out.println("Total: R$" + Pagamentos.CREDITO.calculaTotal(conta));
            }
            break;
        }
        System.out.println("Muito obrigado pela preferencia. Volte Sempre.");


    }

    public static void menu() {
        System.out.println("\t\t Bebidas");
        System.out.println("1. " + Bebida.REFRI.getNome() + "\t\t\t\t R$" + Bebida.REFRI.getPrecoFinal());
        System.out.println("2. " + Bebida.AGUA.getNome() + "\t\t\t\t R$" + Bebida.AGUA.getPrecoFinal());
        System.out.println("3. " + Bebida.SUCO.getNome() + "\t\t\t\t R$" + Bebida.SUCO.getPrecoFinal());
        System.out.println("\t\t Comidas");
        System.out.println("4. " + Comida.FRENCHFRIES.getNome() + "\t\t\t\t R$" + Comida.FRENCHFRIES.getPrecoFinal());
        System.out.println("5. " + Comida.HAMBURGUER.getNome() + "\t\t\t\t R$" + Comida.HAMBURGUER.getPrecoFinal());
        System.out.println("6. " + Comida.HOTDOG.getNome() + "\t\t\t\t R$" + Comida.HOTDOG.getPrecoFinal());
    }

    public static void metodosDePagamento() {
        System.out.println("1. " + Pagamentos.AVISTA.getNome() + ", desconto de " + Pagamentos.AVISTA.getDesconto() + "%.");
        System.out.println("2. " + Pagamentos.DEBITO.getNome() + ", desconto de " + Pagamentos.DEBITO.getDesconto() + "%.");
        System.out.println("3. " + Pagamentos.CREDITO.getNome() + ", desconto de " + Pagamentos.CREDITO.getDesconto() + "%.");
    }
    public static void clearScreen() {
        System.out.print("\n\n\n\n\n\n\n\n");
    }
}
