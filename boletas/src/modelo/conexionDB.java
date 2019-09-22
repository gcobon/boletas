package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gudiel
 */
public class conexionDB {

    private Connection con; //variable de tipo sql.Connection que recibe la conexion.

    private final String url = "jdbc:mysql://192.168.1.10:3306/boletas";// variable constante que guarda la url de la conexion.

    public Connection Conectar() {
        try {
//            Class.forName("com.mysql.jdbc.Driver");// 
            DriverManager.setLoginTimeout(1);
            this.con = DriverManager.getConnection(this.url, "root", "40031412");//hace la conexion con la url, usuario y password de la base de datos
            int x = DriverManager.getLoginTimeout();
            System.out.println(this.con + " conectado " + x);

        } catch (SQLException e) {
            System.out.println("Error de conexion: " + this.con + " -- " + e); //imprime en consola si existe algun error de conexion
            if(this.con==null){
                JOptionPane.showMessageDialog(null, "Error de conexión"+"\n\n"+"No se ha podido conectar con el servidor."+"\n"
                        +"Compruebe la dirección IP del servidor y vuelva a intentarlo.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
        return this.con;
    }

    public Connection Desconectar() {
        try {
            this.con.close();//cierra la conexion
            System.out.println("Conexion cerrada: " + this.con);//imprime en consola
        } catch (SQLException e) {
            System.out.println("error al cerrar conexion: " + this.con + " -- " + e);//imprime en consola si existe error al cerrar conexion
        }
        return this.con;
    }

}
