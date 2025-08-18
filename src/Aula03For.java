import java.util.Scanner;

public class Aula03For {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //A classe Scanner é utilizada para ler dados de entrada
        double mediaAvaliaçao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) { //++ siginifca que esta ingremendando de 1 em 1
            System.out.println("Digite a sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliaçao += nota; //+= significa que ele recebe o que ja tinha + a atribuição
        }
        System.out.println("Media de avaliação " + mediaAvaliaçao/3); //dividido a media sob total de 3 notas
    }
}