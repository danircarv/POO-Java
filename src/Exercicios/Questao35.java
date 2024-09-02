package Exercicios;

import java.util.Scanner;

public class Questao35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();
        int divisores = 0;

        for (int i = 1; i <=number ; i++) {
            if(number % i == 0){
                divisores++;
            }

        }

        if(divisores ==2){
            System.out.println("O número "+ number+" é primo");
        } else {
            System.out.println("O número "+ number+" não é primo");

        }
    }
}
