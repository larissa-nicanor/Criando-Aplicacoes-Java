import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhação {
    public static void main(String[] args) {
        // Gera um número aleatório entre 0 e 100
        Random gerador = new Random();
        int numeroSecreto = gerador.nextInt(100); //Scanner para ler a entrada do usuário.
        Scanner leitura = new Scanner(System.in); //cria um objeto para gerar números aleatórios.
        int tentativas = 0; //gera um número entre 0 e 99
        final int MAX_TENTATIVAS = 5; //define o limite de 5 tentativas

        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 0 e 100.");
        System.out.println("Você tem até " + MAX_TENTATIVAS + " tentativas.");

        // Loop para controlar as tentativas
        while (tentativas < MAX_TENTATIVAS) {
            System.out.print("Digite sua tentativa (" + (tentativas + 1) + "/" + MAX_TENTATIVAS + "): ");
            int chute = leitura.nextInt();
            tentativas++;

            // Verifica se o chute está correto
            if (chute == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas!");
                break; // Interrompe o loop se acertar
            } else if (chute < numeroSecreto) {
                System.out.println("O número secreto é maior. Tente novamente!");
            } else {
                System.out.println("O número secreto é menor. Tente novamente!");
            }

            // Verifica se esgotou as tentativas
            if (tentativas == MAX_TENTATIVAS) {
                System.out.println("Suas tentativas acabaram! O número secreto era " + numeroSecreto + ".");
            }
        }
        leitura.close(); //fecha o Scanner para evitar vazamentos de recursos.
    }
}