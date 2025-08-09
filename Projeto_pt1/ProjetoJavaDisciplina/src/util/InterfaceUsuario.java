package util;

import java.util.Scanner;  // Importa a Classe Scanner, que é usada para obter entrada do usuário no console.

public class InterfaceUsuario {

    public double pedirValorImovel() { // método pede ao usuário para inserir o valor do imóvel.
        Scanner scanner = new Scanner(System.in);
        double valorImovel = 0;
        do { // usa um loop do-while para garantir que o usuário insira um valor válido (ou seja, um número positivo).
            System.out.println("Informe o valor do imóvel: ");
            try {
                valorImovel = scanner.nextDouble(); //Verificacação do tipo de entrada utilizando o metodo 'hasNextDouble' do Scanner
                if (valorImovel <= 0) {
                    System.out.println("O valor do imóvel deve ser positivo. Por favor, informe novamente.");
                }
            }catch (Exception e) {
                System.out.println("Por favor, informe um valor numérico válido.");
                scanner.next(); // Limpa o buffer do scanner
            }
        } while (valorImovel <= 0);
        return valorImovel;
    }
    // Métodos anteriores omitidos para brevidade

    public double pedirAreaConstruida() {
        Scanner scanner = new Scanner(System.in);
        double areaConstruida = 0;
        do {
            System.out.println("Informe a área construída (em metros quadrados): ");
            try {
                areaConstruida = scanner.nextDouble();
                if (areaConstruida <= 0) {
                    System.out.println("A área construída deve ser positiva. Por favor, informe novamente.");
                }
            } catch (Exception e){
                System.out.println("Por favor, informe um valor numérico válido.");
                scanner.next();
            }
        } while (areaConstruida <= 0);
        return areaConstruida;
    }

    // Método para pedir o prazo do financiamento em anos
    public int pedirPrazoFinanciamento () {
        Scanner scanner = new Scanner(System.in);
        int prazoFinanciamento;
        do {
            System.out.println("Informe o prazo do Financiamento (em anos): ");
            try { //Verificacação do tipo de entrada utilizando o metodo 'hasNextInt' do
                prazoFinanciamento = scanner.nextInt();
                if (prazoFinanciamento <= 0) {
                    System.out.println("O prazo do Financiamento deve ser positivo. Por favor, informe novamente.");
                }

            } catch (Exception e) {
                System.out.println("Por favor, informe um valor numérico válido.");
                scanner.next(); // Limpa o buffer do scanner
                prazoFinanciamento = -1; // Define um valor inválido para repetir o loop
            }

        } while (prazoFinanciamento <= 0);
        return prazoFinanciamento;
    }
    // Método para pedir a taxa de juros anual
    public double pedirTaxaJuros () {
        Scanner scanner = new Scanner(System.in);
        double juros;
        do {
            System.out.println("Digite a taxa de juros anual (em porcentagem): ");
            try{
                juros = scanner.nextDouble();
                if (juros <= 0){
                    System.out.println("A taxa de juros deve ser positiva. Por favor, informe novamente.");
                }
            } catch (Exception e){
                System.out.println("Por favor, informe um valor válido.");
                scanner.next(); // Limpa o buffer do scanner
                juros = -1; // Define um valor inválido para repetir o loop
            }
        } while (juros <= 0);
        return juros;
    }

    public double pedirTamanhoTerreno() {
        Scanner scanner = new Scanner(System.in);
        double tamanhoTerreno = 0;
        do {
            System.out.println("Informe o tamanho do terreno (em metros quadrados): ");
             try {
                tamanhoTerreno = scanner.nextDouble();
                if (tamanhoTerreno <= 0) {
                    System.out.println("O tamanho do terreno deve ser positivo. Por favor, informe novamente.");
                }
            } catch (Exception e){
                System.out.println("Por favor, informe um valor numérico válido.");
                scanner.next();
            }
        } while (tamanhoTerreno <= 0);
        return tamanhoTerreno;
    }

    public int pedirVagasGaragem() {
        Scanner scanner = new Scanner(System.in);
        int vagasGaragem = 0;
        do {
            System.out.println("Informe o número de vagas na garagem: ");
            try {
                vagasGaragem = scanner.nextInt();
                if (vagasGaragem < 0) {
                    System.out.println("O número de vagas deve ser zero ou positivo. Por favor, informe novamente.");
                }
            } catch (Exception e){
                System.out.println("Por favor, informe um valor numérico válido.");
                scanner.next();
            }
        } while (vagasGaragem < 0);
        return vagasGaragem;
    }

    public int pedirNumeroAndar() {
        Scanner scanner = new Scanner(System.in);
        int numeroAndar = 0;
        do {
            System.out.println("Informe o número do andar: ");
            try {
                numeroAndar = scanner.nextInt();
                if (numeroAndar < 0) {
                    System.out.println("O número do andar deve ser zero ou positivo. Por favor, informe novamente.");
                }
            } catch(Exception e) {
                System.out.println("Por favor, informe um valor numérico válido.");
                scanner.next();
            }
        } while (numeroAndar < 0);
        return numeroAndar;
    }

    public String pedirTipoZona() {
        Scanner scanner = new Scanner(System.in);
        String tipoZona;
        do {
            System.out.println("Informe o tipo de zona (residencial ou comercial): ");
            tipoZona = scanner.next();
            if (!tipoZona.equalsIgnoreCase("residencial") && !tipoZona.equalsIgnoreCase("comercial")) {
                System.out.println("Tipo de zona inválido. Por favor, informe 'residencial' ou 'comercial'.");
            }
        } while (!tipoZona.equalsIgnoreCase("residencial") && !tipoZona.equalsIgnoreCase("comercial"));
        return tipoZona;
    }
}
