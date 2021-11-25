
import dao.ShelvesDAO;
import entity.Invoice;
import entity.Shelves;
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
    public static void main(String[] args) {
       Invoice i = new Invoice();
       Date d = i.getFinalSettlement();
       if(d==null) System.out.print("A");
    }
}
