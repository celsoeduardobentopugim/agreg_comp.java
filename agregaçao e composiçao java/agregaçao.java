import java.util.ArrayList;
import java.util.Date;

class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Date dataNascimento;
    private ArrayList<Postagem> postagens;

    // Construtor, getters e setters
}

class Postagem {
    private String texto;
    private Date dataPostagem;
    private int curtidas;
    private ArrayList<String> comentarios;

    // Construtor, getters e setters
}