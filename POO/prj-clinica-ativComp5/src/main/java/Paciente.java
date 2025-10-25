import java.util.*;

public class Paciente extends Pessoa implements IAgendavel {
    private String contato;
    // Associação de composição com Endereco
    private Endereco endereco;
    // Associação bidirecional com consulta
    List<Consulta> listaConsultas =  new ArrayList<>();

    // Construtores
    public Paciente(String nome, String cpf, String contato, String rua, Cidade cidade) {
        super(nome, cpf);
        this.contato = contato;
        this.endereco = new Endereco(rua, cidade);
    }

    // Métodos de acesso - getters e setters
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    // Não teremos setEndereco se não quebramos a regra de negócio,
    // que endereco é necessario ser instancia na classe Paciente

    // Métodos
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Contato: " + this.getContato());
        System.out.println("Rua: " + this.getEndereco().getRua());
        System.out.println("Cidade: " + this.getEndereco().getCidade().getNome());
        System.out.println("Uf: " + this.getEndereco().getCidade().getUf());
    }

    // Método reescrito que vem da Interface Agendavel
    @Override
    public void agendarConsulta(Consulta consulta) {
        this.listaConsultas.add(consulta);
        consulta.setPaciente(this);
    }
}
