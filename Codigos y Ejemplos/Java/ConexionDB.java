import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionDB {
    Connection conectar=null;
    String servidor = "127.0.0.1";
    String baseDatos = "baseDeDatos";
    String usuario = "root";
    String password = "";
  
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql:"
                    + "//"+ servidor + "/" + baseDatos, usuario, password);
            return conectar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", 0);
            return null;
       }
    }
} 
