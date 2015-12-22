package exercicio_lachonete;

/**
 * Created by gregorio on 22/12/15.
 */
public enum Pagamentos {
    DEBITO ("Debito", 4),
    CREDITO ("Credito", 2),
    AVISTA ("A vista", 10);

    public String getNome() {
        return nome;
    }

    public double getDesconto() {
        return desconto;
    }

    private String nome;
    private double desconto;

    Pagamentos(String n, double desc) {
        nome = n;
        desconto = desc;
    }

    public double calculaTotal(double conta) {
        return conta - ((conta * desconto) / 100);
    }
}
