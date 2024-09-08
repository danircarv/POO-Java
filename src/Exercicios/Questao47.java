package Exercicios;

import java.util.Scanner;

public class Questao47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] qtdNotas = {100, 100, 1, 100, 100};
        int[] valorNotas = {100, 50, 10, 5, 2};
        int repetirTransicao;
        do {
            int[] qtdCedulas = new int[5];

            System.out.println("Digite valor a ser sacado: ");
            int valor = sc.nextInt();
            int valorSaque = valor;
            if (valor >= 10 && valor <= 2000) {
                for (int posicao = 0; posicao < 5; posicao++) {
                    int numNotas = valor / valorNotas[posicao];

                    if (numNotas <= qtdNotas[posicao]) {
                        qtdCedulas[posicao] = numNotas;
                        valor = valor % valorNotas[posicao];
                    } else {
                        qtdCedulas[posicao] = qtdNotas[posicao];
                        valor -= qtdNotas[posicao] * valorNotas[posicao];
                    }

                }

                if (valor != 0) {
                    System.out.println("O valor sacado foi incompleto e foi de apenas: " + (valorSaque - valor));
                    for (int indiceVetor = 0; indiceVetor < 5; indiceVetor++) {
                        System.out.print(qtdCedulas[indiceVetor] + " notas de " + valorNotas[indiceVetor] + " .");

                    }

                } else {
                    System.out.println("O valor foi sacado completamente. E o valor foi: " + valorSaque);
                    for (int indiceVetor = 0; indiceVetor < 5; indiceVetor++) {
                        System.out.print(qtdCedulas[indiceVetor] + " notas de " + valorNotas[indiceVetor] + " .");

                    }
                }

            } else {
                System.out.println("Valor fora dos limites permitidos!");
            }



            System.out.println("\nDeseja repetir a transação? (S=1/N=0)");
            repetirTransicao = sc.nextInt();
        } while (repetirTransicao != 0);

    }
}
