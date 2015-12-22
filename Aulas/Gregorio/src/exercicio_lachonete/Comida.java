package exercicio_lachonete;

/**
 * Created by gregorio on 22/12/15.
 */
public enum Comida {
    HOTDOG ("HotDog", 2.00, 4.00),
    HAMBURGUER ("Hamburguer", 3.00, 4.00),
    FRENCHFRIES ("Batata Frita", 2.00, 4.00);

    private String nome;
    private double precoDeCusto;
    private double precoDeLucro;

    Comida(String n, double custo, double lucro) {
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
