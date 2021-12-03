
import dao.ShelvesDAO;
import entity.Invoice;
import entity.Shelves;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javafx.scene.transform.Shear;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ductr
 */
public class NewClass {
    public static void main(String[] args) throws IOException {
        String title = "hd2021-12-01T184846.978.docx";
          File file = new File(title);
          Desktop.getDesktop().open(file);
    }
}
