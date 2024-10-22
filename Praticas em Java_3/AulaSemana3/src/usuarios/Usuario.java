package usuarios;

import postagens.Postagem;

import java.util.ArrayList;
import java.util.List;

public class Usuario{
    // Atributos
    public String nome;

    // Usuario cria Postagens. Postagens feitas por Usuario.
    // associação: LIGAÇÃO/CONEXÃO entre classes.
    // agregação: Usuario TEM VARIAS postagens.
    // composicao (agregação nível 2):  Postagem PERTENCE a um Usuário
    //                                  Postegem NÃO PODE EXISTIR sem um Usuario
    // Tem casos que tem uma agregação e uma associacao

    private List<Postagem> listaPostagens;

    // Usuario possui um usuarioFavorito. usuarioFavorito é o preferido do Usuário
    // associacao: LIGAÇÃOCONEXÃO entre classes.
    // agragação: Usuario TEM UM usuario favorito.
    // NÃO É UMA COMPOSIÇÃO: UsuarioFavorito EXISTE SEM O Usuario.
    // Tem casos que tem agregação e sem um assosiacao
    private Usuario usuarioFavorito;


    public String getNome(){
        return this.nome;
    }

    public List<Postagem> getListaPostagens(){
        return this.listaPostagens;
    }

    // Construtor
    public Usuario(String nomeDoUsuario) {
        this.nome = nomeDoUsuario;
        this.listaPostagens = new ArrayList<Postagem>();
    }
    // Demais métodos
    public boolean criarPostagem(){ // é um método para o usuario riar postagens, clicar em um botao de add ou nao uma postagem.  False se nao foi, caso algo esteja fora dos padroes da plataforma
        listaPostagens.add(new Postagem());
        return true;
    }

    public void mostrarPostagens(){

        if(listaPostagens.isEmpty()){
            System.out.println("Lista de postagens vazia!");
            return;
        }

        for(Postagem postagem: listaPostagens){
            // postagem.curtidas = 100000000;
            postagem.setCurtidas(100000000);
            postagem.mostrarCurtidas();
        }

    }

    // metodo para curtir postagens
    // void - utilizado em casos que nao vamos ou precisamos retornar nenhuma informacao
    public void curtirPostagem(Postagem postagemAleatoria){ // O Java precisa saber qual o post que foi curtido, por isso foi criado postagemAleatoria
        System.out.println("Usuário curtiu a postagem."); // qual que seria o objeto dessa minha operacao
        postagemAleatoria.adicionarCurtida();
        postagemAleatoria.mostrarCurtidas();
    }

}