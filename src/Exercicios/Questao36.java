package Exercicios;

import java.util.Scanner;

public class Questao36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o n° a ser analisado: ");
        int numero = sc.nextInt();

        System.out.println("Digite o 1° número");
        int num1 = sc.nextInt();

        System.out.println("Digite o 2° número: ");
        int num2 = sc.nextInt();

        int maior;
        int menor;
        if(num1 > num2){
            maior = num1;
            menor = num2;
        }else{
            maior = num2;
            menor = num1;
        }

        if(numero>menor && numero<maior){
            System.out.println("O número "+ numero+" está entre " + maior + " e " + menor);
        }
    }
}
