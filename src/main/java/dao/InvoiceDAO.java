/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Invoice;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class InvoiceDAO extends WarehouseDAO<Invoice, String> {

    final String INSERT = "INSERT INTO invoice "
            + "(staff_id, discount, amount, created_date, debt,"
            + " payment_method, note, supplier_id,status) VALUES (?,?,?,?,?,?,?,?,?)";
    final String SELECT_ALL = "SELECT * FROM INVOICE";
    final String SELECT_BY_ID = "select * from invoice where id =?";
    final String DELETE = "update invoice set status = 2, note = ? where id = ?";
    final String UPDATE = "update invoice set status = 1, note = ? where id = ?";

    @Override
    public void insert(Invoice entity) {

        XJdbc.update(INSERT, entity.getStaffID(), entity.getDiscount(),
                entity.getAmount(), entity.getCreateDate(),
                entity.getDebt(), entity.getPaymentMethod(), entity.getNote(),
                entity.getSupplierID(), entity.getStatus());

    }

    @Override
    public void update(Invoice entity) {
        XJdbc.update(UPDATE, entity.getNote(), entity.getId());
    }

    @Override
    public void delete(String id) {

    }

    public void delete(Invoice iv) {
        XJdbc.update(DELETE, iv.getNote(), iv.getId());
    }

    @Override
    public List<Invoice> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public Invoice selectByID(String id) {
        return selectBySql(SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<Invoice> selectBySql(String sql, Object... args) {
        try {
            List<Invoice> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Invoice i = new Invoice();
                i.setId(rs.getInt(1));
                i.setStaffID(rs.getString(2));
                i.setDiscount(rs.getDouble(3));
                i.setAmount(rs.getDouble(4));
                i.setCreateDate(rs.getDate(5));
                i.setDebt(rs.getDouble(6));
                i.setPaymentMethod(rs.getString(7));
                i.setNote(rs.getString(8));
                i.setSupplierID(rs.getInt(9));
                i.setStatus(rs.getInt(10));
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

    public List<Invoice> selectByDate(String from, String to, int index, boolean no) {
        String sql = "select * from invoice where created_date between ? and ? and status ";
        if (index == 0) {
            sql += "< 5";
        } else {
            index--;
            sql += " = " + index;
        }
        if (no) {
            sql += " and debt > 0";
        }
        return selectBySql(sql, from, to);
    }

    public void updateDebt(Invoice invoice) {
        String sql = "update invoice set debt = ? where id = ?";
        XJdbc.update(sql, invoice.getDebt(),invoice.getId());
    }
}
