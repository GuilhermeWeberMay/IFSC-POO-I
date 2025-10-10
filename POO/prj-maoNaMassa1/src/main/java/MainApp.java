public class MainApp {
    public static void main(String[] args) {
        Cor cor = new Cor();
        Veiculo veiculo = new Veiculo();
        Cliente cliente = new Cliente();
        Marca marca = new Marca();
        Modelo modelo = new Modelo(1,"Modelo de caminhonete", marca,ECategoria.GRANDE,500,ETipoCombustivel.DIESEL);

        System.out.println(cor);
        System.out.println(veiculo);
        System.out.println(cliente);
        System.out.println(modelo);
        System.out.println(marca);

    }
}
