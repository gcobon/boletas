package modelo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author gudiel
 */
public class miRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int col) {

        Border b; //variable de tipo borde

        JComponent c = (JComponent) super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, col);

        Object valueAt = table.getModel().getValueAt(row, col);
        String s = "";

        b = BorderFactory.createCompoundBorder();
        
        b = BorderFactory.createCompoundBorder(b, BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(231, 231, 231)));// se le da el grosor del borde top, left, buttom,right y color
            
        c.setBorder(b); // agrega el borde a las celdas

        setHorizontalAlignment((int) CENTER_ALIGNMENT); //centra el texto de las celdas

        if (valueAt != null) {
            s = valueAt.toString();
        }

        if (row % 2 == 0) {
            c.setBackground(new Color(255, 255, 255));

        } else {
            c.setBackground(new Color(255, 255, 255));
        }

        if (isSelected == true) {
            c.setBackground(new Color(38, 166, 154));
            c.setForeground(new Color(255, 255, 255));
            c.setFont(new Font("Tahoma", Font.BOLD, 12));
        } else {
            if (s.equalsIgnoreCase("CONFIRMADA")) {
                c.setForeground(new Color(38, 166, 154));

            } else if (s.equalsIgnoreCase("SIN CONFIRMAR")) {
                c.setForeground(Color.RED);

            } else {
                c.setForeground(new Color(25, 118, 210));
                c.setFont(new Font("Tahoma", Font.PLAIN, 10));
            }
        }

        return c;
    }

}
