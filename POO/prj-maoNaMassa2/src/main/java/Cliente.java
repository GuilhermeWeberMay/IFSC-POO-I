import java.util.*;
public abstract class Cliente implements IDados{
    // Atributos
    protected int id;
    protected String nome;
    protected String celular;
    protected String email;
    protected Date dataCadastro;
    // Associação bidirecional com Veiculo
    List<Veiculo> veiculos = new ArrayList<>();
    // Associação de composição com Pontuacao
    private Pontuacao pontuacao;

    // Construtores
    public Cliente(int id, String nome, String celular, String email, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.pontuacao = new Pontuacao(quantidade);
    }
    public Cliente() {
    }

    // Métodos getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    // Métodos de ação
    public void add(Veiculo veiculo) {
        this.veiculos.add(veiculo);
        veiculo.setCliente(this);
    }
    public void remove(Veiculo veiculo) {
        this.veiculos.remove(veiculo);
        veiculo.setCliente(null);
    }

    @Override
    public String getDados() {
        StringBuilder dados = new StringBuilder();
        dados.append("Nome: ").append(nome).append("\n");
        dados.append("Celular: ").append(celular).append("\n");
        dados.append("Email: ").append(email).append("\n");
        dados.append("Data de Cadastro: ").append(dataCadastro);
        return dados.toString();
    }

    @Override
    public String getDados(String observacao){
        StringBuilder dados = new StringBuilder();
        dados.append(getDados());
        dados.append("Observação: ").append(observacao);
        return dados.toString();
    }

}
