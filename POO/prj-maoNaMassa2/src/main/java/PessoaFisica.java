import java.time.LocalDate;
import java.util.*;
public final class PessoaFisica extends Cliente implements IDados{
    // Extends Cliente é a linha da herança na classe cliente

    // Atributos
    private String cpf;
    private Date dataNascimento;

    // Construtores

    public PessoaFisica(int id, String nome, String celular, String email, LocalDate datacadastro, int quantidade, String cpf) {
        super(id, nome, celular, email, datacadastro.now(),quantidade = 0);
        this.cpf = cpf;
    }

    @Override
    public String getDados(){
        StringBuilder dados = new StringBuilder();
        dados.append(super.getDados()).append("\n");
        dados.append("CPF: ").append(cpf).append("\n");
        dados.append("Data de nasciemnto: ").append(dataNascimento).append("\n");
        return dados.toString();
    }
    @Override
    public String getDados(String observacao){
        StringBuilder dados = new StringBuilder();
        dados.append(super.getDados()).append("\n");
        dados.append("CPF: ").append(cpf).append("\n");
        dados.append("Data de nasciemnto: ").append(dataNascimento).append("\n");
        dados.append("Observação ").append(observacao);
        return dados.toString();
    }
}
