/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geotagger;

import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author kamil
 */
public class FooterPanel extends JPanel{
    
    public FooterPanel() {
        super();
        customizePanel();
        initComponents();
    }
    
    private void customizePanel() {
        setMinimumSize(new Dimension(50, 800));
    }
    
    private void initComponents() {
        
    }
    
}
