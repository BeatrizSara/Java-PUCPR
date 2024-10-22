public class Veiculo { // É uma "SUPER CLASSE" de Caminhao e Moto.
    // Atributos
    protected String marca; // Esse ATRIBUTO é especifico do Veiculo e de todas as classes que possam herdar dele
    protected String motor;

    // Construtor
    public  Veiculo(String marcaDoVeiculo, String motorDoVeiculo){
        this.marca = marcaDoVeiculo;
        this.motor = motorDoVeiculo;
    }

    // Metodos
    public String getMarca(){
        return marca; // marca: "Volvo"
    }
    public String getMotor(){
        return motor;
    }
}
