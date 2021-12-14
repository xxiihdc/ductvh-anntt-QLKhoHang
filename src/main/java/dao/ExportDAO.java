/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Export;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class ExportDAO extends WarehouseDAO<Export, String> {

    final String INSERT = "INSERT INTO Export (staff_id, "
            + "totalProduct, totalProductQuantity, date,note) VALUES (?,?,?,?,?)";
    final String SELECT_ALL = "select * from export";
    final String SELECT_BY_ID = "select * from export where id = ?";

    @Override
    public void insert(Export entity) {
        XJdbc.update(INSERT, entity.getStaffId(), entity.getTotalProduct(),
                 entity.getTotalQuantity(), entity.getDate(), entity.getNote());
    }

    @Override
    public void update(Export entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Export> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public Export selectByID(String id) {
        return selectBySql(SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<Export> selectBySql(String sql, Object... args) {
        try {
            List<Export> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Export e = new Export();
                e.setId(rs.getInt(1));
                e.setStaffId(rs.getString(2));
                e.setTotalProduct(rs.getInt(3));
                e.setTotalQuantity(rs.getInt(4));
                e.setDate(rs.getDate(5));
                e.setNote(rs.getString(6));
                lst.add(e);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public int getLastID() {
        String sql = "select top 1 id from Export order by id desc";
        Object o = XJdbc.value(sql);
        if (o != null) {
            return (int) o;
        }
        return 1;
    }

    public List<Export> selectByDate(String d1s, String d2s) {
        String sql = "select * from export where date between ? and ?";
        return selectBySql(sql, d1s,d2s);
    }

}
