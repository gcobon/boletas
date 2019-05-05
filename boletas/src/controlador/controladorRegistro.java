package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.consultas;
import modelo.modeloRegistro;
import vista.principal;

/**
 *
 * @author gudiel
 */
public class controladorRegistro implements ActionListener {

    private final principal vista;
    private final modeloRegistro modelo;
    private final consultas consulta;
    private Integer codigoMoficar;
    Icon iconoQuestion = new ImageIcon(getClass().getResource("/images/icons8-pregunta-32.png"));
    Icon iconoError = new ImageIcon(getClass().getResource("/images/icons8-error-32.png"));
    Icon iconoInfo = new ImageIcon(getClass().getResource("/images/icons8-acerca-de-32.png"));

    public controladorRegistro(principal vista, modeloRegistro modelo, consultas consultas) {
        this.vista = vista;
        this.modelo = modelo;
        this.consulta = consultas;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.menuEliminar.addActionListener(this);
        this.vista.menuConfirmar.addActionListener(this);
        this.vista.txtFactura.addActionListener(this);
        this.vista.menuModificar.addActionListener(this);
    }

    public void Iniciar() {
        vista.setVisible(true);
        vista.cbxBanco.requestFocus();
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vista.btnGuardar == e.getSource()) {
            if (vista.btnGuardar.getText().equals("GUARDAR")) {
                if (vista.cbxBanco.getSelectedIndex() == 0 || vista.txtValor.getText().equals("") || vista.txtBoleta.getText().equals("") || vista.txtCliente.getText().equals("")
                        || vista.txtTelefono.getText().equals("") || vista.fechaUso.getDatoFecha() == null || vista.txtHora.getText().equals("") || vista.txtAtendio.getText().equals("")
                        || vista.txtFactura.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Atención", JOptionPane.INFORMATION_MESSAGE, iconoInfo);
                } else {
                    modelo.setBanco((String) vista.cbxBanco.getSelectedItem());
                    modelo.setAtendio(vista.txtAtendio.getText().trim());
                    modelo.setBoleta(vista.txtBoleta.getText().trim());
                    modelo.setCliente(vista.txtCliente.getText().trim());
                    modelo.setEstado("SIN CONFIRMAR");
                    modelo.setFactura(Integer.valueOf(vista.txtFactura.getText().trim()));

                    Date date = vista.fechaUso.getDatoFecha(); //se obtiene la fecha ingresada en la vista
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//se le da formato a la fecha ingresada
                    String fecha = sdf.format(date);// se convierte a estring la fecha ingresada

                    modelo.setFechaUso(fecha);
                    modelo.setHora(vista.txtHora.getText());
                    modelo.setTelefono(Integer.valueOf(vista.txtTelefono.getText().trim()));
                    modelo.setValor(Float.parseFloat(vista.txtValor.getText().trim()));

                    consulta.GuardarCliente(modelo);// se llama al metodo guardar cliente en la clase consulta

                    vista.panelEscritorio.removeAll();//limpia el panel principal
                    vista.panelEscritorio.repaint();
                    vista.panelEscritorio.revalidate();// lo revalida
                    vista.panelEscritorio.add(vista.vistaRegistro);// cambia al panel donde se ven los registros

                    consulta.MostrarRegistros(vista.tablaRegistros); //se hace la consulta para ver todos los datos agregados

                    //------- limpia los campos del registro----------
                    vista.cbxBanco.setSelectedIndex(0);
                    vista.txtBoleta.setText("");
                    vista.txtValor.setText("");
                    vista.txtCliente.setText("");
                    vista.txtFactura.setText("");
                    vista.txtHora.setText("");
                    vista.txtTelefono.setText("");
                    vista.fechaUso.setDatoFecha(null);
                    vista.txtAtendio.setText("");
                    //-------------------------------------------------
                }
            }
            if (vista.btnGuardar.getText().equals("MODIFICAR")) {

                modelo.setBanco((String) vista.cbxBanco.getSelectedItem());
                modelo.setAtendio(vista.txtAtendio.getText().trim());
                modelo.setBoleta(vista.txtBoleta.getText().trim());
                modelo.setCliente(vista.txtCliente.getText().trim());
                modelo.setFactura(Integer.valueOf(vista.txtFactura.getText().trim()));

                Date date = vista.fechaUso.getDatoFecha(); //se obtiene la fecha ingresada en la vista
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//se le da formato a la fecha ingresada
                String fecha = sdf.format(date);// se convierte a estring la fecha ingresada

                modelo.setFechaUso(fecha);
                modelo.setHora(vista.txtHora.getText());
                modelo.setTelefono(Integer.valueOf(vista.txtTelefono.getText().trim()));
                modelo.setValor(Float.parseFloat(vista.txtValor.getText().trim()));

                consulta.ModificarRegistro(modelo, codigoMoficar);// se llama al metodo modificar en la clase consulta

                vista.panelEscritorio.removeAll();//limpia el panel principal
                vista.panelEscritorio.repaint();
                vista.panelEscritorio.revalidate();// lo revalida
                vista.panelEscritorio.add(vista.vistaRegistro);// cambia al panel donde se ven los registros

                consulta.MostrarRegistros(vista.tablaRegistros); //se hace la consulta para ver todos los datos agregados

                //------- limpia los campos del registro----------
                vista.cbxBanco.setSelectedIndex(0);
                vista.txtBoleta.setText("");
                vista.txtValor.setText("");
                vista.txtCliente.setText("");
                vista.txtFactura.setText("");
                vista.txtHora.setText("");
                vista.txtTelefono.setText("");
                vista.fechaUso.setDatoFecha(null);
                vista.txtAtendio.setText("");
                //-------------------------------------------------
            }

            if (vista.btnGuardar.getText().equals("MODIFICAR EN BUSQUEDA")) {

                modelo.setBanco((String) vista.cbxBanco.getSelectedItem());
                modelo.setAtendio(vista.txtAtendio.getText().trim());
                modelo.setBoleta(vista.txtBoleta.getText().trim());
                modelo.setCliente(vista.txtCliente.getText().trim());
                modelo.setFactura(Integer.valueOf(vista.txtFactura.getText().trim()));

                Date date = vista.fechaUso.getDatoFecha(); //se obtiene la fecha ingresada en la vista
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//se le da formato a la fecha ingresada
                String fecha = sdf.format(date);// se convierte a estring la fecha ingresada

                modelo.setFechaUso(fecha);
                modelo.setHora(vista.txtHora.getText());
                modelo.setTelefono(Integer.valueOf(vista.txtTelefono.getText().trim()));
                modelo.setValor(Float.parseFloat(vista.txtValor.getText().trim()));

                consulta.ModificarRegistro(modelo, codigoMoficar);// se llama al metodo modificar en la clase consulta

                vista.panelEscritorio.removeAll();//limpia el panel principal
                vista.panelEscritorio.repaint();
                vista.panelEscritorio.revalidate();// lo revalida
                vista.panelEscritorio.add(vista.vistaBusqueda);// cambia al panel donde se ven los registros

                Date dateIni = vista.fechaInicial.getDatoFecha(); //se obtiene la fecha inicial ingresada 
                String fechaIni = sdf.format(dateIni);// se convierte a estring la fecha ingresada

                Date dateFin = vista.fechaFinal.getDatoFecha(); //se obtiene la fecha final ingresada
                String fechaFin = sdf.format(dateFin);// se convierte a estring la fecha ingresada

                consulta.BuscarRegistros(vista.tablaBusqueda, fechaIni, fechaFin);//muestra los registros buscados 

                //------- limpia los campos del registro----------
                vista.cbxBanco.setSelectedIndex(0);
                vista.txtBoleta.setText("");
                vista.txtValor.setText("");
                vista.txtCliente.setText("");
                vista.txtFactura.setText("");
                vista.txtHora.setText("");
                vista.txtTelefono.setText("");
                vista.fechaUso.setDatoFecha(null);
                vista.txtAtendio.setText("");
                //-------------------------------------------------
            }

        }

