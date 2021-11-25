/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Invoice;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class InvoiceDAO extends WarehouseDAO<Invoice, String> {

    final String INSERT = "INSERT INTO invoice "
            + "(staff_id, discount, amount, created_date, debt, final_settlement,"
            + " payment_method, note, supplier_id) VALUES (?,?,?,?,?,?,?,?,?)";
    final String SELECT_ALL = "SELECT * FROM INVOICE";

    @Override
    public void insert(Invoice entity) {
        Date d = entity.getFinalSettlement();
        if (d == null) {
            XJdbc.update(INSERT, entity.getStaffID(), entity.getDiscount(),
                    entity.getAmount(), entity.getCreateDate(),
                    entity.getDebt(), "", entity.getPaymentMethod(), entity.getNote(),
                    entity.getSupplierID());
        } else {

        }

    }

    @Override
    public void update(Invoice entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Invoice> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public Invoice selectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Invoice> selectBySql(String sql, Object... args) {
        try {
            List<Invoice> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                Invoice i = new Invoice();
                i.setId(rs.getInt(1));
                i.setStaffID(rs.getString(2));
                i.setDiscount(rs.getDouble(3));
                i.setAmount(rs.getDouble(4));
                i.setCreateDate(rs.getDate(5));
                i.setDebt(rs.getDouble(6));
                i.setFinalSettlement(rs.getDate(7));
                i.setPaymentMethod(rs.getString(8));
                i.setNote(rs.getString(9));
                i.setSupplierID(rs.getInt(10));
                lst.add(i);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public int getID() {
        String query = "select top 1 id from invoice order by id desc";
        Object o = XJdbc.value(query);
        if (o != null) {
            return (int) o + 1;
        } else {
            return 1;
        }
    }

    public int getLastID() {
        String query = "select top 1 id from invoice order by id desc";
        Object o = XJdbc.value(query);
        return (int) o;
    }
}
