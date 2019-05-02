package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSTableMetro;

/**
 *
 * @author gudiel
 */
public class consultas extends conexionDB {

    Connection conexion;
    String sql;
    DefaultTableModel modelo;

    public void MostrarRegistros(RSTableMetro tablaRegistros) {
        modelo = (DefaultTableModel) tablaRegistros.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        String[] datos = new String[12];
        sql = "SELECT * FROM boleta";

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
            JOptionPane.showMessageDialog(null, "Error al mostrar " + e);
        }
    }

    public void BuscarRegistros(RSTableMetro tablaRegistros, String fechaIni, String fechaFin) {
        modelo = (DefaultTableModel) tablaRegistros.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        String[] datos = new String[12];
        sql = "SELECT * from boletas.boleta WHERE fechaRegistro BETWEEN '"+fechaIni+"' AND '"+fechaFin+"'";

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
            JOptionPane.showMessageDialog(null, "Error al mostrar " + e);
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
                JOptionPane.showMessageDialog(null, "Guardado Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar", "Error", JOptionPane.ERROR_MESSAGE);
            }

            conexion = Desconectar();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
