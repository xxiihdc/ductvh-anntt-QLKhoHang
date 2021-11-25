/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Shelves;
import entity.ShelvesDetails;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class ShelvesDetailsDAO extends WarehouseDAO<ShelvesDetails, String> {

    final String INSERT = "INSERT INTO shelves_details (shelves_id, product_batch_id, quantity) VALUES (?,?,?)";

    @Override
    public void insert(ShelvesDetails entity) {
        XJdbc.update(INSERT, entity.getShelvesID(), entity.getProductBatchID(),
                entity.getQuantity());
    }

    @Override
    public void update(ShelvesDetails entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ShelvesDetails> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ShelvesDetails selectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ShelvesDetails> selectBySql(String sql, Object... args) {
        try {
            List<ShelvesDetails> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                ShelvesDetails s = new ShelvesDetails();
                s.setProductBatchID(rs.getInt(3));
                s.setQuantity(rs.getInt(4));
                s.setShelvesID(rs.getInt(2));
                lst.add(s);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public List<ShelvesDetails> selectByID(int id){
        String sql = "select * from shelves_details where shelves_id = ?";
        return selectBySql(sql, id);
    }

}
