public class Aula02Variaveis {
    public static void main(String[] args) {
        System.out.println("Bem-Vindo ao Screen Match");
        System.out.println("Filme: Interestelar");

        int anoDeLancamento = 2014;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean inclusoNoPlano = true;
        double notaDoFilme = 8.7;
        //media calculada por 3 notas de individos diferentes
        double media = (9.8 + 6.3 + 8.0) / 3;
        // Isso exibe a variável media com 1 casa decimal, resultando em "8.0".
        System.out.printf("Avaliação: %.1f%n", media);
        // %.1f formata o número como decimal com 1 casa após o ponto.
        // %n adiciona uma nova linha, equivalente a \n.

        String sinopse;
        sinopse = """
                As reservas naturais da Terra estão chegando ao fim e um grupo de astronautas recebe a missão:
                verificar possíveis planetas para receberem a população mundial!
                """;
        System.out.println(sinopse);
        int classificacao = (int) (media /2);
        System.out.println(classificacao);
   }
}
