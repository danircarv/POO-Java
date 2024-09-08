package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Questao45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] vetorAlturas = new float[5];
        float [] vetorIdades = new float[5];
        for (int qtdDePessoas = 1; qtdDePessoas <=5 ; qtdDePessoas++) {
            System.out.print("Informe a altura da " + (qtdDePessoas) + "ª pessoa: ");
            float altura = sc.nextFloat();
            vetorAlturas[qtdDePessoas-1] = altura;

            System.out.print("Informe a idade da " + qtdDePessoas + "ª pessoa: ");
            float idade = sc.nextFloat();
            vetorIdades[qtdDePessoas-1] = idade;


        }


        for (int i = 0; i <3 ; i++) {
            float temp = vetorAlturas[i];
            vetorAlturas[i] = vetorAlturas[4-i];
            vetorAlturas[4-i] = temp;
        }

        for (int i = 0; i < 3; i++) {
            float temp = vetorIdades[i];
            vetorIdades[i] = vetorIdades[4-i];
            vetorIdades[4-i] = temp;

        }

        System.out.println(Arrays.toString(vetorAlturas));
        System.out.println(Arrays.toString(vetorIdades));


    }
}
