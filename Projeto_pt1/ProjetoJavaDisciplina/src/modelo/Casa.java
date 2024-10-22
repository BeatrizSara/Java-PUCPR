package modelo;

import util.AcrescimoMaiorDoQueJurosException;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, int prazoFinanciamentoAnos, double taxaJurosAnual,  double areaConstruida, double tamanhoTerreno) {
        super(valorImovel, prazoFinanciamentoAnos, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    public  double getAreaConstruida(){
        return areaConstruida;
    }

    public double getTamanhoTerreno(){
        return tamanhoTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        double juros = super.calcularJurosMensais();
        double acrescimo = 80;

        try {
            validarAcrescimoMaiorQueJuros(acrescimo, juros);
        } catch (AcrescimoMaiorDoQueJurosException acrescimoMaiorDoQueJurosException)  {
            acrescimo = juros;
        }

        return super.calcularPagamentoMensal() + acrescimo; // adiciona o valor do seguro obrigatório
    }

    @Override
    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * super.prazoFinanciamento * 12;
    }

    private void validarAcrescimoMaiorQueJuros(double acrescimo, double juros) throws AcrescimoMaiorDoQueJurosException {
        if (acrescimo > juros){
            throw new AcrescimoMaiorDoQueJurosException("O valor do acrescimo é maior que o valor do juros");
        }
    }

    @Override
    public String toString(){ // para fazer concatenacao, juntar informacoes dentro de uma unica string
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(this.getAreaConstruida()).append(";");
        sb.append(this.getTamanhoTerreno()).append(";");
        return sb.toString();
    }
}