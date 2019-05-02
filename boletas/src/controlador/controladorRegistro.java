package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public controladorRegistro(principal vista, modeloRegistro modelo, consultas consultas) {
        this.vista = vista;
        this.modelo = modelo;
        this.consulta = consultas;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
    }

    public void Iniciar() {
        vista.setVisible(true);
        vista.cbxBanco.requestFocus();
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vista.btnGuardar == e.getSource()) {
            if (vista.cbxBanco.getSelectedIndex() == 0 || vista.txtValor.getText().equals("") || vista.txtBoleta.getText().equals("") || vista.txtCliente.getText().equals("")
                    || vista.txtTelefono.getText().equals("") || vista.fechaUso.getDatoFecha() == null || vista.txtHora.getText().equals("") || vista.txtAtendio.getText().equals("")
                    || vista.txtFactura.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Atención", JOptionPane.INFORMATION_MESSAGE);
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
        
        if(vista.btnBuscar == e.getSource()){
            if(vista.fechaInicial.getDatoFecha()==null || vista.fechaFinal.getDatoFecha()==null){
                JOptionPane.showMessageDialog(null, "Seleccione fecha inicial y fecha final de busqueda", "Atención", JOptionPane.INFORMATION_MESSAGE);
            }else{
                Date dateIni = vista.fechaInicial.getDatoFecha(); //se obtiene la fecha inicial ingresada 
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//se le da formato a la fecha ingresada
                String fechaIni = sdf.format(dateIni);// se convierte a estring la fecha ingresada
                
                Date dateFin = vista.fechaFinal.getDatoFecha(); //se obtiene la fecha final ingresada
                String fechaFin = sdf.format(dateFin);// se convierte a estring la fecha ingresada
                
                consulta.BuscarRegistros(vista.tablaBusqueda, fechaIni, fechaFin);
            }
        }
    }

}
