
package unigrupo94.AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "uni94";
    private static final String USUARIO = "root";
    private static final String PASSWORD = ""; 
    private static Connection connection ; 
    
    private Conexion () {}
    
    public static Connection getConexion (){
    
        if (connection == null){
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD); 
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, " Error al cargar los driver ");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, " Error al conectarse a la BD");
            }
        }
        
        return connection ; 
    }
}
