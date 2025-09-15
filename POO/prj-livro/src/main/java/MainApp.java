public class MainApp {
    public static void main(String[] args) {
        // Criação e instanciação do objeto e carregamento do objeto
        Livro livro = new Livro(15.99f,0.5f);
        System.out.println(livro.getPrecoCusto());
        System.out.println(livro.getMargemLucro());
        System.out.println(livro.getPrecoVenda());
    }
}
