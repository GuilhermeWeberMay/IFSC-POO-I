import java.util.List;

public class Veiculo {
    private int id;
    private String placa;
    private String observacao;
    // Relacionamento uniderional com Cor
    private Cor cor;
    // Relacionamento uniderional com Modelo
    private Modelo modelo;
    // Relacionamento multidirecional com Cliente
    private Cliente cliente;

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

    public Modelo getModelo() {
        return modelo;
    }
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", observacao='" + observacao + '\'' +
                ", cor=" + cor +
                ", modelo=" + modelo +
                ", cliente=" + cliente +
                '}';
    }
}
