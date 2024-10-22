
// 3. Crie um algoritmo em Java que mostre na tela todos os múltiplos de 3
// entre os números 0 e 30 usando a estrutura “do while”.

public class Main {
    public static void main(String[] args) {

        int numero = 0;

        while (numero <= 30) {

            if ((numero % 3) == 0) {
                System.out.print("O numero ");
                System.out.print(numero);
                System.out.print(" é multiplo de 3\n");
            }

            numero ++;
        }
    }
}