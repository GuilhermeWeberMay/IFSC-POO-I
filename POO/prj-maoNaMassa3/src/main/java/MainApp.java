import java.time.LocalDate;

public class MainApp {
    public static void print(OrdemServico os) {
        // Tudo de acordo com o mnm3
        System.out.println(os.getNumero());
        System.out.println(os.getAgenda());
        System.out.println(os.getStatus());
        System.out.println(os.getVeiculo().getCliente().getNome());
        System.out.println(os.getVeiculo().getPlaca());
        System.out.println(os.getVeiculo().getModelo().getDescricao());
        System.out.println("========================");
        try {
            int nItem = 1;
            for (ItemOS itemOS : os.getItensOS()) {
                System.out.println(nItem + " " + itemOS.getServico().getDescricao());
                System.out.println(itemOS.getServico().getValor());
                nItem++;
            }
        } catch (ExceptionLavacao e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(os.getTotal());
            System.out.println(os.getDesconto());
            System.out.println(os.getTotal());
        } catch (ExceptionLavacao lavacao) {
            System.out.println(lavacao.getMessage());
        }

    }

    public static void print(Veiculo veiculo) {
        System.out.println(veiculo.getDados());
    }

    public static void print(IDados dados) {
        System.out.println("Dados do print IDados");
        System.out.println(dados.getDados());
    }

    public static void print(Cliente c) {
        System.out.println("Dados do print Cliente");
        if (c instanceof PessoaJuridica) {
            System.out.println("Dados pessoa juridica");
        } else {
            System.out.println("Dados pessoa fisica");
        }
        System.out.println(c.getDados());
        System.out.println("Lista de carros: ");
        for (Veiculo v : c.getListaVeiculos()) {
            print(v);
        }
        System.out.println(c.getPontuacao());
        System.out.println();
    }

    public static void main(String[] args) {
        // Instanciacao e sobre carga do objeto Cor
        Cor cor = new Cor(1, "Prata");
        Cor cor2 = new Cor(2, "Preto");
        Cor cor3 = new Cor(3, "Branco");
        Cor cor4 = new Cor(4, "Roxo");

        // Instanciacao e sobre carga do objeto Cliente
        PessoaFisica pf = new PessoaFisica(1, "Guilherme", "48 999117218", "gui",
                "10168481960", 2025, 10, 20);
        PessoaJuridica pj = new PessoaJuridica(1, "Tela & Decor", "48", "tela", "89", "98");

        // Instanciacao e sobre carga do objeto Marca
        Marca marca = new Marca(1, "Nissan");
        Marca marca2 = new Marca(2, "Honda");
        Marca marca3 = new Marca(3, "Audi");
        Marca marca4 = new Marca(4, "BMW");

        // Instanciacao e sobre carga do objeto Modelo
        Modelo modelo = new Modelo(1, "Versa", marca, ECategoria.MEDIO, 110, ETipoCombustivel.GALOSINA);
        Modelo modelo2 = new Modelo(2, "S15", marca2, ECategoria.PADRAO, 250, ETipoCombustivel.FLEX);
        Modelo modelo3 = new Modelo(3, "RS6", marca3, ECategoria.GRANDE, 630, ETipoCombustivel.GNV);
        Modelo modelo4 = new Modelo(4, "S1000RR", marca4, ECategoria.MOTO, 210, ETipoCombustivel.ETANOL);

        // Instanciacao e sobre carga do objeto Veiculo
        Veiculo veiculo = new Veiculo(1, "SSF4B18", "Nissan Versa", cor, modelo);
        Veiculo veiculo2 = new Veiculo(2, "GXP7D88", "Esportivo importado", cor2, modelo2);
        Veiculo veiculo3 = new Veiculo(3, "WDC8J14", "Veículo premium", cor3, modelo3);
        Veiculo veiculo4 = new Veiculo(4, "MAY9G06", "Motocicleta esportiva de alta cilindrada", cor4, modelo4);

        // Instanciacao e sobrecarga do objeto Serviço
        Servico servico1 = new Servico(1, "Lavagem externa", 100f, 10, ECategoria.PEQUENO);
        Servico servico2 = new Servico(2, "Lavagem externa", 50f, 10, ECategoria.PADRAO);
        Servico servico3 = new Servico(3, "Lavação externa", 70f, 10, ECategoria.MEDIO);
        Servico servico4 = new Servico(4, "Lavação externa", 90f, 10, ECategoria.GRANDE);

        Servico servico5 = new Servico(5, "Lavação externa + interna", 50f, 10, ECategoria.PEQUENO);
        Servico servico6 = new Servico(6, "Lavação externa + interna", 70f, 10, ECategoria.PADRAO);
        Servico servico7 = new Servico(7, "Lavação externa + interna", 90f, 10, ECategoria.MEDIO);
        Servico servico8 = new Servico(8, "Lavação externa + interna", 110f, 10, ECategoria.GRANDE);

        Servico servico9 = new Servico(9, "Lavação externa + interna + cera", 70f, 10, ECategoria.PEQUENO);
        Servico servico10 = new Servico(10, "Lavação externa + interna + cera", 90f, 10, ECategoria.PADRAO);
        Servico servico11 = new Servico(11, "Lavação externa + interna + cera", 110f, 10, ECategoria.MEDIO);
        Servico servico12 = new Servico(12, "Lavação externa + interna + cera", 130f, 10, ECategoria.GRANDE);

        Servico servico13 = new Servico(13, "Lavagem externa", 20f, 10, ECategoria.MOTO);
        Servico servico14 = new Servico(14, "Lavação externa + cera", 50f, 10, ECategoria.MOTO);


        OrdemServico os1 = new OrdemServico(1, 0f, LocalDate.now(), 10f, EStatus.CANCELADA, veiculo4);

        // Tenho que fazer isso desse jeito? Esta certo? - MARCOS
        ItemOS itemOS1 = new ItemOS("Teste", os1, servico1);
        ItemOS itemOS2 = new ItemOS("Teste", os1, servico14);

//        os1.add(itemOS1);
//        os1.add(itemOS2);


        // Associando os cliente aos veiculos
        pf.addVeiculo(veiculo);  // Guilherme tem Versa
        pj.addVeiculo(veiculo4); // Gabriel tem S15
        pj.addVeiculo(veiculo2); // Gabriel tem RS6
        pf.addVeiculo(veiculo3); // Guilherme tem S1000RR

        // Posso formatar os valores nos get's?
        print(os1);
    }
}
