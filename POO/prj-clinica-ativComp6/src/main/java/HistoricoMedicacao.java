public class HistoricoMedicacao {
    private String descricao;
    private RegistroConsulta registroConsulta;
    private Medicamento medicamento;

    public HistoricoMedicacao(RegistroConsulta registroConsulta,Medicamento medicamento, String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "HistoricoMedicacao{" +
                "descricao='" + descricao + '\'' +
                ", registroConsulta=" + registroConsulta +
                ", medicamento=" + medicamento +
                '}';
    }
}
