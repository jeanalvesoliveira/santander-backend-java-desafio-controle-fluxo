package br.com.jean.desafio_fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Desafio 02: CONTROLE DE FLUXO");

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();
        scanner.nextLine();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
