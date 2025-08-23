import java.util.Scanner; // Necessário para o Scanner

public class DesafioBancario {
    public static void main(String[] args) {
        String nome = "Larissa Nicanor";
        String tipoConta = "Corrente";
        double saldo =  3450.00;
        int opcao = 0;

        System.out.println("*********************************");
        System.out.println("\nNome do Cliente: " + nome); // pula linha \n
        System.out.println("Tipo ponta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*********************************");

        String menu = """
                *** Digite sua opção***
                1 - Consultar Saldo
                2 - Transferencia
                3 - Recebimento
                4 - Sair
                """;
        Scanner leitura = new Scanner (System.in); //ler dados do teclado

        while (opcao != 4){ //loop, enquanto for diferente de
            System.out.println(menu);
            opcao = leitura.nextInt();


            if (opcao == 1){ //se a opção for igual a
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir:");
                double valor = leitura.nextDouble(); //soma o valor ao salvo
                if (valor > saldo){ //se o valor de transferencia for maior que o saldo
                    System.out.println("Não há saldo para a transferencia");
                } else{
                    saldo = saldo - valor; //saldo -= valor
                    System.out.println("Saldo atualizado " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
            } else if (opcao != 4){
                System.out.println("Opção inválida!");
            }
        }
    }
}