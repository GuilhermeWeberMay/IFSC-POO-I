public class MainApp {
    public static void main(String[] args) {
        // Criação e instanciação do objeto
        Livro livro = new Livro();
        // Criação, instanciação e inicialização do objeto
        Livro livro2 = new Livro();
        livro2.setPrecoCusto(10);
        System.out.println(livro2.getPrecoCusto());
        System.out.println(livro2.getMargemLucro()); // está apresentando a margem de lucro 0.02
        System.out.println(livro.getPrecoVenda());
    }
}
