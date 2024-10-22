public class Retangulo {
    // atributos
    float altura;

    float comprimento;

    // métodos

    // Construtor - nele se informa a altura e o comprimento inicial
    Retangulo (float alturaInicial, float comprimentoInicial){
        this.altura = alturaInicial;
        this.comprimento = comprimentoInicial;

    }
    // calcular perimetro
    float  calcularPerimetro(){
        float perimetro = ( 2 * altura) + (2 * comprimento);
        return perimetro;
    }

    // calcular area
    float calularArea(){
        float area = altura * comprimento;
        return area;
    }

    // ponto de partida do nosso codigo
    // sempre precisa ter um:
    public static void main(String[] args){
        System.out.println("Bem vindo ao mundo");

        Retangulo ret1 = new Retangulo(5.2f, 12.5f); // new serve para instanciar memoria para que esse objeto ret1 exista dentro da classe Retangulo

        System.out.println(ret1.calcularPerimetro()); // vai calcular o perimetro e mostrar aquela informacao na tela

        Retangulo ret2 = new Retangulo(10.3f, 4.1f);
        System.out.println(ret2.calcularPerimetro());

    }
}
