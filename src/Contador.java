import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber;

        System.out.println("\n--- Bem vindo ao Contador ---\n");
        while (true) {
            System.out.print("Digite um número para a inicar a contagem: ");
            firstNumber = input.nextInt();

            System.out.print("Digite o segundo número para o final da contagem: ");
            secondNumber = input.nextInt();

            try {
                if(firstNumber > secondNumber) {
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
                } else {
                    break;
                }
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println();
        for(int i = 1; i <= secondNumber - firstNumber; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
