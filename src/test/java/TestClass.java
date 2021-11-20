
import dao.ProductGroupDAO;
import entity.ProductGroup;
import java.io.UnsupportedEncodingException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ductr
 */
public class TestClass {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ProductGroupDAO dao = new ProductGroupDAO();
        dao.insert(new ProductGroup("Đồ nhựa","Đồ nhựa dẻo"));
    }
    
}
