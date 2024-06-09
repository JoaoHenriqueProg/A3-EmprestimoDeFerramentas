package dao;

import modelo.SecretsLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Amigo;

public class AmigoDAO {
    public ArrayList<Amigo> minhaLista = new ArrayList<>();

    public ArrayList<Amigo> getMinhaLista() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM TBAmigos");
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String endereco = res.getString("endereco");
                String telefone = res.getString("numero");
                Amigo objeto = new Amigo(nome, endereco, telefone, id);
                minhaLista.add(objeto);
            }
            res.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return minhaLista;
    }

    public void setMinhaLista(ArrayList<Amigo> MinhaLista) {
        minhaLista = MinhaLista;
    }

    //Retorna o maior id de Amigo
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM TBAmigos");
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
            String database = "TBAmigos";
            String url = "jdbc:mysql://" + server + ":3306/"
                    + database + "?useTimezone=true&serverTimezone=UTC";
            String user = SecretsLoader.getSqlUser();
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

    public Amigo carregaAmigo(int id) {
        Amigo objeto = new Amigo();
        objeto.setId(id);
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM TBAmigos WHERE id = " + id);
            res.next();
            objeto.setNome(res.getString("nome"));
            objeto.setEndereco(res.getString("endereco"));
            objeto.setTelefone(res.getString("numero"));
            objeto.setId(res.getInt("id"));
            stmt.close();
        } catch (SQLException erro) {
            if (erro.getErrorCode() == 0) {
                // acontece quando o programa tenta pegar o id de algum amigo que foi
                // deletdo, nesse caso vai retornar um amigo com mensagem de error nos
                // atributos que der
                return new Amigo("[AMIGO DELETADO]", "[AMIGO DELETADO]", "[AMIGO DELETADO]", -1);
            }
            
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }

    // Cadastra novo Amigo
    public boolean insertAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO TBAmigos(id,nome,endereco,numero) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getEndereco());
            stmt.setString(4, objeto.getTelefone());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    // Deleta um Amigo específico pelo seu campo ID
    public boolean deleteAmigoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM TBAmigos WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }

    // Edita um Amigo específico pelo seu campo ID
    public boolean updateAmigoBD(Amigo objeto) {
        String sql = "UPDATE TBAmigos set nome = ? ,endereco = ?, numero = ? WHERE id = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getEndereco());
            stmt.setString(3, objeto.getTelefone());
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
