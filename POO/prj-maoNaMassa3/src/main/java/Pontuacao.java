public class Pontuacao {
    // Atributos
    private int quantidade;

    // Construtores
    public Pontuacao(int quantidade) {
        this.quantidade = quantidade;
    }

    // Métodos
    public int saldo() {
        return quantidade;
    }
    public void subtrair(int quantidade) {
        this.quantidade -= quantidade;
    }
    public void adicionar(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public String toString() {
        return "Pontuacao: " +
                quantidade;
    }
}
