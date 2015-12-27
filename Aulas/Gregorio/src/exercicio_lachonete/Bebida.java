package exercicio_lachonete;

/**
 * Created by gregorio on 22/12/15.
 */
public enum Bebida {
    REFRI("Refrigerante", 1.00, 3.00),
    SUCO("Suco", 0.50, 23.00),
    AGUA("Agua", 1.20, 6.00);


    private String nome;
    private double precoDeCusto;
    private double precoDeLucro;

    Bebida(String n, double custo, double lucro) {
        nome = n;
        precoDeCusto = custo;
        precoDeLucro = lucro;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoFinal() {
        return precoDeCusto + precoDeLucro;
    }

}
