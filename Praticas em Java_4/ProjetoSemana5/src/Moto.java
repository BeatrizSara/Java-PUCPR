public class Moto extends Veiculo{ // A classe Moto é uma SUBCLASSE da Classe Veículo
    // Caminhao e Moto sao especializações de Veiculo.
    // Invertendo - Veiculo é uma generalização de Caminhao e Moto e outros tipos.

    // Atributos
    private int cilindradas;

    // Construtor
    public Moto(String marcaDaMoto,String motorDaMoto, int cilindradas){
        super(marcaDaMoto, motorDaMoto);
        this.marca = marcaDaMoto;
        this.cilindradas = cilindradas;
    }

    // Metodos
    public int getCilindradas(){ return this.cilindradas;}
}
