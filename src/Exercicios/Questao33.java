package Exercicios;

import java.util.Scanner;

public class Questao33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o  1° número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o 2° numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o 3° numero: ");
        int num3 = scanner.nextInt();

        int maior = num1;
        int menor = num1;

        if(num2 > num1){
            maior = num2;
        }
        if(num3 > num1){
            maior = num3;
        }

        if(num1 > num2){
            menor = num2;
        }

        if(num1 > num3){
            menor = num3;
        }

        System.out.println("O maior número é " + maior);
        System.out.println("O menor númeor é " + menor);

        scanner.close();




    }
}
