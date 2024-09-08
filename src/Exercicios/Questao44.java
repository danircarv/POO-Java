package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Questao44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int[5];
        int somaValores = 0;
        int produtoValores = 1;
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o " + (i+1) + " ° valor");
            vetor[i] = sc.nextInt();
            somaValores+=vetor[i];
            produtoValores*=vetor[i];


        }


        System.out.println("A soma dos valores: " + somaValores);
        System.out.println("O produto dos valores: " + produtoValores);
        System.out.println(Arrays.toString(vetor));



    }
}
