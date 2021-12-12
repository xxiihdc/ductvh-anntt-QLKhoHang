/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.ShelvesDetails;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class ShelvesDetailsDAO extends WarehouseDAO<ShelvesDetails, String> {

    final String INSERT = "INSERT INTO shelves_details (shelves_id, product_batch_id, quantity) VALUES (?,?,?)";
    final String UPDATE = "UPDATE shelves_details SET "
            + " quantity = ? where id = ?";
    final String DELET = "DELETE FROM shelves_details where id = ?";
    private Vector<String> head;
    private Vector data;

    public ShelvesDetailsDAO() {
        head = new Vector<>();
        head.add("Kệ hàng");
        head.add("Tên Sản Phẩm");
        head.add("Ngày Nhập Kho");
        head.add("Số Lượng");
        data = new Vector();
    }

    @Override
    public void insert(ShelvesDetails entity) {
        XJdbc.update(INSERT, entity.getShelvesID(), entity.getProductBatchID(),
                entity.getQuantity());
    }

    @Override
    public void update(ShelvesDetails entity) {
        XJdbc.update(UPDATE, entity.getQuantity(), entity.getId());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELET, id);
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
                s.setId(rs.getInt(1));
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

    public List<ShelvesDetails> selectByID(int id) {
        String sql = "select * from shelves_details where shelves_id = ?";
        return selectBySql(sql, id);
    }

    public Vector selectByKho(int id) {
        try {
            data.clear();
            String sql = "{call sp_KhoHang(?)}";
            ResultSet rs = XJdbc.query(sql, id);
            ResultSetMetaData rmd = rs.getMetaData();
            while (rs.next()) {
                Vector row = new Vector();
                for (int i = 1; i <= rmd.getColumnCount(); i++) {
                    row.add(rs.getString(i));
                }
                data.add(row);
            }
            rs.getStatement().getConnection().close();
            return data;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public Vector getHead() {
        return head;
    }

    public ShelvesDetails selectByBatch(int sid, int pid) {
        String sql = "select * from shelves_details where shelves_id = ? and  product_batch_id = ?";
        return selectBySql(sql, sid, pid).get(0);
    }

    public void deleteDefault(int id) {
        String sql = "delete from shelves_details where shelves_id = 0 and product_batch_id = ?";
        XJdbc.update(sql, id);
    }

    public void updateDefault(int batch_id, int quantity) {
        String sql = "update shelves_details set quantity = "
                + "((select quantity from shelves_details where shelves_id = 0 and product_batch_id = ?)+?) "
                + " where shelves_id = 0 and product_batch_id = ?";
        XJdbc.update(sql, batch_id, quantity, batch_id);
    }

    public void deleteByBatch(int batchID) {
        String sql = "delete from shelves_details where product_batch_id = ? ";
        XJdbc.update(sql, batchID);
    }

    public List<ShelvesDetails> selectListByBatch(int batchID) {
        String sql = "select * from shelves_details where product_batch_id = ? order by shelves_id asc";
        return selectBySql(sql, batchID);
    }
    public boolean hasProduct(int s, int batch){
        String sql = "select id from shelves_details where shelves_id = ? and product_batch_id = ?";
        Object value = XJdbc.value(sql,s,batch);
        return value!= null;
    }

    void deleteAll() {
        String sql = "delete from shelves_details";
        XJdbc.update(sql);
    }
}
