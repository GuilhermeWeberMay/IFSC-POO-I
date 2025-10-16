public class MainApp {
    public static void main(String[] args) {
//        Medico medico = new Medico("Rael", "8 vezes 3", "Dá o cu", "vai de quatro");
//        medico.exibirInformacoes();

        Cidade cidade = new Cidade("Biguaçu", "SC");

        Paciente paciente = new Paciente("Gui", "10168481960", "48999117218","Jordelino", cidade);

        paciente.exibirInformacoes();
    }
}
