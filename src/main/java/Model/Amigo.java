package Model;

public class Amigo {
    private String nome;
    private String endereco;
    private String cpf;
    private int id;

    public Amigo() {
        this("", "", "", 0);
    }

    public Amigo(String nome, String endereco, String cpf, int id) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
