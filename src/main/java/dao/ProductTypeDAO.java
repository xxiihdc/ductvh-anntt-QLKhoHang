/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.ProductType;
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
public class ProductTypeDAO extends WarehouseDAO<ProductType, String>{
    final String INSERT = "INSERT INTO product_type (name,description) values (?,?)";
    final String SELECT_ALL = "SELECT * FROM product_type";
    @Override
    public void insert(ProductType entity) {
        XJdbc.update(INSERT, entity.getName(),entity.getDescription());
    }

    @Override
    public void update(ProductType entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductType> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public ProductType selectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductType> selectBySql(String sql, Object... args) {
        try {
            List<ProductType> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                ProductType p = new ProductType(rs.getString(2),rs.getString(3));
                lst.add(p);
            }
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean hasID(String text) {
        String sql = "select name from product_type where name = ?";
        Object o = XJdbc.value(sql, text);
        return o!=null;
    }
    
}