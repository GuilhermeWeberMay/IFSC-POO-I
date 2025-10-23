public class MainApp {
    public static void main(String[] args) {
        Medico medico = new Medico("Rael", "8 vezes 3", "Dá o cu", "vai de quatro");

        Cidade cidade = new Cidade("Biguaçu", "SC");

        Paciente paciente = new Paciente("Gui", "10168481960", "48999117218","Jordelino", cidade);

        Consulta consulta = new Consulta("2025-10-16", "16:20h", EPrioridade.ALTA);

//        medico.agendarConsulta(consulta);
//        paciente.agendarConsulta(consulta);
//
//        System.out.println(consulta);

        medico.exibirInformacoes();
        System.out.println("===================");
        paciente.exibirInformacoes();

        medico.agendarConsulta(consulta);
        paciente.agendarConsulta(consulta);

        System.out.println(consulta);
    }
}
