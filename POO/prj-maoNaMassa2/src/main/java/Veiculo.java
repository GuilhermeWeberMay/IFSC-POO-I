public class Veiculo {
    // Atributos
    private int id;
    private String placa;
    private String observacao;
    // Associação uniderecional com Cor
    private Cor cor;
    // Associação bidirecional com Cliente
    private Cliente cliente;

    // Construtores
    public Veiculo(){
    }
    public Veiculo(String placa){
        this.placa = placa;
    }

    // Métodos getter e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cor getCor() {
        return cor;
    }
    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {}
}
