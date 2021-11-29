
import dao.ShelvesDetailsDAO;
import utils.Currency;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ductr
 */
public class NewClass2 {
    public static void main(String[] args) {
        ShelvesDetailsDAO dao = new ShelvesDetailsDAO();
        dao.selectByKho(1);
    }
}
