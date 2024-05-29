package modelo;
import java.util.Date;

public class Emprestimo {
    private int id;
    private int amigo;
    private int ferramenta;
    private Date dataEmprestimo;

    
    public Emprestimo(int id, int amigo, int ferramenta, Date dataEmprestimo) {
        this.id = id;
        this.amigo = amigo;
        this.ferramenta = ferramenta;
        this.dataEmprestimo = dataEmprestimo;
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
    
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }


   
    
    
}



