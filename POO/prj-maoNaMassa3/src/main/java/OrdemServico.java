import java.time.LocalDate;
import java.util.*;

public class OrdemServico {
    // Atributos
    private long numero;
    private double total;
    private LocalDate agenda;
    private double desconto;
    // Associação Unidirecional com EStatus
    private EStatus status;
    // Relação de agregação com a classe Veiculo
    private Veiculo veiculo;
    // Classe associativa
    private List<ItemOS> itensOS = new ArrayList<>(); // Isso já garante a composição? Porque?

    // Construtor
    public OrdemServico(long numero, double total, LocalDate agenda, double desconto,EStatus status,Veiculo veiculo) {
        this.numero = numero;
        this.total = total;
        this.agenda = LocalDate.now();
        this.desconto = desconto;
        this.status = status;
        this.veiculo = veiculo;
    }

    // Métodos getters e setters
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getAgenda() {
        return agenda;
    }
    public void setAgenda(LocalDate agenda) {
        this.agenda = agenda;
    }

    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public EStatus getStatus() {
        return status;
    }
    public void setStatus(EStatus status) {
        this.status = status;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<ItemOS> getItensOS() {
        return itensOS;
    }
    public void setItensOS(List<ItemOS> itensOS) {
        this.itensOS = itensOS;
    }

    public double calcularServico(){
        return total;
    }
    public void add(ItemOS itemOS){
        itensOS.add(itemOS);
    }
    public void remove(ItemOS itemOS){
        itensOS.remove(itemOS);
    }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "veiculo=" + veiculo +
                ", status=" + status +
                ", desconto=" + desconto +
                ", agenda=" + agenda +
                ", total=" + total +
                ", numero=" + numero +
                '}';
    }
}
