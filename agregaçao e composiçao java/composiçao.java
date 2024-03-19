import java.util.ArrayList;
import java.util.Date;

class Cliente {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String endereco;
    private ArrayList<Pedido> pedidos;

    // Construtor, getters e setters
}

class Pedido {
    private Date dataPedido;
    private ArrayList<String> listaPratos;
    private double valorTotal;

    // Construtor, getters e setters
}

class Mesa {
    private int numeroMesa;
    private int quantidadeLugares;
    private boolean ocupada;

    // Construtor, getters e setters
}