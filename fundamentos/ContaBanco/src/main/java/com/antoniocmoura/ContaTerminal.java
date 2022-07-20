package com.antoniocmoura;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Número da conta: ");
        String conta = scan.next();
        System.out.println("Número da agência: ");
        int agencia = scan.nextInt();
        System.out.println("Nome do cliente: ");
        String nome = scan.next();
        System.out.println("Saldo Inicial: ");
        Double saldo = scan.nextDouble();

        String mensagem = String
                .format("Olá %1s, obrigado por criar uma conta em nosso banco, sua agência é %2s, conta %3s e seu saldo %4.2f já está disponível para saque.",
                        nome, agencia, conta, saldo
                );

        System.out.println(mensagem);

    }
}