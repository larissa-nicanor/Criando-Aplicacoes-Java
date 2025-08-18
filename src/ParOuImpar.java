import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class ParOuImpar { // Declara a classe principal
    public static void main(String[] args) { // Método principal onde o programa começa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do teclado
        int numero; // Declara a variável para armazenar o número inteiro digitado

        do { // Inicia um loop do-while para garantir que o número não seja 0
            System.out.print("Digite um número inteiro (diferente de 0): "); // Solicita um número ao usuário
            numero = scanner.nextInt(); // Lê o número inteiro digitado

            if (numero == 0) { // Verifica se o número digitado é 0
                System.out.println("0 número é um caso especial (neutro). Tente novamente."); // Informa que 0 é neutro e pede novo input
            }
        } while (numero == 0); // Continua o loop enquanto o número for 0

        if (numero % 2 == 0) { // Verifica se o número é par (resto da divisão por 2 é 0)
            System.out.println(numero + " número é par"); // Exibe mensagem se for par
        } else { // Caso o resto da divisão por 2 não seja 0
            System.out.println(numero + " número é ímpar"); // Exibe mensagem se for ímpar
        }

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}