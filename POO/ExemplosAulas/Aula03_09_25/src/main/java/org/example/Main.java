package org.example;

public class Main {
    public static void main(String[] args) {
        // IDE - Integrated Desenvolviment Enviroment
        // Nomes de Classes sempre com a primeira letra maiuscula
        // E sempre no singular
        // Nome de arquivo e de classe devem ser iguais
        // Atributos caracterizam o que o objeto É
        // Dar nome sigfinicativos aos atributos para identificar melhor
        // Modicicadores de acesso: quem ira usar os atributos - existem 4 tipos
        /*
        PÚBLICO
        PRIVATE - só pode ser usado dentro da própria classe
        PROTECTED - consegue ver se for na mesma página e na mesma hierarquia, se fizer um packgage não funciona
        DEFAULT - não precisa ser escrito a palavra, só consegue acessar por outra classe e se estiverem no mesmo pacote
        */
        // Para objetos tabem existem modificadores de acesso, mas são somente public e package
        // Métodos é o que o objeto faz, um processo
        // Métodos começam com letra minuscula
        // Mesmo modeificadores do atributos - public,private,protected e default
        // Comando break somente utilisado em for do while e switchcase

        Caneta caneta = new Caneta();
        caneta.cor = "Azul preto branco";
        caneta.ponta = 0.5f;



        System.out.println("Caneta "+caneta.toString());

    }
}