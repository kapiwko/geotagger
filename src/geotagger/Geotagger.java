package geotagger;

import java.io.File;
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
        int returnVal = FILE_CHOOSER.showOpenDialog(mainWindow);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = FILE_CHOOSER.getSelectedFile();
            //This is where a real application would open the file.
            //log.append("Opening: " + file.getName() + "." + "\n");
        } else {
            //log.append("Open command cancelled by user." + "\n");
        }
    }
    
}
