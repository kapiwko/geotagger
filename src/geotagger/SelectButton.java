/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geotagger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;

/**
 *
 * @author kamil
 */
public class SelectButton extends JButton implements ActionListener {

    public SelectButton() {
        super();
        customize();
    }    

    private void customize() {
        setText("Wybierz pliki...");
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.LEADING);
        setToolTipText("Kliknij aby wybrać pliki do otagowania.");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Geotagger.loadFiles();
    }
    
}
