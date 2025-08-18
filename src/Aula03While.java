import java.util.Scanner;

public class Aula03While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) { // significa "diferente de", necessário a condição ser verdadeira
            System.out.print("Digite a sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota; // significa que ele recebe o que já tem + a atribuição
                totalDeNotas++; // cada nota que inserir, soma o valor
            }
        }

        System.out.println("Média de avaliação " + Math.round(mediaAvaliacao/totalDeNotas)); // média, dividido pelo total
    }
}