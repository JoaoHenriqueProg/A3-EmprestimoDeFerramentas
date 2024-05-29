package modelo;

public class Emprestimo {
    private int id;
    private int amigo;
    private int ferramenta;

    public Emprestimo(){
        this(0,0,0);
    }
    
    public Emprestimo(int id, int amigo, int ferramenta) {
        this.id = id;
        this.amigo = amigo;
        this.ferramenta = ferramenta;
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


   
    
    
}



