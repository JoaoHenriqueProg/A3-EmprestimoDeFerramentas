package modelo;

public class Ferramenta {
    private String nome;
    private int id;
    private double precoDeAquisicao;
    private int quantidade;

    public Ferramenta() {
        this("", 0, 0, 0);
    }

    // commit teste 234
    public Ferramenta(String nome, int id, double precoDeAquisicao, int quantidade) {
        this.nome = nome;
        this.id = id;
        this.precoDeAquisicao = precoDeAquisicao;
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

    public double getPrecoDeAquisicao() {
        return precoDeAquisicao;
    }

    public void setPrecoDeAquisicao(double precoDeAquisicao) {
        this.precoDeAquisicao = precoDeAquisicao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
