package com.antoniocmoura;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scan.nextInt();
        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm <= parametroDois) {
            int contagem = parametroDois - parametroUm;
            for (var i=0; i < contagem; i++) {
                System.out.println(i+1);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}