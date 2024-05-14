package Model;

public class Amigo {
    private String nome;
    private String endereco;
    private String telefone;
    private int id;
    public Amigo() {
        this("", "", "", 0);
    }

    public Amigo(String nome, String endereco, String telefone, int id) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTelefone() {
        return telefone;
    }
// commit teste
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
