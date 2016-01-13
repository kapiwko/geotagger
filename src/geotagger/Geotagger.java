package geotagger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;

/**
 *
 * @author kamil
 */
public class Geotagger {

    final private static String APP_NAME = "Geotagger";
    final private static String APP_VERSION = "0.0.1";
    private static MainWindow mainWindow;
    private static final JFileChooser FILE_CHOOSER = new JFileChooser();
    private static final List<File> FILES = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            mainWindow = new MainWindow(APP_NAME);
            mainWindow.setVisible(true);
        });
    }

    public static void loadFiles() {
        FILE_CHOOSER.addChoosableFileFilter(new ImageFilter());
        FILE_CHOOSER.setAcceptAllFileFilterUsed(false);
        FILE_CHOOSER.setMultiSelectionEnabled(true);
        int returnVal = FILE_CHOOSER.showOpenDialog(mainWindow);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] files = FILE_CHOOSER.getSelectedFiles();
            for (File file : files) {
                if(!FILES.contains(file)) {
                    FILES.add(file);
                }
            }
        }
    }

}
