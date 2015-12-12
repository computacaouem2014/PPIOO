/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.List;

/**
 *
 * @author guest-OWf6WU
 */
public class Pedido {
    private int numero;
    private List<ItemPedido> itens;
    private Cliente cliente;

    public Pedido(int numero, List<ItemPedido> itens, Cliente cliente) {
        this.numero = numero;
        this.itens = itens;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void insereItemPedido(ItemPedido item) {
        this.itens.add(item);
    }
    
    public void removeUltimoItemPedido() {
        this.itens.remove(this.itens.size() - 1);
    }
    
    public double getValorTotal() {
        double total = 0;
        for(int i = 0; i < this.itens.size() - 1; i++) {
            total += this.itens.get(i).getValorTotal();
        }
        return total;
    }
    
    public String getResumo() {
        StringBuilder resumo = new StringBuilder();
        for(int i = 0; i < this.itens.size() - 1; i++) {
            resumo.append(this.itens.get(i).getResumo()).append("\n ");
        }
        return resumo.toString();
    }
}
