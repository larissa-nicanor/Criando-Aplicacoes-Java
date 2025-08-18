public class Aula02Desafio {
    public static void main(String[] args) {
        // 1 - Média de duas notas decimais
        double nota1 = 7.5;
        double nota2 = 8.2;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média das notas: " + media);

        // 2 - Casting de double para int
        double numeroDouble = 15.7;
        int numeroInteiro = (int) numeroDouble;
        System.out.println("Número double: " + numeroDouble + ", Número inteiro: " + numeroInteiro);

        // 3 - Variáveis char e String com concatenação
        char letra = 'A';
        String palavra = "luno";
        System.out.println("Concatenação: " + letra + palavra);

        // 4 - Cálculo do valor total
        double precoProduto = 29.90;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.printf("Valor total: %.2f reais%n", valorTotal);

        // 5 - Conversão de dólares para reais
        double valorEmDolares = 50.0;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.printf("Valor em reais: %.2f%n", valorEmReais);
        // %.2f formata o número como ponto flutuante com 2 casas decimais, corrigindo imprecisões.
        // %n adiciona uma nova linha, equivalente a \n, para organizar a saída.

        // 6 - Cálculo de desconto
        double precoOriginal = 100.0;
        double percentualDesconto = 10.0;
        double valorDesconto = (precoOriginal * percentualDesconto) / 100;
        double novoPreco = precoOriginal - valorDesconto;
        System.out.printf("Novo preço com desconto: %.2f%n", novoPreco);
    }
}