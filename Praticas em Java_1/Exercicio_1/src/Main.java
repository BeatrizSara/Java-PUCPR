import java.util.Scanner;

// 1. Crie um algoritmo em Java que solicita três números decimais ao usuário.
// Em seguida, a média destes números é calculada e mostrada na tela para o usuário.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o Primeiro número:");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Informe o Segundo número:");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Informe o Segundo número:");
        double terceiroNumero = scanner.nextDouble();

        double media = (primeiroNumero + segundoNumero + terceiroNumero) / 3;

        System.out.print("O valor da média é: ");
        System.out.print(media);

    }
}