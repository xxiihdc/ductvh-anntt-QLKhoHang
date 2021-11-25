/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.InvoiceDetails;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class InvoiceDetailsDAO extends WarehouseDAO<InvoiceDetails, String>{
    final String INSERT = "INSERT INTO invoice_details (invoice_id, product_batch_id, price,"
            + " quantity, discount, product_id) VALUES (?,?,?,?,?,?)";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InvoiceDetails selectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InvoiceDetails> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
