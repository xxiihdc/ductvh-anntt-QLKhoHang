/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.ProductGroup;
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
public class ProductGroupDAO extends WarehouseDAO<ProductGroup, String> {

    final String INSERT = "INSERT INTO product_group (name, descrpition) VALUES (?,?)";
    final String SELECT_ALL = "SELECT * FROM product_group";
    @Override
    public void insert(ProductGroup entity) {
        XJdbc.update(INSERT, entity.getName(), entity.getDescription());
    }

    @Override
    public void update(ProductGroup entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductGroup> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public ProductGroup selectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductGroup> selectBySql(String sql, Object... args) {
        try {
            List<ProductGroup> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                ProductGroup p = new ProductGroup(rs.getString(2), rs.getString(3));
                lst.add(p);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean hasID(String id) {
        String query = "select name from product_group where name = ?";
        Object o = XJdbc.value(query, id);
        return o != null;
    }

}
