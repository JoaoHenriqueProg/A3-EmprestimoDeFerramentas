package Model;

public class Ferramenta {
    private String nome;
    private int id;
    private double preco_de_aquisicao;

    public Ferramenta() {
        this("", 0, 0);
    }

    // commit teste 23
    public Ferramenta(String nome, int id, double preco_de_aquisicao) {
        this.nome = nome;
        this.id = id;
        this.preco_de_aquisicao = preco_de_aquisicao;
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
}
