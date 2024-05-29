package modelo;

public class Ferramenta {
    private String nome;
    private int id;
    private double preco_de_aquisicao;
    private int quantidade;

    public Ferramenta() {
        this("", 0, 0, 0);
    }

    // commit teste 234
    public Ferramenta(String nome, int id, double preco_de_aquisicao, int quantidade) {
        this.nome = nome;
        this.id = id;
        this.preco_de_aquisicao = preco_de_aquisicao;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco_de_aquisicao() {
        return preco_de_aquisicao;
    }

    public void setPreco_de_aquisicao(double preco_de_aquisicao) {
        this.preco_de_aquisicao = preco_de_aquisicao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
