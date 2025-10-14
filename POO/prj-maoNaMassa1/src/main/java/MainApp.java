public class MainApp {
    public static void print(Veiculo veiculo){
        System.out.println("Cliente:"+veiculo.getCliente().getNome());
        System.out.println("Placa..:"+veiculo.getPlaca());
        System.out.println(veiculo.getObservacao());
        System.out.println(veiculo.getCor().getNome());
        System.out.println(veiculo.getModelo().getDescricao());
        System.out.println(veiculo.getModelo().getMotor().getTipoCombustivel().getDescricao());
        System.out.println(veiculo.getModelo().getCategoria().getDescricao());
        System.out.println(veiculo.getModelo().getMarca().getNome());
        System.out.println("-----------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        // Instanciacao e sobre carga do objeto Cor
        Cor cor = new Cor(1, "Prata");
        Cor cor2 = new Cor(2, "Preto");
        Cor cor3 = new Cor(3, "Branco");
        Cor cor4 = new Cor(4, "Roxo");

        // Instanciacao e sobre carga do objeto Cliente
        Cliente cliente = new Cliente(1,"Guilherme","48999117218","guilherme.wm@aluno.ifsc.edu.br");
        Cliente cliente2 = new Cliente(2, "Gabriel", "48996221779", "gabriel.alves@aluno.ifsc.edu.br");

        // Instanciacao e sobre carga do objeto Marca
        Marca marca = new Marca(1, "Nissan");
        Marca marca2 = new Marca(2, "Honda");
        Marca marca3 = new Marca(3, "Audi");
        Marca marca4 = new Marca(4, "BMW");

        // Instanciacao e sobre carga do objeto Modelo
        Modelo modelo = new Modelo(1,"Versa", marca, ECategoria.MEDIO,110, ETipoCombustivel.GALOSINA);
        Modelo modelo2 = new Modelo(2,"S15",marca2,ECategoria.PADRAO,250,ETipoCombustivel.FLEX);
        Modelo modelo3 = new Modelo(3, "RS6", marca3,ECategoria.GRANDE, 630, ETipoCombustivel.GNV);
        Modelo modelo4 = new Modelo(4, "S1000RR", marca4, ECategoria.MOTO, 210, ETipoCombustivel.ETANOL);

        // Instanciacao e sobre carga do objeto Veiculo
        Veiculo veiculo = new Veiculo(1,"SSF4B18","Nissan Versa", cor, modelo, cliente);
        Veiculo veiculo2 = new Veiculo(2,"GXP7D88","Esportivo importado", cor2, modelo2, cliente2);
        Veiculo veiculo3 = new Veiculo(3,"WDC8J14","Veículo premium", cor4, modelo3, cliente2);
        Veiculo veiculo4 = new Veiculo(4,"SSF4B18","Motocicleta esportiva de alta cilindrada", cor4, modelo4, cliente);

        // Associando os cliente aos veiculos
        cliente.addVeiculo(veiculo); // Guilherme tem Versa
        cliente.addVeiculo(veiculo4); // Gabriel tem S15
        cliente2.addVeiculo(veiculo2); // Gabriel tem RS6
        cliente2.addVeiculo(veiculo3); // Guilherme tem S1000RR

        // Apresentaçao do veículo
        print(veiculo);
        print(veiculo2);
        print(veiculo3);
        print(veiculo4);

    }
}
