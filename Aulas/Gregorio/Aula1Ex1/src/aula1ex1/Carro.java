/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ex1;

/**
 *
 * @author guest-icO8VM
 */
public class Carro {
    
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    public void acelerar(float vel) {
        Carro carro = this;
        if(vel > 0) {
            if((carro.getCapacidade() * 110) < (carro.getVelocidade() + vel)) {
                carro.setVelocidade(carro.getCapacidade() * 110);
            } else {
                carro.setVelocidade(carro.getVelocidade() + vel);
            }
        } else {
            System.out.println("Por favor entre com uma velocidade maior do que 0");
        }
    }
    
    public void frear(float vel) {
        
    }
    
    public void verEstado(Carro carro) {
        if(this.getVelocidade() == 0) {
            System.out.println("O carro está parado.");
        } else {
            System.out.println("O carro está em movimento.");
        }
    }
    
    private String cor;
    private float capacidade;
    private float velocidade;
    
    public static void main(String[] args) {
        
    }
}
