/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class ProductDAO extends WarehouseDAO<Product, String>{
    final String INSERT = "INSERT INTO product (id,_name, image, status, note, "
            + "product_group, product_type, product_unit, vendors_id, price) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE product SET _name =?, image =?, status =?, "
            + "note =?, product_group =?, product_type =?, product_unit =?, vendors_id =?, "
            + "price = ? where id = ?";
    final String SELECT_ALL = "SELECT * FROM product where status = 1";
    final String SELECT_BY_ID = "SELECT * FROM product where id = ?";
    @Override
    public void insert(Product entity) {
        XJdbc.update(INSERT,entity.getId(), entity.getName(),entity.getImage(),entity.isStatus(),
                entity.getNote(),entity.getProductGroupID(),entity.getProductTypeID(),
                entity.getProductUnitID(),entity.getVendorID(),entity.getPrice());
    }

    @Override
    public void update(Product entity) {
        XJdbc.update(UPDATE, entity.getName(),entity.getImage(),entity.isStatus(),entity.getNote(),
                entity.getProductGroupID(),entity.getProductTypeID(),entity.getProductUnitID(),
                entity.getVendorID(),entity.getPrice(),entity.getId());
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public Product selectByID(String id) {
        List<Product> lst = selectBySql(SELECT_BY_ID, id);
        if(lst.size()!=0) return lst.get(0);
        else return null;
    }

    @Override
    public List<Product> selectBySql(String sql, Object... args) {
        try {
            List<Product> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                Product p = new Product();
                p.setId(rs.getString(1));
                p.setName(rs.getString(2));
                p.setImage(rs.getString(3));
                p.setStatus(rs.getBoolean(4));
                p.setNote(rs.getString(5));
                p.setProductGroupID(rs.getInt(6));
                p.setProductTypeID(rs.getInt(7));
                p.setProductUnitID(rs.getString(8));
                p.setVendorID(rs.getString(9));
                p.setPrice(rs.getDouble(10));
                lst.add(p);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean hasID(String text) {
        String query ="select id from product where id = ?";
        Object o = XJdbc.value(query, text);
        return o!=null;
    }
    public Product selectLast(){
        String sql = "select top 1 * from product new";
        return selectBySql(sql).get(0);
    }

    public List<Product> selectByKey(String key) {
        String sql = "select * from product where id like N'%"+key +"%' or _name like N'%"+key+"%'" ;
        return selectBySql(sql);
    }
    public List<Product> selectStop(){
        String sql = "select * from product where status = 0";
        return selectBySql(sql);
    }
}
