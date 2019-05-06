package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.consultas;
import vista.password;

/**
 *
 * @author gudiel
 */
public class controladorPassword implements ActionListener {

    private final password vistaPass;
    private final consultas consulta;
    private final String codigo;
    
    Icon iconoError = new ImageIcon(getClass().getResource("/images/icons8-error-64.png"));
    Icon iconoCorrecto = new ImageIcon(getClass().getResource("/images/icons8-de-acuerdo-64.png"));
    Icon iconoInfo = new ImageIcon(getClass().getResource("/images/icons8-ayuda-64.png"));

    public controladorPassword(password vista, consultas cons, String codigo) {
        this.vistaPass = vista;
        this.consulta = cons;
        this.codigo = codigo;
        this.vistaPass.btnAceptar.addActionListener(this);
        this.vistaPass.btnCancelar.addActionListener(this);
        this.vistaPass.txtPassword.addActionListener(this);
    }

    public void Iniciar() {
        vistaPass.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaPass.btnAceptar == e.getSource()) {
            
            String pass = consulta.password(vistaPass.txtPassword.getText().trim());
            
            if(vistaPass.txtPassword.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese contraseña", "Atención", 0, iconoInfo);
                
            }else if (pass != null) {
                consulta.ConfirmarBoleta(codigo);
                vistaPass.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", 0, iconoError);
                vistaPass.txtPassword.setText("");
            }
        }
        if(vistaPass.btnCancelar == e.getSource()){
            vistaPass.dispose();
        }
        if(vistaPass.txtPassword == e.getSource()){
            vistaPass.btnAceptar.doClick();
        }
    }

}
