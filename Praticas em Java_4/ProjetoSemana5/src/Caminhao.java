public class Caminhao extends Veiculo{ //  A classe Caminhao é uma SUBCLASSE da Classe Veículo
    // Caminhao e Moto sao especializações de Veiculo.

    // Atributos
    private  int numeroEixos;
    private int capacidadeEmToneladas;

    // Construtor
    public Caminhao(String marcaDoCaminhao, String motorDoCaminhao, int numEixosCaminhao, int capacidadeToneladas){
        super(marcaDoCaminhao, motorDoCaminhao); // Chame o construtor do Veículo
        this.marca = marcaDoCaminhao;
        this.numeroEixos = numEixosCaminhao;
        this.capacidadeEmToneladas = capacidadeToneladas;
    }

    // Metodos
    public  int getNumeroEixos(){
        return this.numeroEixos;
    }

    public int getCapacidadeEmToneladas(){
        return this.capacidadeEmToneladas;
    }

}
