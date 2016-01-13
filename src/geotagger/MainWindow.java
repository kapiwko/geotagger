/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geotagger;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;


/**
 *
 * @author kamil
 */
public class MainWindow extends JFrame {
    
    private static final JSplitPane CENTER_PANEL = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    private static final JPanel LEFT_PANEL = new LeftPanel();
    private static final JPanel RIGHT_PANEL = new RightPanel();
    private static final JPanel FOOTER_PANEL = new FooterPanel();
    
    public MainWindow(String name) {
        super(name);
        customizeFrame();
        initComponents();
    }
    
    private void customizeFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        setSize(new Dimension(800, 500));
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setFont(new Font("Ubuntu", 0, 12));
    }
    
    private void initComponents() {
        CENTER_PANEL.setLeftComponent(LEFT_PANEL);
        CENTER_PANEL.setRightComponent(RIGHT_PANEL);
        CENTER_PANEL.setDividerLocation(0.5);
        
        add(CENTER_PANEL, BorderLayout.CENTER);
        add(FOOTER_PANEL, BorderLayout.SOUTH);
    }
}
