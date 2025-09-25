public class Consulta {
    private String dataConsulta;
    private String horario;
    // Associação da classe Consulta no objeto Medico - Associação Bidirecional
    private Medico medico;
    // Associação da classe Paciente no objeto Consulta - Associação Unidirecional
    private Paciente paciente;


    public Consulta(String dataConsulta, String horario, Medico medico, Paciente paciente) {
        this.dataConsulta = dataConsulta;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }
    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

}
