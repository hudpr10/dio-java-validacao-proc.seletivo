import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        salaryAnalyze();
    }

    public static void salaryAnalyze() {
        System.out.println("\n--- Processo Seletivo ---\n");

        double baseSalary = 2000.00;

        System.out.print("Digite o salário pretendido para a vaga: ");
        double desiredSalary = input.nextDouble();

        if(baseSalary > desiredSalary) {
            System.out.println("Ligar para o candidato.");
        } else if(baseSalary == desiredSalary) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando resultado demais candidatos.");
        }
    }
}