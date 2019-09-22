package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSTableMetro;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author gudiel
 */
public class consultas extends conexionDB {

    Connection conexion;
    String sql;
    DefaultTableModel modelo;
    Icon iconoError = new ImageIcon(getClass().getResource("/images/icons8-error-64.png"));
    Icon iconoCorrecto = new ImageIcon(getClass().getResource("/images/icons8-de-acuerdo-64.png"));
    Icon iconoQuestion = new ImageIcon(getClass().getResource("/images/icons8-ayuda-64.png"));
    //Icon iconoEliminado = new ImageIcon(getClass().getResource("/images/icons8-eliminar-32.png"));

    public void probarConexion(){
        conexion = Conectar();
        conexion = Desconectar();
    }
    
    public void MostrarRegistros(RSTableMetro tablaRegistros) {
        modelo = (DefaultTableModel) tablaRegistros.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        String[] datos = new String[12];
        sql = "SELECT * FROM boletas.boleta WHERE fechaRegistro = CURRENT_DATE()";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();

            while (rst.next()) {
                datos[0] = rst.getString(1);
                datos[1] = rst.getString(2);
                datos[2] = rst.getString(3);
                datos[3] = rst.getString(4);
                datos[4] = rst.getString(5);
                datos[5] = rst.getString(6);
                datos[6] = rst.getString(7);
                datos[7] = rst.getString(8);
                datos[8] = rst.getString(9);
                datos[9] = rst.getString(10);
                datos[10] = rst.getString(11);
                datos[11] = rst.getString(12);

                modelo.addRow(datos);
            }

            conexion = Desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
    }

    public void BuscarRegistros(RSTableMetro tablaRegistros, String fechaIni, String fechaFin) {
        modelo = (DefaultTableModel) tablaRegistros.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        String[] datos = new String[12];
        
        sql = "SELECT * from boletas.boleta WHERE fechaRegistro BETWEEN '" + fechaIni + "' AND '" + fechaFin + "'";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();

            while (rst.next()) {
                datos[0] = rst.getString(1);
                datos[1] = rst.getString(2);
                datos[2] = rst.getString(3);
                datos[3] = rst.getString(4);
                datos[4] = rst.getString(5);
                datos[5] = rst.getString(6);
                datos[6] = rst.getString(7);
                datos[7] = rst.getString(8);
                datos[8] = rst.getString(9);
                datos[9] = rst.getString(10);
                datos[10] = rst.getString(11);
                datos[11] = rst.getString(12);

                modelo.addRow(datos);
            }

            conexion = Desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
    }
    
    public void BuscarPorBoleta(RSTableMetro tablaRegistros, String boleta) {
        modelo = (DefaultTableModel) tablaRegistros.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        String[] datos = new String[12];
        
        sql = "SELECT * FROM boleta WHERE boleta = '" + boleta + "'";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();

            while (rst.next()) {
                datos[0] = rst.getString(1);
                datos[1] = rst.getString(2);
                datos[2] = rst.getString(3);
                datos[3] = rst.getString(4);
                datos[4] = rst.getString(5);
                datos[5] = rst.getString(6);
                datos[6] = rst.getString(7);
                datos[7] = rst.getString(8);
                datos[8] = rst.getString(9);
                datos[9] = rst.getString(10);
                datos[10] = rst.getString(11);
                datos[11] = rst.getString(12);

                modelo.addRow(datos);
            }

            conexion = Desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
    }

    public void GuardarCliente(modeloRegistro modelo) {

        sql = "INSERT into boletas.boleta (`fechaRegistro`,`boleta`,`banco`,`valor`,`factura`,`cliente`,`telefono`,`fechaUso`,`hora`,`atendio`,`estado`) VALUES (CURRENT_TIME(),?,?,?,?,?,?,?,?,?,?)";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);

