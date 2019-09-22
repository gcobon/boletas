
package main;

import controlador.controladorRegistro;
import modelo.consultas;
import modelo.modeloRegistro;
import vista.principal;

/**
 *
 * @author gudiel
 */
public class Boletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        consultas cons = new consultas();
        modeloRegistro modelo = new modeloRegistro();
        principal vista  = new principal();
        
        cons.probarConexion();
        
        controladorRegistro control = new controladorRegistro(vista, modelo, cons);
        control.Iniciar();
       
    }
    
}
