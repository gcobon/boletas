/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author gudiel
 */
public class miRender extends DefaultTableCellRenderer {
    
    public Component getTableCellRenderComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (row % 2 == 0){
            setBackground(Color.red);
            setForeground(Color.white);
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

    }

}
