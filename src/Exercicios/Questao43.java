package Exercicios;

import java.util.Scanner;

public class Questao43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] vetorMedias = new float [10];
        for(int numeroAluno = 1; numeroAluno <=10 ; numeroAluno++) {
            System.out.println("Digite o nome do aluno: ");
            String nomeAluno = sc.nextLine();


           System.out.println("Digite a 1ª nota do aluno " + nomeAluno);
           float nota1 = sc.nextFloat();
           sc.nextLine();

           System.out.println("Digite a 2ª nota do aluno " + nomeAluno);
           float nota2 = sc.nextFloat();
            sc.nextLine();


            System.out.println("Digite a 3ª nota do aluno " + nomeAluno);
           float nota3 = sc.nextFloat();
            sc.nextLine();


            System.out.println("Digite a 4ª nota do aluno " + nomeAluno);
           float nota4 = sc.nextFloat();
            sc.nextLine();


            float media = (nota1 + nota2 + nota3 + nota4) / 4;
           vetorMedias[numeroAluno - 1] = media;

        }

        int qtdAprovados = 0;
        for(float media : vetorMedias){
            if(media > 7){
                qtdAprovados++;
            }
        }

        System.out.println("Aprovados: " + qtdAprovados );
    }
}
