package modelo;

public abstract class Financiamento {
    // Atributos
    protected double valorImovel; // Valor do imóvel
    protected int prazoFinanciamento; // Prazo do financiamento em anos
    protected double taxaJurosAnual; // Taxa de juros anual

    // Métodos getters
    public double getValorImovel(){
        return this.valorImovel;
    }

    public int getPrazoFinanciamento() {
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    // Construtor
    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual){
        this.valorImovel = valorDesejadoImovel; // Taxa de juros anual
        this.prazoFinanciamento = prazoFinanciamentoAnos; // Inicializa o prazo do financiamento
        this.taxaJurosAnual = taxaJurosAnual; // Inicializa o prazo do financiamento
    }

    // Métodos:
    // * Para mostrar informações do financiamento
    public void mostrarFinanciamento(){
        System.out.println("O valor do imóvel: R$ " + String.format("%.2f", this.valorImovel));
        System.out.println("O valor total do Financiamento: R$ " + String.format("%.2f", this.calcularTotalPagamento()));
    }

    // * Para  calcular o pagamento mensal
    public double calcularPagamentoMensal() {
        double jurosMensais = calcularJurosMensais();
        return (this.valorImovel / (this.prazoFinanciamento * 12)) + jurosMensais;
    }

    public double calcularJurosMensais() {
        return this.valorImovel * (this.taxaJurosAnual / 12 / 100);
    }

    // * Para calcular o total do  pagamento
    public double calcularTotalPagamento(){
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    @Override
    public String toString() { // montando uma String com os dados do Financiamento
        StringBuilder sb  = new StringBuilder();
        sb.append(this.getValorImovel()).append(";");
        sb.append(this.getPrazoFinanciamento()).append(";");
        sb.append(this.getTaxaJurosAnual()).append(";");
        return sb.toString();
    }
}