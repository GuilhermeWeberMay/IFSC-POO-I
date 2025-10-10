public class Motor {
    private int potencia;
    // Relacionamento Unidirecional com ETipoCombustivel
    ETipoCombustivel tipoCombustivel;
    public Motor(int potencia, ETipoCombustivel tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", tipoCombustivel=" + tipoCombustivel +
                '}';
    }
}
