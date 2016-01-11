/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geotagger;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author kamil
 */
public class PhotoPanel extends JPanel {

    private static JButton selectButton;

    public PhotoPanel() {
        super();
        customizePanel();
        initComponents();
    }

    private void customizePanel() {
        setMinimumSize(new Dimension(400, 400));
        setBorder(BorderFactory.createLoweredBevelBorder());
        setLayout(new GridBagLayout());
    }

    private void initComponents() {
        createSelectButton();
    }

    private void createSelectButton() {
        selectButton = new SelectButton();

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx = 0;
        gc.gridy = 0;

        add(selectButton, gc);
    }

}
