/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.ProductBatch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class ProductBatchDAO extends WarehouseDAO<ProductBatch, String> {

    final String INSERT = "INSERT INTO product_batch (product_id, "
            + "quantity, price, supplier_id,entered_date) VALUES (?,?,?,?,?)";
    final String SELECT_ALL = "select * from product_batch where quantity > 0";
    final String UPDATE = "UPDATE product_batch SET "
            + "quantity=? where id = ?";
    final String SELECT_BY_ID = "select * from product_batch where id = ?";
    final String DELETE = "update product_batch set quantity = 0 where id = ?";

    @Override
    public void insert(ProductBatch entity) {
        XJdbc.update(INSERT, entity.getProductID(), entity.getQuantity(),
                entity.getPrice(), entity.getSupplierID(),
                entity.getEnteredDate());
    }

    @Override
    public void update(ProductBatch entity) {
        ProductBatch p = this.selectByID(entity.getId() + "");
        XJdbc.update(UPDATE,
                p.getQuantity() + entity.getQuantity(), entity.getId());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE, id);
    }

    @Override
    public List<ProductBatch> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public ProductBatch selectByID(String id) {
        return selectBySql(SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<ProductBatch> selectBySql(String sql, Object... args) {
        try {
            ResultSet rs = XJdbc.query(sql, args);
            List<ProductBatch> lst = new ArrayList<>();
            while (rs.next()) {
                ProductBatch p = new ProductBatch();
                p.setId(rs.getInt(1));
                p.setProductID(rs.getString(2));
                p.setQuantity(rs.getInt(3));
                p.setPrice(rs.getDouble(4));
                p.setSupplierID(rs.getInt(5));
                p.setEnteredDate(rs.getDate(6));
                p.setNote(rs.getString(7));
                lst.add(p);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public int getBatch() {
        String query = "select top 1 id from product_batch order by id desc";
        Object o = XJdbc.value(query);
        if (o != null) {
            return (int) o;
        }
        return 1;
    }

    public int getQuantity(int id) {
        String query = "select quantity from product_batch where id = ?";
        Object o = XJdbc.value(query, id);
        return (int) o;
    }

    public List<ProductBatch> selectUnsorted() {
        try {
            List<ProductBatch> lst = new ArrayList<>();
            String query = "select * from shelves_details where shelves_id = 0";
            ResultSet rs = XJdbc.query(query);
            while (rs.next()) {
                int batchID = rs.getInt(3);
                ProductBatch p = selectByID(batchID + "");
                p.setQuantity(rs.getInt(4));
                lst.add(p);
            }
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public int hasBatch(ProductBatch b) {
        String query = "select * from product_batch where product_id = ? and price = ? and"
                + " supplier_id = ? and entered_date =?";
        Object o = XJdbc.value(query, b.getProductID(), b.getPrice(),
                b.getSupplierID(), b.getEnteredDate());
        if (o != null) {
            return (int) o;
        }
        return -1;
    }

    public void updateQuantity(int batchID, int quantity) {
        String sql = "update product_batch set quantity = "
                + "((select quantity from product_batch where id =?)-?)\n"
                + "where id = ?";
        XJdbc.update(sql, batchID,quantity,batchID);
    }
}
