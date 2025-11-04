public class PessoaJuridica extends Cliente{// Extends Cliente é a linha da herança na classe cliente
    // Atributos
    private String cnpj;
    private String inscricaoEstadual;

    // Construtores
//    public PessoaJuridica(int id, String nome, String celular, String email, int pontuacao ,String cnpj, String inscricaoEstadual) {
//        super(id, nome, celular, email,pontuacao = 0);
//        this.cnpj = cnpj;
//        this.inscricaoEstadual = inscricaoEstadual;
//    }

    // Métodos getters e setters
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                super.toString() +
                "inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
