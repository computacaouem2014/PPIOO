/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 * @author w4ll3
 */
public class ItemPedido {

    public ItemPedido(int quantidade, Doce doce, Pedido pedido) {
        this.quantidade = quantidade;
        this.doce = doce;
        this.pedido = pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Doce getDoce() {
        return doce;
    }

    public void setDoce(Doce doce) {
        this.doce = doce;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    private int quantidade;
    private Doce doce;
    private Pedido pedido;

    public double getValorTotal() {
        return this.doce.getValorTotal() * this.getQuantidade();
    }

    public String getResumo() {
        return "   Descrição: " + this.doce.getNome() + "   Quantidade: " + this.getQuantidade();
    }
}

