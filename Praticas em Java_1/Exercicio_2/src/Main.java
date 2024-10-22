import java.util.Scanner;

//2. Crie um algoritmo em Java que verifica se um número inteiro é positivo, negativo ou zero.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String msg = "Insira um numero inteiro: ";
        System.out.print(msg);

        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.print("O numero é zero!");
        } else if (numero > 0) {
            System.out.print("O número é positivo");
        } else{
            System.out.print("O número é negativo");
        }

    }
}