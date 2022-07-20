package com.antoniocmoura;

public class Main {

    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.navegadorInternet.exibirPagina();
        aparelhoTelefonico.navegadorInternet.adicionarNovaAba();;
        aparelhoTelefonico.navegadorInternet.atualizarPagina();
        aparelhoTelefonico.reprodutorMusical.tocar();
        aparelhoTelefonico.reprodutorMusical.pausar();
        aparelhoTelefonico.reprodutorMusical.selecionarMusica();
    }
}