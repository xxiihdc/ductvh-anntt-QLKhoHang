/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Paid;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.MsgBox;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class PaidDAO extends WarehouseDAO<Paid, String> {

    final String INSERT = "INSERT INTO paid (invoice_id, price, date,staff) VALUES (?,?,?,?)";
    final String SELECT_ALL = "SELECT * FROM PAID";
    final String SELECT_BY_INVOICE = "select * from paid where invoice_id = ?";

    @Override
    public void insert(Paid entity) {
        XJdbc.update(INSERT, entity.getInvoice_id(), entity.getPrice(), entity.getDate(),entity.getStaff());
    }

    @Override
    public void update(Paid entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paid> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public Paid selectByID(String id) {
        return null;
    }

    @Override
    public List<Paid> selectBySql(String sql, Object... args) {
        try {
            ResultSet rs = XJdbc.query(sql, args);
            List<Paid> lst = new ArrayList<>();
            while (rs.next()) {
                Paid p = new Paid(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getDate(4),rs.getString(5));
                lst.add(p);
            }
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Paid> selectByInvoice(String invoiceID) {
        return selectBySql(SELECT_BY_INVOICE, invoiceID);
    }

}
