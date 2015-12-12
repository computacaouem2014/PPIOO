/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author guest-OWf6WU
 */
public class Traficante {
    public static void main(String[] args) {
        Doce doce3 = new Doce("Chocolate", 2d, 3d);
        Doce doce4 = new Doce("Pe de Moleque", 1.1d, 3d);
        Doce doce5 = new Doce("Brigadeiro", 1d, 3d);
        Doce doce6 = new Doce("Beijinho", 1.5d, 3d);
        Doce doce7 = new Doce("Paçoca", 2.2d, 3d);
        Doce doce8 = new Doce("LSD", 2.1d, 3d);
        int opcao = 0;
        Scanner in = new Scanner(System.in);
        do {    
            System.out.println("E aí doido ta afim de fazer um pedido de uns doce?\n");
        } while(opcao == 0);
    }
}
