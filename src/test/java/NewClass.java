
import dao.ShelvesDetailsDAO;
import java.io.IOException;
import utils.Currency;

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
        ShelvesDetailsDAO dao = new ShelvesDetailsDAO();
        if(dao.hasProduct(0, 88)){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
        
    }
}
