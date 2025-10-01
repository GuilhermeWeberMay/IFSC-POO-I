public class Endereco {
    private String rua;
    // Associação da classe Cidade no objeto Endereco - Associação Unidirecional
    private Cidade cidade;

    public Endereco(String rua, Cidade cidade){
        this.rua = rua;
        this.cidade = cidade;
    }
    public Endereco(){

    }

    public Cidade getCidade(){
        return this.cidade;
    }
    public void setCidade(Cidade cidade){
        this.cidade = cidade;
    }

    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
}
