
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author gudiel
 */
public class conexionDB {
    
    private Connection con;
    private final String url = "jdbc:mysql://localhost:3306/boletas";
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","40031412");
            System.out.println(con + " conectado");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error de conexion: " + con );
        }
        return con;
    }
    
    
}
