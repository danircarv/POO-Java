package Exercicios;

import java.util.Scanner;

public class Questao39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        int qtdPessoas = 0;
        int idadeTotal = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;

        do {

            System.out.println("Digite a idade da pessoa");
            idade = sc.nextInt();

            if (idade != 0) {
                qtdPessoas++;
                idadeTotal += idade;

                if (idade > maiorIdade) {
                    maiorIdade = idade;
                } else if (idade < menorIdade) {
                    menorIdade = idade;
                }

            }


        } while (idade != 0);

        if (qtdPessoas > 0) {
            System.out.println("O total de pessoas é " + qtdPessoas);
            System.out.println("A idade media do grupo é: " + idadeTotal / qtdPessoas);
            System.out.println("A maior idade é " + maiorIdade + " e a menor é " + menorIdade);
        } else {
            System.out.println("Nenhuma idade válida foi inserida!");
        }


    }
}
