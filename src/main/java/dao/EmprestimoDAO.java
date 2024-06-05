package dao;

import modelo.SecretsLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import modelo.Emprestimo;

public class EmprestimoDAO {
    public ArrayList<Emprestimo> minhaLista = new ArrayList<>();

    public ArrayList<Emprestimo> getMinhaLista() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM TBEmprestimos");
            while (res.next()) {
                int id = res.getInt("id");
                int amigo = res.getInt("amigo");
                int ferramenta = res.getInt("ferramenta");
                int quantidade = res.getInt("quantidade");
                Emprestimo objeto = new Emprestimo(id, amigo, ferramenta, quantidade, new Date()); // TODO: Implementar a data do empréstimo
                minhaLista.add(objeto);
            }
            res.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return minhaLista;
    }

    public void setMinhaLista(ArrayList<Emprestimo> MinhaLista) {
        minhaLista = MinhaLista;
    }

    //Retorna o maior id de Emprestimo
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM TBEmprestimos");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return maiorID;
    }

    public Connection getConexao() {
        Connection connection = null; //instância da conexão
        try {
// Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
// Configurar a conexão
            String server = "localhost";
            String database = "TBEmprestimos";
            String url = "jdbc:mysql://" + server + ":3306/"
                    + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = SecretsLoader.getSqlPassword();
// Conectando..
            connection = DriverManager.getConnection(url, user, password);
// Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return connection;
        } catch (ClassNotFoundException e) { //Driver não encontrado
            System.out.println("O driver nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    public Emprestimo carregaEmprestimo(int id) {
        Emprestimo objeto = new Emprestimo();
        objeto.setId(id);
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM TBEmprestimos WHERE id = " + id);
            res.next();
            objeto.setAmigo(res.getInt("amigo"));
            objeto.setId(res.getInt("id"));
            objeto.setFerramenta(res.getInt("ferramenta"));
            objeto.setQuantidade(res.getInt("quantidade"));
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }

    // Cadastra novo Emprestimo
    public boolean insertEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO TBEmprestimos(id,amigo,ferramenta,quantidade) VALUES(?,?,?,?)"; // TODO: data
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setInt(2, objeto.getAmigo());
            stmt.setInt(3, objeto.getFerramenta());
            stmt.setInt(4, objeto.getQuantidade());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    // Deleta um Emprestimo específico pelo seu campo ID
    public boolean deleteEmprestimoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM TBEmprestimos WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }

    // Edita um Emprestimo específico pelo seu campo ID
    public boolean updateEmprestimoBD(Emprestimo objeto) {
        String sql = "UPDATE TBEmprestimos set amigo = ?, ferramenta = ?, quantidade = ? WHERE id = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getAmigo());
            stmt.setInt(2, objeto.getFerramenta());
            stmt.setInt(3, objeto.getQuantidade());
            stmt.setInt(4, objeto.getId());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public int getQuantidadeFerramentaAlugada(int id) {
        int total = 0;
        
        for (Emprestimo emp : this.getMinhaLista()) {
            if (emp.getFerramenta() == id) {
                total += emp.getQuantidade();
            }
        }
        
        return total;
    }
}
