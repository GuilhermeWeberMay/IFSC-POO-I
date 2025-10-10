import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private String celular;
    private String email;
    private LocalDate dataCadastro = LocalDate.now();
    private List<Veiculo> listaVeiculos;

    public Cliente(int id, String nome, String celular, String email, LocalDate dataCadastro, List<Veiculo> listaVeiculos) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.listaVeiculos = new ArrayList<Veiculo>();
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", celular='" + celular + '\'' +
                ", email='" + email + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", listaVeiculos=" + listaVeiculos +
                '}';
    }
}
