import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class Tabuada { // Declara a classe principal
    public static void main(String[] args) { // Método principal onde o programa começa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do teclado
        System.out.print("Digite um número para ver sua tabuada: "); // Solicita ao usuário que digite um número
        int numero = scanner.nextInt(); // Lê o número inteiro digitado e armazena na variável numero

        for (int i = 1; i <= 10; i++) { // Inicia um loop for que vai de 1 a 10
            System.out.println(numero + " x " + i + " = " + (numero * i)); // Exibe a multiplicação do número por i e o resultado
        }

        scanner.close(); // Fecha o Scanner para liberar recursos do sistema
    }
}