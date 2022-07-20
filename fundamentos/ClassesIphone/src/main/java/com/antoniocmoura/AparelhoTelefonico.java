package com.antoniocmoura;

public class AparelhoTelefonico {

    public ReprodutorMusical reprodutorMusical;
    public NavegadorInternet navegadorInternet;

    public AparelhoTelefonico() {
        reprodutorMusical = new ReprodutorMusical();
        navegadorInternet = new NavegadorInternet();
    }

    public void ligar() {
        System.out.println("Realizando chamada");
    }

    public void atender() {
        System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz iniciado");
    }

}
