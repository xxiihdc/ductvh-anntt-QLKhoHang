/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.CongViec;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class CongViecDAO {

    public List<CongViec> getCV() {
        FileReader reader = null;
        try {
            List<CongViec> lst = new ArrayList<>();
            String sql = "select count(*) from invoice where debt > 0";
            Object o = XJdbc.value(sql);
            int value;
            if (o != null) {
                value = (int) o;
                CongViec c = new CongViec();
                c.setName("no");
                c.setTitle("Bạn có: " + value + " hóa đơn còn nợ NCC.");
                c.setValue(o + "");
                lst.add(c);
            }
            sql = "select count(*) from invoice where status = 0";
            o = XJdbc.value(sql);
            if (o != null) {
                value = (int) o;
                CongViec c = new CongViec();
                c.setName("xacNhan");
                c.setTitle("Bạn có: " + value + " hóa đơn cần xác nhận.");
                c.setValue(o + "");
                lst.add(c);
            }
            reader = new FileReader("src\\main\\resources\\config\\soLuong.properties");
            Properties properties = new Properties();
            properties.load(reader);
            String soLuong = properties.getProperty("number");
            sql = "select _name,sum(quantity) as 'sum' from product_batch "
                    + "inner join product on product.id = product_batch.product_id "
                    + "group by _name having sum(quantity) < " + soLuong;
            ResultSet rs = XJdbc.query(sql);
            int i =0;
            while(rs.next()){
                i++;
            }
            if (i!=0) {
                CongViec c = new CongViec();
                c.setName("hetHang");
                c.setTitle("Bạn có: " + i + " sản phẩm sắp hết hàng.");
                c.setValue(soLuong);
                lst.add(c);
            }
             rs.getStatement().getConnection().close();
            return lst;
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
