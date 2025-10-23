import java.util.*;

public class Medico extends Pessoa implements IAgendavel{
    private String especialidade;
    private String crm;
    // Associação bidirecional com Consulta
    List<Consulta> listaConsultas =  new ArrayList<>();

    public Medico(String nome, String cpf, String especialidade, String crm){
        super(nome, cpf);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("CRM: " + this.getCrm());
    }

    @Override
    public void agendarConsulta(Consulta consulta){
        this.listaConsultas.add(consulta);
        consulta.setMedico(this);
    }
}
