public class Aula02Temperatura {
    public static void main(String[] args) {
        // Variável para temperatura em Celsius
        double celsius = 25.0;
        // Conversão para Fahrenheit usando a fórmula (C * 1.8) + 32
        double fahrenheit = (celsius * 1.8) + 32;

        // Imprime o valor com casas decimais
        System.out.println("Temperatura em Celsius: " + celsius + "°C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
    }
}