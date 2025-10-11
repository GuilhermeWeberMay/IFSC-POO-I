public class MainApp {
    public static void main(String[] args) {
        Cor cor = new Cor(1, "Prata");
        Cliente cliente = new Cliente(1,"Guilherme","48999117218","guilherme.wm@aluno.ifsc.edu.br");
        Marca marca = new Marca(1, "Nissan");
        Modelo modelo = new Modelo(1,"Modelo de sedan", marca, ECategoria.MEDIO,110, ETipoCombustivel.GALOSINA);
        Veiculo veiculo = new Veiculo(1,"SSF4B18","Nissan Versa", cor, modelo, cliente);
        veiculo.setModelo(modelo);
        cliente.addVeiculo(veiculo);
        System.out.println(cliente.getListaVeiculos().get(0).getModelo().getMotor().getTipoCombustivel());

//        System.out.println(cor);
//        System.out.println(veiculo);
//        System.out.println(cliente);
//        System.out.println(modelo);
//        System.out.println(marca);

    }
}
