public class Cor {
    // Atributos
    private long id;
    private String nome;

    // Construtores
    public Cor(){
    }
    public Cor(String nome){
        this.nome = nome;
    }

    // Métodos getters e setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
