import java.util.*;
public class PessoaFisica extends Cliente{ // Extends Cliente é a linha da herança na classe cliente
    // Atributos
    private String cpf;
    private Date dataNascimento;

    // Construtores

    public PessoaFisica(int id, String nome, String celular, String email, int quantidade, String cpf) {
        super(id, nome, celular, email, quantidade = 0);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                super.toString() +
                "cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
