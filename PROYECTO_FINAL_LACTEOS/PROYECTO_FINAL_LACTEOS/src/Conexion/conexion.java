
package Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    Connection conectar=null;
    // Método para establecer la conexión con la base de datos
    public Connection conectar(){
        try{
            // Cargar el controlador JDBC para MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión con la base de datos
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","1234");
            // Mostrar mensaje de conexión exitosa
            JOptionPane.showMessageDialog(null, "Conexión exitosa", "Conexión", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
             // Mostrar mensaje de error en caso de no poder establecer la conexión
            JOptionPane.showMessageDialog(null, "Sin conexión" +e, "Conexión", JOptionPane.ERROR_MESSAGE);
            
        }
        return conectar;
    }
    // Método para obtener la conexión
    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

