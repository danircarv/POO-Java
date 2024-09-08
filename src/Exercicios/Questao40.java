package Exercicios;

import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de alunos a serem examinados:");
        int qtdAlunos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nomeAluno = sc.nextLine();

            System.out.println("Qual a nota da AV1 de " + nomeAluno + "?");
            double nota1 = sc.nextDouble();

            System.out.println("Qual a nota da AV2 de " + nomeAluno + "?");
            double nota2 = sc.nextDouble();
            sc.nextLine();



            if ((nota1 + nota2) / 2 < 6) {
                double maiorNota = Math.max(nota1, nota2);
                double menorNota;

                System.out.println("Digite a nota da AV3 de " + nomeAluno + ":");
                menorNota = sc.nextDouble();
                sc.nextLine();

                if ((menorNota + maiorNota) / 2 >= 6) {
                    System.out.println("O aluno " + nomeAluno + " foi aprovado!");
                } else {
                    System.out.println("O aluno " + nomeAluno + " foi reprovado!");
                }
            } else {
                System.out.println("O aluno " + nomeAluno + " foi aprovado!");
            }
        }

        sc.close();
    }
}
