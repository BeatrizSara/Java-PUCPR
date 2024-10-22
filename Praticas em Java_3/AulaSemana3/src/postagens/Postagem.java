package postagens;

public class Postagem {
    // Atributo
    private int curtidas;

    public int getCurtidas() {
            return this.curtidas;
    }

    public void setCurtidas(int novaQuantidadeCurtidas){ // void  e nao int - pois o  interesse é em set as curtidas, sem interesse no que vem depois
               this.curtidas = Postagem.validarNumeroCurtidas(novaQuantidadeCurtidas);
    }

    // Construtor
    public Postagem(){
        this.curtidas = 0; // Valor que vai iniciar a contagem de curtidas
    }


    // Métodos
    public void mostrarCurtidas(){
        System.out.println("Total de curtidas: " + curtidas);
    }

    public void adicionarCurtida() { // É basicamente para incrementar um contador de curtidas, 8 + 1 = 9 + 1 + 10 etc
        curtidas += 1;
    }

    // esse static garante que esta logica é independente de cada objeto e sim algo especifico de cada classe
    private static int validarNumeroCurtidas(int quantidadeParaValidar){ // nao faz sentido ter numero negativo de curtidas, entao tem ou 0 ou + de curtidas
        if (quantidadeParaValidar < 0) { // Se a quantidadeParaValidar retornar menor que 0 entao sera False
            System.out.println("Número de curtidas inválido! Não pode ser negativo.");
            return 0;
        }
        return quantidadeParaValidar;
    }

}