            pst.setString(1, modelo.getBoleta());
            pst.setString(2, modelo.getBanco());
            pst.setFloat(3, modelo.getValor());
            pst.setInt(4, modelo.getFactura());
            pst.setString(5, modelo.getCliente());
            pst.setInt(6, modelo.getTelefono());
            pst.setString(7, modelo.getFechaUso());
            pst.setString(8, modelo.getHora());
            pst.setString(9, modelo.getAtendio());
            pst.setString(10, modelo.getEstado());

            int n = pst.executeUpdate();

            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Guardado Correctamente", "Exito", JOptionPane.OK_OPTION, iconoCorrecto);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar", "Error", JOptionPane.ERROR_MESSAGE, iconoError);
            }

            conexion = Desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
    }

    public void BorrarRegistro(String codigo) {

        sql = "DELETE FROM boletas.boleta WHERE codigo = " + codigo + "";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);

            int n = pst.executeUpdate();

            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Registro eliminado!", "Éxito", JOptionPane.OK_OPTION, iconoCorrecto);
            }
            
            conexion = Desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
    }

    public void ConfirmarBoleta(String codigo) {

        sql = "UPDATE boletas.boleta SET estado = 'CONFIRMADA' WHERE codigo = " + codigo + "";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);

            int n = pst.executeUpdate();

            if (n == 1) {
                
                JOptionPane.showMessageDialog(null, "Depósito Confirmado!", "Éxito", JOptionPane.OK_OPTION, iconoCorrecto);
            }
            conexion = Desconectar();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al confirmar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
    }

    public void ModificarRegistro(modeloRegistro modelo, Integer codigo) {

        sql = "UPDATE boletas.boleta set banco = ?, valor = ?, factura = ?, cliente = ?, telefono = ?, fechaUso = ?, hora = ?, atendio= ? WHERE codigo = ?";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);

            pst.setString(1, modelo.getBanco());
            pst.setFloat(2, modelo.getValor());
            pst.setInt(3, modelo.getFactura());
            pst.setString(4, modelo.getCliente());
            pst.setInt(5, modelo.getTelefono());
            pst.setString(6, modelo.getFechaUso());
            pst.setString(7, modelo.getHora());
            pst.setString(8, modelo.getAtendio());
            pst.setInt(9, codigo);

            int n = pst.executeUpdate();

            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Correctamente", "Exito", JOptionPane.OK_OPTION, iconoCorrecto);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar", "Error", JOptionPane.ERROR_MESSAGE, iconoError);
            }

            conexion = Desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
    }
    
    public void ModificarNumBoleta(modeloRegistro modelo, Integer codigo) {

        sql = "UPDATE boletas.boleta set boleta = ? WHERE codigo = ?";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);

            pst.setString(1, modelo.getBoleta());
            pst.setInt(2, codigo);

            int n = pst.executeUpdate();

            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Correctamente", "Exito", JOptionPane.OK_OPTION, iconoCorrecto);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar", "Error", JOptionPane.ERROR_MESSAGE, iconoError);
            }

            conexion = Desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
    }

    public String Estado(String codigo) {

        String estado = null;

        sql = "SELECT estado FROM boleta WHERE codigo = '" + codigo + "'";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();

            while(rst.next()){
                estado = rst.getString(1);
            }
            
            conexion = Desconectar();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al confirmar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
        return estado;
    }
    
    public String Boleta(String newBoleta) {

        String boleta = null;

        sql = "SELECT boleta FROM boleta WHERE boleta = '"+newBoleta+"'";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();

            while(rst.next()){
                boleta = rst.getString(1);
            }
            
            conexion = Desconectar();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al confirmar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
        return boleta;

    }
    
    public String password(String contra) {

        String pass = null;

        sql = "SELECT password FROM contrasena WHERE password = '"+contra+"'";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();

            while(rst.next()){
                pass = rst.getString(1);
            }
            
            conexion = Desconectar();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al confirmar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
        return pass;
    }
}
