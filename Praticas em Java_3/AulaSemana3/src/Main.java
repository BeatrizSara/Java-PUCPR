import usuarios.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario primeiroUsuario = new Usuario("Fulano");
        primeiroUsuario.mostrarPostagens();

        primeiroUsuario.criarPostagem();
        primeiroUsuario.mostrarPostagens();
    }
}