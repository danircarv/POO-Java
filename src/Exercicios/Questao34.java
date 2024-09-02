package Exercicios;

import java.util.Scanner;

public class Questao34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = sc.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        float soma = maior + menor;

        System.out.println("O maior número é " + maior + ". E o menor é " + menor);
        System.out.println("A soma deles é "+soma);
        System.out.println("E a média é "+ soma/2);
    }
}
