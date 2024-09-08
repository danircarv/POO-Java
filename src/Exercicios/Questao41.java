package Exercicios;

import java.util.Scanner;

public class Questao41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° valor: ");
        float valor1 = sc.nextFloat();

        System.out.println("Digite o 2° valor: ");
        float valor2 = sc.nextFloat();

        System.out.println("Digite o 3° valor: ");
        float valor3 = sc.nextFloat();

        if(verificarTriangulo(valor1, valor2, valor3)){
            System.out.println("Triangulo OK");
            System.out.println("O tipo do triângulo é " + tipoDeTriangulo(valor1, valor2, valor3));

        }else {
            System.out.println("Triangulo não existe");
        }


    }
    public static boolean verificarTriangulo(float a, float b, float c){
        return (a + b > c) && (a + c > b) && (b + c > a);

    }
    public static String tipoDeTriangulo(float a, float b, float c){
        if(a==b || a==c || b==c){
            return "Triangulo Isósceles";
        } else if (a==b && b==c) {
            return "Triângulo Esquilátero";
        } else {
            return "Triangulo Escaleno";
        }
    }
}
