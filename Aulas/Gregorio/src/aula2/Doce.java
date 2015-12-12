/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author guest-OWf6WU
 */
public class Doce {

    public Doce(String nome, double valorDeCusto, double valorDeLucro) {
        this.nome = nome;
        this.valorDeCusto = valorDeCusto;
        this.valorDeLucro = valorDeLucro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorDeCusto(double valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    public void setValorDeLucro(double valorDeLucro) {
        this.valorDeLucro = valorDeLucro;
    }

    public String getNome() {
        return nome;
    }

    public double getValorDeCusto() {
        return valorDeCusto;
    }

    public double getValorDeLucro() {
        return valorDeLucro;
    }
    private String nome;
    private double valorDeCusto;
    private double valorDeLucro;
    
    public double getValorTotal() {
        return this.getValorDeCusto() + this.getValorDeLucro();
    }
}
