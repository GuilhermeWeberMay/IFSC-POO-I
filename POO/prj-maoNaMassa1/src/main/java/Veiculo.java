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
