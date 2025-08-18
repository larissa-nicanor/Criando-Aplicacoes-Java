import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class CalculadoraArea { // Declara a classe principal
    public static void main(String[] args) { // Método principal onde o programa começa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do teclado
        System.out.println("1. Calcular área do quadrado"); // Exibe a primeira opção do menu
        System.out.println("2. Calcular área do círculo"); // Exibe a segunda opção do menu
        System.out.print("Escolha uma opção (1 ou 2): "); // Solicita a escolha do usuário
        int opcao = scanner.nextInt(); // Lê a opção escolhida e armazena na variável opcao

        if (opcao == 1) { // Verifica se a opção escolhida é 1 (área do quadrado)
            System.out.print("Digite o lado do quadrado: "); // Solicita o lado do quadrado
            double lado = scanner.nextDouble(); // Lê o valor do lado
            double area = lado * lado; // Calcula a área do quadrado (lado * lado)
            System.out.println("Área do quadrado: " + area); // Exibe o resultado da área
        } else if (opcao == 2) { // Verifica se a opção escolhida é 2 (área do círculo)
            System.out.print("Digite o raio do círculo: "); // Solicita o raio do círculo
            double raio = scanner.nextDouble(); // Lê o valor do raio
            double area = Math.PI * raio * raio; // Calcula a área do círculo (π * raio²)
            System.out.println("Área do círculo: " + area); // Exibe o resultado da área
        } else { // Caso a opção não seja 1 nem 2
            System.out.println("Opção inválida!"); // Informa que a escolha foi inválida
        }

        scanner.close(); // Fecha o Scanner para liberar recursos do sistema
    }
}