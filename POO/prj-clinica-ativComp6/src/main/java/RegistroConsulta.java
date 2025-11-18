import java.util.ArrayList;
import java.util.List;

public class RegistroConsulta {
    private String descricao;

    private List<HistoricoMedicacao> medicamentos = new ArrayList<>();

    public RegistroConsulta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarMedicamento(HistoricoMedicacao historicoMedicacao){
        medicamentos.add(historicoMedicacao);
    }

    @Override
    public String toString() {
        return "RegistroConsulta{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
