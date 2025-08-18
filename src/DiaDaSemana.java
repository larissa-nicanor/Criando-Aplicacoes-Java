import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DiaDaSemana {
    public static void main(String[] args) {
        int dia = 17; // Agosto
        int mes = 8;
        int ano = 2025;
        LocalDate data = LocalDate.of(ano, mes, dia);

        // Formata o dia da semana em português
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", new Locale("pt", "BR"));
        String nomeDia = data.format(formatter);

        System.out.println("Dia " + dia + " é " + nomeDia);
    }
}