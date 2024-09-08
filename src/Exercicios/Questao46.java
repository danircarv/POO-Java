package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Questao46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] primeiroVetor = new int[10];
        int[] segundoVetor = new int[10];

        for (int numeroElemento = 0; numeroElemento < 10; numeroElemento++) {
            System.out.println("Digite o " + (numeroElemento +1) + "° elemento do primeiro vetor: ");
            primeiroVetor[numeroElemento] = sc.nextInt();

            System.out.println("Digite o " + (numeroElemento+1) + "° elemento do segundo vetor: ");
            segundoVetor[numeroElemento] = sc.nextInt();
        }

        System.out.println("Primeiro vetor: " + Arrays.toString(primeiroVetor));
        System.out.println("Segundo vetor: " + Arrays.toString(segundoVetor));

        int [] terceiroVetor = new int[20];
        int indexPrimeiroVetor = 0;
        int indexSegundoVetor = 0;
        for (int numeroElemento = 0; numeroElemento < 20; numeroElemento++) {
            if(numeroElemento%2==0){
                terceiroVetor[numeroElemento] = primeiroVetor[indexPrimeiroVetor];
                indexPrimeiroVetor++;
            }else {
                terceiroVetor[numeroElemento] = segundoVetor[indexSegundoVetor];
                indexSegundoVetor++;
            }
        }

        System.out.println("Terceiro vetor: " + Arrays.toString(terceiroVetor));

    }
}
