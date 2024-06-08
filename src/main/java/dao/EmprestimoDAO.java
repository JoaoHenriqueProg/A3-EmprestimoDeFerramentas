package dao;

import modelo.SecretsLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Types.DATE;
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
                Date dataInicio = res.getDate("data_inicio");
                Date dataFinal = res.getDate("data_final");
                Emprestimo objeto = new Emprestimo(id, amigo, ferramenta, quantidade, dataInicio, dataFinal); // TODO: Implementar a data do empréstimo
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
        String sql = "UPDATE TBEmprestimos set amigo = ?, ferramenta = ?, quantidade = ?, data_final = ? WHERE id = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getAmigo());
            stmt.setInt(2, objeto.getFerramenta());
            stmt.setInt(3, objeto.getQuantidade());
            if (objeto.getDataDevolucao() == null) {
                stmt.setNull(4, DATE);
            } else {
                stmt.setDate(4, new java.sql.Date(objeto.getDataDevolucao().getTime()));
            }
            // https://stackoverflow.com/questions/21575253/classcastexception-java-util-date-cannot-be-cast-to-java-sql-date
            stmt.setInt(5, objeto.getId());
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

    /**
     *
     * @param idAmigo
     * @return
     */
    public ArrayList<Integer> getFerramentasAlugadasPorAmigo(int idAmigo) {
        ArrayList<Integer> ferramentas = new ArrayList<Integer>();
        for (Emprestimo emp : getMinhaLista()) {
            if (emp.getAmigo() == idAmigo && emp.getQuantidade() > 0) {
                if (ferramentas.indexOf(emp.getFerramenta()) == -1) {
                    // ferramentas.indexOf(emp.getFerramenta()) = -1 quer dizer que ainda não está adicionado na lista
                    ferramentas.add(emp.getFerramenta());
                }
            }
        }
        return ferramentas;
    }

    public int getQuantidadeClienteAlugouDeFerramenta(int idAmg, int idFer) {
        int total = 0;
        for (Emprestimo emp : getMinhaLista()) {
            if (emp.getAmigo() == idAmg && emp.getFerramenta() == idFer) {
                total += emp.getQuantidade();
            }
        }
        return total;
    }

    public void devolverEmprestimos(int idAmg, int idFer, int praDevolver) {
        for (Emprestimo emp : getMinhaLista()) {
            // se o emprestimor do amigo com essa ferramenta e ainda estiver aberto
            if (emp.getAmigo() == idAmg && emp.getFerramenta() == idFer && emp.getQuantidade() > 0) {
                emp.setQuantidade(emp.getQuantidade() - praDevolver);
                if (emp.getQuantidade() <= 0) {
                    praDevolver = -emp.getQuantidade(); // magia negra matematica to com sono pede pra eu elaborar de manha
                    emp.setQuantidade(0);
                    emp.setDataDevolucao(new Date());
                    this.updateEmprestimoBD(emp);
                } else {
                    this.updateEmprestimoBD(emp);
                    return;
                }
            }
        }
    }

    public ArrayList<Integer[]> getAmigosPorAlugueis() {
        ArrayList<Integer[]> amigosEmprestimos = new ArrayList<Integer[]>();
        String sql = "SELECT amigo, COUNT(id) AS quantidade_emprestimos FROM TBEmprestimos GROUP BY  amigo ORDER BY quantidade_emprestimos DESC"; // TODO: data
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                amigosEmprestimos.add(new Integer[] {
                    res.getInt("amigo"),
                    res.getInt("quantidade_emprestimos")
                });
            }
            stmt.close();
            // https://stackoverflow.com/questions/2832472/how-to-return-2-values-from-a-java-method
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
        return amigosEmprestimos;
    }
}
