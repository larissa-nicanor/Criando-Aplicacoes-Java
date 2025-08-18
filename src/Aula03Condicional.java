public class Aula03Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2014;
        boolean inclusoNoPlano = true;
        double notaDoFilme = 8.7;
        String tipoPlano = "plus"; //tipo do plano atual

        if(anoDeLancamento >= 2025){
            System.out.println("Filme em cartas nos cinemas");
        } else {
            System.out.println("Filme em catalogo de streaming");
        }

        if(inclusoNoPlano == true && tipoPlano.equals("plus")){ //tipo do plano plus
            System.out.println("Confição: Acesso liberado");
        } else {
            System.out.println("Confição: Pagar a locação");
        }
    }
}