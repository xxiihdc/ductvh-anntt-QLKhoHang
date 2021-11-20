
import dao.ShelvesDAO;
import entity.Shelves;
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
        Shelves s;// = new Shelves();
        ShelvesDAO dao = new ShelvesDAO();
        s= dao.selectByID(18+"");
        if(s==null){
            System.out.print("A");
        }else System.out.print(s);
    }
}
