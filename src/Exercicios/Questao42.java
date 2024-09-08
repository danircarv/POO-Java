package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Questao42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetorValores = new int[20];
        int qtdPar = 0, qtdImpar = 0;
        for (int valoresArmazenados = 0; valoresArmazenados <20 ; valoresArmazenados++) {
            System.out.print("Digite um valor: ");
            vetorValores[valoresArmazenados] = sc.nextInt();
            if (vetorValores[valoresArmazenados] % 2 == 0) {
                qtdPar++;
            }else{
                qtdImpar++;
            }
        }
        int [] vetorPar = new int[qtdPar];
        int [] vetorImpar = new int[qtdImpar];
        int indicePar = 0;
        int indiceImpar = 0;

        for (int valoresArmazenados : vetorValores) {
            if (valoresArmazenados % 2 == 0) {
                vetorPar[indicePar] = valoresArmazenados;
                indicePar++;
            }else{
                vetorImpar[indiceImpar] = valoresArmazenados;
                indiceImpar++;
            }
        }

       System.out.println(Arrays.toString(vetorValores));
        System.out.println(Arrays.toString(vetorPar));
        System.out.println(Arrays.toString(vetorImpar));



    }
}