        if (vista.btnBuscar == e.getSource()) {
            if (vista.fechaInicial.getDatoFecha() == null || vista.fechaFinal.getDatoFecha() == null) {
                JOptionPane.showMessageDialog(null, "Seleccione fecha inicial y fecha final de busqueda", "Atención", JOptionPane.INFORMATION_MESSAGE, iconoInfo);
            } else {
                Date dateIni = vista.fechaInicial.getDatoFecha(); //se obtiene la fecha inicial ingresada 
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//se le da formato a la fecha ingresada
                String fechaIni = sdf.format(dateIni);// se convierte a estring la fecha ingresada

                Date dateFin = vista.fechaFinal.getDatoFecha(); //se obtiene la fecha final ingresada
                String fechaFin = sdf.format(dateFin);// se convierte a estring la fecha ingresada

                consulta.BuscarRegistros(vista.tablaBusqueda, fechaIni, fechaFin);
            }
        }

        if (vista.menuEliminar == e.getSource()) {
            int filaR = vista.tablaRegistros.getSelectedRow();//obtiene el indice de la fila seleccionada en la tabla registros
            int filaB = vista.tablaBusqueda.getSelectedRow();//obtiene el indice de la fila seleccionada en la tabla busqueda

            if (filaR != -1) {//si se ha seleccionado una fila en la tabla registros se ejecuta la condicion

                int x = JOptionPane.showConfirmDialog(null, "Seguro de eliminar?", "?", 1, JOptionPane.QUESTION_MESSAGE, iconoQuestion);
                if (x == 0) {
                    String codigo = (String) vista.tablaRegistros.getValueAt(filaR, 0);
                    consulta.BorrarRegistro(codigo);
                    consulta.MostrarRegistros(vista.tablaRegistros);
                }

            } else if (filaB != -1) {//si se ha seleccionado una fila en la tabla busqueda se ejecuta la condicion

                int x = JOptionPane.showConfirmDialog(null, "Seguro de eliminar?", "?", 1, JOptionPane.QUESTION_MESSAGE, iconoQuestion);
                if (x == 0) {
                    String codigo = (String) vista.tablaBusqueda.getValueAt(filaB, 0);
                    consulta.BorrarRegistro(codigo);

                    Date dateIni = vista.fechaInicial.getDatoFecha(); //se obtiene la fecha inicial ingresada 
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//se le da formato a la fecha ingresada
                    String fechaIni = sdf.format(dateIni);// se convierte a estring la fecha ingresada

                    Date dateFin = vista.fechaFinal.getDatoFecha(); //se obtiene la fecha final ingresada
                    String fechaFin = sdf.format(dateFin);// se convierte a estring la fecha ingresada

                    consulta.BuscarRegistros(vista.tablaBusqueda, fechaIni, fechaFin);//muestra los registros buscados 
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una registro", "Alerta", JOptionPane.ERROR_MESSAGE, iconoError);
            }
        }

        if (vista.menuConfirmar == e.getSource()) {
            int filaR = vista.tablaRegistros.getSelectedRow();//obtiene el indice de la fila seleccionada en la tabla registros
            int filaB = vista.tablaBusqueda.getSelectedRow();//obtiene el indice de la fila seleccionada en la tabla busqueda

            if (filaR != -1) {//si se ha seleccionado una fila en la tabla registros se ejecuta la condicion

                String codigo = (String) vista.tablaRegistros.getValueAt(filaR, 0);

                int x = JOptionPane.showConfirmDialog(null, "Desea confirmar depósito?", "?", 1, JOptionPane.QUESTION_MESSAGE, iconoQuestion);
                if (x == 0) {
                    consulta.ConfirmarBoleta(vista.tablaRegistros, codigo);
                    consulta.MostrarRegistros(vista.tablaRegistros);
                }

            } else if (filaB != -1) {//si se ha seleccionado una fila en la tabla busqueda se ejecuta la condicion

                String codigo = (String) vista.tablaBusqueda.getValueAt(filaB, 0);

                int x = JOptionPane.showConfirmDialog(null, "Desea confirmar depósito?", "?", 1, JOptionPane.QUESTION_MESSAGE, iconoQuestion);
                if (x == 0) {
                    consulta.ConfirmarBoleta(vista.tablaBusqueda, codigo);

                    Date dateIni = vista.fechaInicial.getDatoFecha(); //se obtiene la fecha inicial ingresada 
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//se le da formato a la fecha ingresada
                    String fechaIni = sdf.format(dateIni);// se convierte a estring la fecha ingresada

                    Date dateFin = vista.fechaFinal.getDatoFecha(); //se obtiene la fecha final ingresada
                    String fechaFin = sdf.format(dateFin);// se convierte a estring la fecha ingresada

                    consulta.BuscarRegistros(vista.tablaBusqueda, fechaIni, fechaFin);//muestra los registros buscados 
                }

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una registro", "Alerta", JOptionPane.ERROR_MESSAGE, iconoError);
            }
        }

        if (vista.menuModificar == e.getSource()) {

            int filaR = vista.tablaRegistros.getSelectedRow();//obtiene el indice de la fila seleccionada en la tabla registros
            int filaB = vista.tablaBusqueda.getSelectedRow();//obtiene el indice de la fila seleccionada en la tabla busqueda

            if (filaR != -1) {//si se ha seleccionado una fila en la tabla registros se ejecuta la condicion

                try {
                    codigoMoficar = (Integer.parseInt((String) vista.tablaRegistros.getValueAt(filaR, 0)));
                    vista.cbxBanco.setSelectedItem(vista.tablaRegistros.getValueAt(filaR, 3));
                    vista.txtBoleta.setText((String) vista.tablaRegistros.getValueAt(filaR, 2));
                    vista.txtValor.setText((String) vista.tablaRegistros.getValueAt(filaR, 4));
                    vista.txtFactura.setText((String) vista.tablaRegistros.getValueAt(filaR, 5));
                    vista.txtCliente.setText((String) vista.tablaRegistros.getValueAt(filaR, 6));
                    vista.txtTelefono.setText((String) vista.tablaRegistros.getValueAt(filaR, 7));

                    String date = (String) vista.tablaRegistros.getValueAt(filaR, 8);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date parsedFecha;
                    parsedFecha = sdf.parse(date);
                    java.util.Date fecha = new java.util.Date(parsedFecha.getTime());

                    vista.fechaUso.setDatoFecha(fecha);
                    vista.txtHora.setText((String) vista.tablaRegistros.getValueAt(filaR, 9));
                    vista.txtAtendio.setText((String) vista.tablaRegistros.getValueAt(filaR, 10));

                    vista.panelEscritorio.removeAll();
                    vista.panelEscritorio.repaint();
                    vista.panelEscritorio.revalidate();
                    vista.panelEscritorio.add(vista.vistaAgregarRegistro);

                    vista.btnGuardar.setText("MODIFICAR");

                } catch (ParseException ex) {
                    Logger.getLogger(controladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (filaB != -1) {//si se ha seleccionado una fila en la tabla busqueda se ejecuta la condicion

                try {
                    codigoMoficar = Integer.parseInt((String) vista.tablaBusqueda.getValueAt(filaB, 0));
                    vista.cbxBanco.setSelectedItem(vista.tablaBusqueda.getValueAt(filaB, 3));
                    vista.txtBoleta.setText((String) vista.tablaBusqueda.getValueAt(filaB, 2));
                    vista.txtValor.setText((String) vista.tablaBusqueda.getValueAt(filaB, 4));
                    vista.txtFactura.setText((String) vista.tablaBusqueda.getValueAt(filaB, 5));
                    vista.txtCliente.setText((String) vista.tablaBusqueda.getValueAt(filaB, 6));
                    vista.txtTelefono.setText((String) vista.tablaBusqueda.getValueAt(filaB, 7));

                    String date = (String) vista.tablaBusqueda.getValueAt(filaB, 8);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date parsedFecha;
                    parsedFecha = sdf.parse(date);
                    java.util.Date fecha = new java.util.Date(parsedFecha.getTime());

                    vista.fechaUso.setDatoFecha(fecha);
                    vista.txtHora.setText((String) vista.tablaBusqueda.getValueAt(filaB, 9));
                    vista.txtAtendio.setText((String) vista.tablaBusqueda.getValueAt(filaB, 10));

                    vista.panelEscritorio.removeAll();
                    vista.panelEscritorio.repaint();
                    vista.panelEscritorio.revalidate();
                    vista.panelEscritorio.add(vista.vistaAgregarRegistro);

                    vista.btnGuardar.setText("MODIFICAR EN BUSQUEDA");

                } catch (ParseException ex) {
                    Logger.getLogger(controladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una registro", "Alerta", JOptionPane.ERROR_MESSAGE, iconoError);
            }
        }
        if (vista.txtFactura == e.getSource()) {
            vista.btnGuardar.doClick();
        }
    }

}
