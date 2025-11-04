import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        Date data = new Date(125, 9, 24, 23, 59);
        //PessoaJuridica pj = new PessoaJuridica(1, "Tela & Decor", "48991550957", "contato@teladecor.com.br",
        //        3000,"10.820.608/0001-16","123456789");
        //System.out.println(pj);
        PessoaFisica pf = new PessoaFisica(1, "Guilherme", "48999117218", "guilherme@",
                data,100, "10168481960");
        //System.out.println(pf);

        System.out.println(pf.getDados("Olá mundo!"));
        System.out.println(data.getDay());
        System.out.println(data.getMonth());
        System.out.println(data.getYear());
        System.out.println(data);
        System.out.println(data.toLocaleString());


    }
}
