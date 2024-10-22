package modelo;

public class Terreno extends Financiamento {
    private String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    @Override
    public double calcularPagamentoMensal() {
        // Calcula o pagamento mensal básico usando o método da superclasse
        double pagamentoMensal = super.valorImovel / (super.prazoFinanciamento * 12) * (1 + (super.taxaJurosAnual / 12));
        // Adiciona 2% ao valor da parcela devido ao risco
        return pagamentoMensal * 1.02; // Adiciona 2% ao valor da parcela
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
        sb.append(this.getTipoZona()).append(";");
        return sb.toString();
    }


}
