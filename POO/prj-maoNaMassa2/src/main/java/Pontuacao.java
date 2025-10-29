public class Pontuacao {
    // Atributos
    private int quantidade = 0;

    // Construtores
    public Pontuacao() {
    }
    public Pontuacao(int quantidade) {
        this.quantidade = quantidade;
    }

    // Métodos de ação
    public int adicionar(int qtd){
        return this.quantidade += qtd;
    }
    public int subtrair(int qtd){
        return this.quantidade -= qtd;
    }
    public int saldo() {
        return quantidade;
    }


}
