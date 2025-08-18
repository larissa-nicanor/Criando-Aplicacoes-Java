import java.util.Scanner; //Para utilizar a classe Scanner, é necessário importá-la no início do programa.

public class Aula03Scanner {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //A classe Scanner é utilizada para ler dados de entrada

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite a sua avaliação para o filme: ");
        double avaliaçao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliaçao);
    }
}