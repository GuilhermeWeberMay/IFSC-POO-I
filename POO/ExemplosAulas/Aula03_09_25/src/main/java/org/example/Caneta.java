package org.example;

public class Caneta {
    public String cor;
    public float ponta;
    public int carga = 100;
    public boolean tamapada;
    // Nomes de metodos geralmente estão no infinito
    public void escrever(String texto){
        if(tamapada == false){
            System.out.println("Caneta escrevendo...");
        }
    }
    public void pintar(){
        System.out.println("Caneta pintando...");
    }
    public void tampar(){
        this.tamapada = true;
        // O this aplica algo na variavel
        System.out.println("Caneta tampada");
    }
    public void destampar(){
        this.tamapada = false;
        System.out.println("Caneta destampada");
    }


}
