package principal;
import modelo.SecretsLoader;
import telas.JFLogin;

public class Main {
    public static void main(String[] args) {
            SecretsLoader.loadProperties();
        
            JFLogin objetotela = new JFLogin(); 
            objetotela.setLocationRelativeTo(null);
            objetotela.setVisible(true);
    }
}
