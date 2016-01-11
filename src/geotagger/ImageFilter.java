/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geotagger;

import java.io.File;
import javax.swing.filechooser.*;

/* ImageFilter.java is used by FileChooserDemo2.java. */
public class ImageFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = Utils.getExtension(f);
        if (extension != null) {
            return extension.equals(Utils.TIFF) ||
                    extension.equals(Utils.TIF) ||
                    extension.equals(Utils.GIF) ||
                    extension.equals(Utils.JPEG) ||
                    extension.equals(Utils.JPG) ||
                    extension.equals(Utils.PNG);
        }

        return false;
    }

    @Override
    public String getDescription() {
        return "Just Images";
    }
}