package Exercicios;

import java.util.Scanner;

public class Questao38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da Temperatura");
        double temperatura = sc.nextDouble();

        System.out.println("Digite a escala da Temperatura\n1- Celsius \n2- Fahrenheit \n3- Kelvin");
        int escala = sc.nextInt();

        System.out.println("Digite a escala para conversão: \n1 - Celsius \n2 - Fahrenheit \n3 - Kelvin");
        int conversao = sc.nextInt();

        switch (conversao){
            case 1:
                if (escala == 2){
                    temperatura = (temperatura-32)/1.8;
                } else if (escala == 3) {
                    temperatura = (temperatura-273.15);
                }
            break;

            case 2:
                if (escala == 1){
                    temperatura = (temperatura*1.8 +32);
                } else if (escala == 3) {
                    temperatura = ((temperatura - 273)*1.8 +32);
                }
            break;

            case 3:
                if (escala == 1){
                    temperatura += 273.15;
                }else if (escala == 2){

                }

        }
    }
}
