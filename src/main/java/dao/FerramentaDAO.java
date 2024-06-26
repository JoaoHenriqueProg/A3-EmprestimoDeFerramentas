package dao;

import modelo.Ferramenta;
import modelo.SecretsLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FerramentaDAO {
    public ArrayList<Ferramenta> minhaLista = new ArrayList<>();

    public ArrayList<Ferramenta> getMinhaLista() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM TBFerramentas");
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                double preco = res.getDouble("preco");
                int quantidade = res.getInt("quantidade");
                Ferramenta objeto = new Ferramenta(nome, id, preco, quantidade);
                minhaLista.add(objeto);
            }
            res.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return minhaLista;
    }

    public void setMinhaLista(ArrayList<Ferramenta> MinhaLista) {
        minhaLista = MinhaLista;
    }

    //Retorna o maior id de Ferramenta
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM TBFerramentas");
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
            String database = "TBFerramentas";
            String url = "jdbc:mysql://" + server + ":3306/"
                    + database + "?useTimezone=true&serverTimezone=UTC";
            String user = SecretsLoader.getSqlUser();;
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

    public Ferramenta carregaFerramenta(int id) {
        Ferramenta objeto = new Ferramenta();
        objeto.setId(id);
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM TBFerramentas WHERE id = " + id);
            res.next();
            objeto.setNome(res.getString("nome"));
            objeto.setId(res.getInt("id"));
            objeto.setPrecoDeAquisicao(res.getDouble("preco"));
            objeto.setQuantidade(res.getInt("quantidade"));
            stmt.close();
        } catch (SQLException erro) {
            if (erro.getErrorCode() == 0) {
                // acontece quando o programa tenta pegar o id de algum amigo que foi
                // deletdo, nesse caso vai retornar um amigo com mensagem de error nos
                // atributos que der
                return new Ferramenta("[FERRAMENTA DELETADA]", -1, -1, -1);
            }
            
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }

    // Cadastra novo Ferramenta
    public boolean insertFerramentaBD(Ferramenta objeto) {
        String sql = "INSERT INTO TBFerramentas(id,nome,preco,quantidade) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setDouble(3, objeto.getPrecoDeAquisicao());
            stmt.setDouble(4, objeto.getQuantidade());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    // Deleta um Ferramenta específico pelo seu campo ID
    public boolean deleteFerramentaBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM TBFerramentas WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }

    // Edita um Ferramenta específico pelo seu campo ID
    public boolean updateFerramentaBD(Ferramenta objeto) {
        String sql = "UPDATE TBFerramentas set nome = ? ,preco = ?, quantidade = ? WHERE id = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setDouble(2, objeto.getPrecoDeAquisicao());
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
}
