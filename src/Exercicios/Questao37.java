package Exercicios;

import java.util.Scanner;

public class Questao37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Digite um número entre 12 e 20: ");
            number = sc.nextInt();

            if (number < 12 || number > 20) {
                System.out.println("Número inválido!");
            }


        } while (number < 12 || number > 20);

        System.out.println("Número "+ number +" válido!");
    }
}
