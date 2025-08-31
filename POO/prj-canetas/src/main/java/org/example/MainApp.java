package org.example;
public class MainApp {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.carga = 100;
        c1.tampada = true;
        c1.espessura = 0.07f;
        Caneta c2 = new Caneta();
        c2.cor = "Verde";
        c2.carga = 100;
        c2.tampada = false;
        c2.espessura = 0.05f;
        System.out.println(c1.espessura);
        System.out.println(c1.cor);
        System.out.println(c1.carga);
        System.out.println(c1.tampada);
        System.out.println("=======");
        System.out.println(c2.espessura);
        System.out.println(c2.cor);
        System.out.println(c2.carga);
        System.out.println(c2.tampada);
    }
}