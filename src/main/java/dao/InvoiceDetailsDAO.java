/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.InvoiceDetails;
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
public class InvoiceDetailsDAO extends WarehouseDAO<InvoiceDetails, String>{
    final String INSERT = "INSERT INTO invoice_details (invoice_id, product_batch_id, price,"
            + " quantity, discount, product_id) VALUES (?,?,?,?,?,?)";
    final String SELECT_ALL = "select * from invoice_details";
    @Override
    public void insert(InvoiceDetails entity) {
        XJdbc.update(INSERT, entity.getInvoiceID(),entity.getProductBatchID(),entity.getPrice(),entity.getQuantity()
        ,entity.getDiscount(),entity.getProductID());
    }

    @Override
    public void update(InvoiceDetails entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InvoiceDetails> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public InvoiceDetails selectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InvoiceDetails> selectBySql(String sql, Object... args) {
        List<InvoiceDetails> lst = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                InvoiceDetails i = new InvoiceDetails();
                i.setProductID(rs.getString(7));
                i.setPrice(rs.getDouble(4));
                i.setQuantity(rs.getInt(5));
                i.setDiscount(rs.getDouble(6));
                lst.add(i);
            }
            rs.getStatement().getConnection().close();
            return lst;
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
        }
    }

    public List<InvoiceDetails> selectByInvoice(int id) {
        String sql = "select * from invoice_details where invoice_id = ?";
        return selectBySql(sql, id);
    }
    
}
