import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ControleFluxo {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        tryingCallCandidate();
    }

    public static void salaryAnalyze(double desiredSalary) {
        System.out.println("\n--- Processo Seletivo ---\n");

        double baseSalary = 2000.00;

        System.out.print("Salário desejado: " + desiredSalary);

        if(baseSalary > desiredSalary) {
            System.out.println("Ligar para o candidato.");
        } else if(baseSalary == desiredSalary) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando resultado demais candidatos.");
        }
    }

    public static double randomSalary() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void candidateSelection() {
        String[] candidates = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        int selectedCandidates = 0;
        int candidatesIndex = 0;

        double baseSalary = 2000;

        while(selectedCandidates < 5 && candidatesIndex < candidates.length) {
            String candidate = candidates[candidatesIndex];
            double desiredSalary = randomSalary();

            System.out.printf("O candidato %s solicitou R$ %s \n", candidate, desiredSalary);
            if(baseSalary >= desiredSalary) {
                selectedCandidates++;
                System.out.printf("%s foi selecionado para a vaga.\n", candidate);
            } else {
                System.out.printf("%s não atende os requisitos.\n", candidate);
            }

            candidatesIndex++;
        }

        System.out.println("\nTotal de candidatos selecionados: " + selectedCandidates);
    }

    public static void showSelectedCandidates() {
        System.out.println("--- Canditados Selecionados ---");

        String[] candidates = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(int i = 0; i < candidates.length; i++) {
            System.out.printf("Candidado: %s | Indice: %s\n", candidates[i], i+1);
        }
    }

    public static boolean answerCall() {
        return new Random().nextInt(3) == 1;
    }

    public static void tryingCallCandidate() {
        System.out.println("\n--- Tentando Ligar para Candidatos (max: 3) ---\n");
        String[] candidates = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        for(String candidate: candidates) {
            int callAttempts = 0;
            while (callAttempts < 3) {
                if(answerCall()) {
                    System.out.printf("%s atendeu a ligação na %s° tentativa.\n", candidate, callAttempts+1);
                    break;
                } else {
                    callAttempts++;
                    if (callAttempts == 3) {
                       System.out.printf("%s não respondeu as ligações.\n", candidate);
                    }
                }
            }
        }
    }
}