public class Modelo {
    private int id;
    private String descricao;
    // Relacionamento uniderional com Marca
    private Marca marca;
    // Relacionamento uniderional com ECategoria
    ECategoria categoria;
    // Relacionamento de Agreagção com Motor
    private Motor motor;

    public Modelo(int id, String descricao,Marca marca, Motor motor) {
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
        this.motor = new Motor();
    }

}
