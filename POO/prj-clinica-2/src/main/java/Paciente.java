import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private String cpf;
    private List<Consulta> listaDeConsultas = new ArrayList<>();
    private Endereco endereco;

    public Paciente(String nome, String cpf, String rua, Cidade cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = new Endereco(rua, cidade);
    }

    public Paciente() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void addEndereco(String rua, Cidade cidade) {
        this.endereco = new Endereco(rua, cidade);
    }

    public List<Consulta> getConsultas() {
        return listaDeConsultas;
    }

    public void addConsulta(Consulta consulta) {
        listaDeConsultas.add(consulta);
        consulta.setPaciente(this);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
