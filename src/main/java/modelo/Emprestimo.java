package modelo;

import java.util.Date;

public class Emprestimo {

    private int id;
    private int amigo;
    private int ferramenta;
    private int quantidade;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo() {
        this(0, 0, 0, 0, new Date(), new Date());
    }

    public Emprestimo(int id, int amigo, int ferramenta, int quantidade, Date dataEmprestimo, Date dataDevolucao) {
        this.id = id;
        this.amigo = amigo;
        this.ferramenta = ferramenta;
        this.quantidade = quantidade;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmigo() {
        return amigo;
    }

    public void setAmigo(int amigo) {
        this.amigo = amigo;
    }

    public int getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(int ferramenta) {
        this.ferramenta = ferramenta;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}
