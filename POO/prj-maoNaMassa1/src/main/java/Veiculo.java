public class Veiculo {
    private int id;
    private String placa;
    private String observacao;
    private Cor cor;
    private Cliente cliente;

    public Veiculo(){
        this.id = id;
        this.placa = placa;
        this.observacao = observacao;
        this.cor = cor;
        // this.modelo = modelo
    }

    public Veiculo(String placa){
        this.placa = placa;
    }
//    public Veiculo(String placa){
//        this.placa = placa;
//    } Adicionar modelo : Modelo


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
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
