package modelo;

import java.io.Serializable;

public class Apartamento extends Financiamento implements Serializable {
    private int vagasGaragem;
    private int numeroAndar;



    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int vagasGaragem, int numeroAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.vagasGaragem = vagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = getTaxaJurosAnual() / 12 / 100; // Taxa mensal de juros
        int meses = getPrazoFinanciamento() * 12; // Total de meses do financiamento
        // Calcula o pagamento mensal usando a fórmula PRICE
        return (this.valorImovel * Math.pow((1 + taxaMensal), meses)) / (Math.pow((1 + taxaMensal), meses) - 1);
        // math.pow é a forma de exponenciação em Java
    }

    @Override
    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * super.prazoFinanciamento * 12;
    }

    @Override
    public String toString(){ // para fazer concatenacao, juntar informacoes dentro de uma unica string
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(this.getNumeroAndar()).append(";");
        sb.append(this.getVagasGaragem()).append(";");
        return sb.toString();
    }
}