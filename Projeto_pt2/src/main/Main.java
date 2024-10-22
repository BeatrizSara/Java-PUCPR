/* Projeto Disciplina: Sistema de simulação de financiamentos imobiliários de um grande banco
Aluna: Beatriz Sara dos Santos
Fundamentos da Programação Orientada a Objetos
Turma: 21
*/

package main; // precisa sempre ocupar a primeira linha do código!

import modelo.Financiamento;
import modelo.Casa;
import modelo.Apartamento;
import modelo.Terreno;
import util.InterfaceUsuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario(); // Cria uma instância da classe InterfaceUsuario para interagir com o usuário
          List<Financiamento> financiamentos = new ArrayList<>(); // Cria um ArrayList para armazenar os objetos Financiamento

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de financiamento:");
        System.out.println("1. Casa");
        System.out.println("2. Apartamento");
        System.out.println("3. Terreno");
        int tipoFinanciamento = scanner.nextInt();

        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamentoAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnual = interfaceUsuario.pedirTaxaJuros();

        switch (tipoFinanciamento) {
            case 1:
                double areaConstruida = interfaceUsuario.pedirAreaConstruida();
                double tamanhoTerreno = interfaceUsuario.pedirTamanhoTerreno();
                Casa casaUsuario = new Casa(valorImovel, prazoFinanciamentoAnos, taxaJurosAnual, areaConstruida, tamanhoTerreno);
                financiamentos.add(casaUsuario);
                break;
            case 2:
                int vagasGaragem = interfaceUsuario.pedirVagasGaragem();
                int numeroAndar = interfaceUsuario.pedirNumeroAndar();
                Apartamento apartamentoUsuario = new Apartamento(valorImovel,prazoFinanciamentoAnos, taxaJurosAnual, vagasGaragem, numeroAndar);
                financiamentos.add(apartamentoUsuario);
                break;
            case 3:
                String tipoZona = interfaceUsuario.pedirTipoZona();
                Terreno terrenoUsuario = new Terreno(valorImovel, prazoFinanciamentoAnos, taxaJurosAnual, tipoZona);
                financiamentos.add(terrenoUsuario);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        // Adiciona financiamentos ao ArrayList. Financiamentos pré-definidos
        financiamentos.add(new Casa(250000, 25, 5.0, 150.0, 85.0)); // Financiamento pré-definido
        financiamentos.add(new Apartamento(300000, 20, 4.5, 1, 4)); // Financiamento pré-definido
        financiamentos.add(new Apartamento(320000, 30, 4.0, 2, 7)); // Financiamento pré-definido
        financiamentos.add(new Terreno(150000, 15, 6.0, "Residencial")); // Financiamento pré-definido

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento financiamento : financiamentos){ // Loop para percorrer o ArrayList de financiamentos
            totalImoveis += financiamento.getValorImovel(); // Soma o valor do imóvel ao total de imóveis
            totalFinanciamentos += financiamento.calcularTotalPagamento(); // Soma o valor total do financiamento ao total de financiamentos
        }

        // Exibe o valor total dos imóveis e financiamentos
        System.out.println("Total de todos os imóveis: R$ " + String.format("%.2f", totalImoveis));
        System.out.println("Total de todos os financiamentos: R$ " + String.format("%.2f", totalFinanciamentos));

        System.out.print("------------------------------------------------- SEM SERIALIZAR -------------------------------------------------\n");
        // Salvando em formato txt os dados de financiamento
        try {
            FileWriter fw = new FileWriter("DadosFinanciamento.txt"); // Criando um arquivo txt

            for (Financiamento financiamento : financiamentos) {
                fw.write(financiamento.toString());
                fw.write("\n");
                fw.flush();
            }
            fw.close();

            FileReader fr = new FileReader("DadosFinanciamento.txt");
            BufferedReader lerArq = new BufferedReader(fr);
            String linha = lerArq.readLine(); // le da primeira linha do arquivo

            while (linha != null) {
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

        } catch (Exception e){
            System.out.print("Erro ao salvar arquivo em txt");
        }

        System.out.print("------------------------------------------------- SERIALIZADO -------------------------------------------------\n");

        //Salvando de forma serializada em um arquivo dat
        try {

            ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("DadosFinanciamento.dat"));

            for (Financiamento financiamento : financiamentos) {
                oos.writeObject(financiamento.toString());
                oos.flush();
            }

            oos.close(); // fecha arquivo de escrita

            ObjectInputStream ois = new ObjectInputStream (new FileInputStream("DadosFinanciamento.dat"));
            Object obj = null;
            while ((obj = ois.readObject()) != null) {
                    System.out.println(obj.toString());
            }
            ois.close();

        } catch (EOFException ex) { // quando EOF (End Of File) é alçancado
            System.out.println("Fim de arquivo alcançado.");
        }
        catch (Exception e){
            System.out.print("Erro ao salvar arquivo em dat");
        }
    }
}