import java.util.Scanner;

// 4. Crie um algoritmo em Java que peça ao usuário para que se digite um número inteiro (exemplo: 14).
// Em seguida, o algoritmo deve mostrar a tabuada do número digitado utilizando o “for”.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String msg = "Informe um numero inteiro para verificar a sua tabuada: ";
        System.out.print(msg);
        int numero = scanner.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.print(numero + "x" + i + "=" + (numero*i) + "\n");

        }

    }
}