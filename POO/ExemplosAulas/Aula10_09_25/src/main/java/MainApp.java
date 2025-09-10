public class MainApp {
    public static void main(String[] args) {
//      Exemplo

//      Instanciação - construtor de classe padrão - Caneta() é o contrustor padrão
//          Caneta c1 = new Caneta();
//          c1.cor = "Azul";
//          c1.ponta = 0.05f;

//      Método de criação do método construtor padrão
//          public Caneta(){
//            this.cor = null;
//            this.ponta = 0.0f
//          }

//      Como colocar uma regra de negócio - assim você obriga o usuario a inserir uma informação
//          public Caneta(String cor, float espessura){
//            this.cor = cor;
//            this.espessura = cor
//          }

//       Pode ter mais de um método construtor com todos os atributos ou somente alguns
//          public Caneta(String cor){
//            this.cor = cor;
//          }

//       Não é possivel fazer uma sobrecarga de um objeto com o mesmo tipo de variavel primitiva
//       Construtor Padrão do Java - sem inicializar nenhuma regra de negócio
//          public Caneta(){
//             //Vazio
//          }

//       Todo metodo set nao retorna valor entao é void e tem um parametro
//          public void setCor (String cor){
//            this.cor = cor;
//        }
//
//       Todo get tem retorno e retorna algo
//          public String getCor(){
//            return cor;
//        }

//        Boas práticas
//        PRIMEIRO os atributos
//        SEGUNDO os costrutores
//        TERCEIRO os metodos operacionais getter's e setter's

//        public void setCarga(int carga){
//           if (carga >= 0 && carga <= 100){
//             this.carga = carga;
//            }else{
//               new runtimeException ("Carga indesejada");
//             }
//        }
//        classes de dominio de aplicação nao tem system.out.print
    }
}