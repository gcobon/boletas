package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.IconUIResource;
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
    Icon iconoError = new ImageIcon(getClass().getResource("/images/icons8-error-32.png"));
    Icon iconoCorrecto = new ImageIcon(getClass().getResource("/images/icons8-marca-de-verificación-32.png"));
    Icon iconoQuestion = new ImageIcon(getClass().getResource("/images/icons8-pregunta-32.png"));
    Icon iconoEliminado = new ImageIcon(getClass().getResource("/images/icons8-eliminar-32.png"));
    

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
            JOptionPane.showMessageDialog(null, "Error al mostrar " + e , "Error", JOptionPane.ERROR_MESSAGE, iconoError);
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
            JOptionPane.showMessageDialog(null, "Error al mostrar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
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
                JOptionPane.showMessageDialog(null, "Registro eliminado!", "Éxito", JOptionPane.OK_OPTION, iconoEliminado);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
    }

    public void ConfirmarBoleta(RSTableMetro tabla, String codigo) {

        sql = "UPDATE boletas.boleta SET estado = 'CONFIRMADA' WHERE codigo = " + codigo + "";

        try {
            conexion = Conectar();
            PreparedStatement pst = conexion.prepareStatement(sql);

            int n = pst.executeUpdate();

            if (n == 1) {
                Icon icono = new ImageIcon(getClass().getResource("/images/icons8-marca-de-verificación-32.png"));
                JOptionPane.showMessageDialog(null, "Boleta Confirmada!", "Éxito", JOptionPane.OK_OPTION, icono);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al confirmar " + e, "Error", JOptionPane.ERROR_MESSAGE, iconoError);
        }
    }
}
