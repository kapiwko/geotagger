/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geotagger;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author kamil
 */
public class LeftPanel extends JPanel {

    private static final Table TABLE = new Table();
    private static final JScrollPane TABLE_CONTAINER = new JScrollPane(TABLE);
    private static final JPanel PHOTO_CONTAINER = new JPanel();
    private static JButton selectButton;

    public LeftPanel() {
        super();
        customizePanel();
        initComponents();
    }

    private void customizePanel() {
        setMinimumSize(new Dimension(400, 400));
        setBorder(BorderFactory.createLoweredBevelBorder());
        setLayout(new GridLayout(2, 1));
    }

    private void initComponents() {
        add(TABLE_CONTAINER);
        PHOTO_CONTAINER.setLayout(new GridBagLayout());
        add(PHOTO_CONTAINER);
        createSelectButton();
    }

    private void createSelectButton() {
        selectButton = new SelectButton();

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx = 0;
        gc.gridy = 0;

        PHOTO_CONTAINER.add(selectButton, gc);
    }
}
