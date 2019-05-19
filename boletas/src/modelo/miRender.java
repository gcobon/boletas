package modelo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author gudiel
 */
public class miRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int col) {

        Component c = super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, col);
        Object valueAt = table.getModel().getValueAt(row, col);
        String s = "";
        if (valueAt != null) {
            s = valueAt.toString();
        }

        if (row % 2 == 0) {
            c.setBackground(new Color(255, 255, 255));
        } else {
            c.setBackground(new Color(235, 237, 240));
        }

        if (isSelected == true) {
            c.setBackground(new Color(0, 112, 192));
            c.setForeground(new Color(255, 255, 255));
            c.setFont(new Font("Tahoma", Font.BOLD, 12));
        } else {
            if (s.equalsIgnoreCase("CONFIRMADA")) {
                c.setForeground(Color.GREEN);
                
            } else if(s.equalsIgnoreCase("SIN CONFIRMAR")){
                c.setForeground(Color.RED);
                
            }else{
                c.setForeground(new Color(25, 118, 210));
                c.setFont(new Font("Tahoma", Font.PLAIN, 11));
            }
        }

        return c;
    }

}
