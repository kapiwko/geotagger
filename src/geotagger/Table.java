/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geotagger;

import java.io.File;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kamil
 */
public class Table extends JTable {
    
    public Table() {
        super();
        customize();
    }
    
    private void customize() {        
        DefaultTableModel model = new DefaultTableModel() { 
            String[] headers = {"Nazwa pliku", "Rozmiar", ""};

            @Override 
            public int getColumnCount() { 
                return headers.length; 
            } 

            @Override 
            public String getColumnName(int index) { 
                return headers[index]; 
            } 
        };
        setModel(model);
    }
    
    public void updateTable(List<File> files) {
        
    }
    
}
