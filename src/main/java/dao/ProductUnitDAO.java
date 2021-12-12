/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.ProductUnit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class ProductUnitDAO extends WarehouseDAO<ProductUnit, String> {

    final String INSERT = "INSERT INTO product_unit (id, name, description) VALUES (?,?,?)";
    final String SELECT_ALL = "SELECT * FROM product_unit";
    final String SELECT_BY_ID = "select * from product_unit where id = ?";
    @Override
    public void insert(ProductUnit entity) {
        XJdbc.update(INSERT, entity.getId(), entity.getName(), entity.getDescription());
    }

    @Override
    public void update(ProductUnit entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductUnit> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public ProductUnit selectByID(String id) {
        List<ProductUnit> lst = selectBySql(SELECT_BY_ID, id);
        if(lst.size()!=0) return lst.get(0);
        else return null;
    }

    @Override
    public List<ProductUnit> selectBySql(String sql, Object... args) {
        try {
            List<ProductUnit> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                ProductUnit s = new ProductUnit();
                s.setName(rs.getString(2));
                s.setId(rs.getString(1));
                s.setDescription(rs.getString(3));
                lst.add(s);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean hasID(String text) {
        String query = "select id from product_unit where id = ?";
        Object o = XJdbc.value(query, text);
        return o != null;
    }

}
