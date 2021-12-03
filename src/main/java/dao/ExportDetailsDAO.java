/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.ExportDetails;
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
public class ExportDetailsDAO extends WarehouseDAO<ExportDetails, String>{
final String INSERT = "INSERT INTO Export_details (export_id, product_batch_id, quantity) VALUES (?,?,?)";
    @Override
    public void insert(ExportDetails entity) {
        XJdbc.update(INSERT, entity.getExportId(),entity.getBatchId(),entity.getQuantity());
    }
    @Override
    public void update(ExportDetails entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ExportDetails> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExportDetails selectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ExportDetails> selectBySql(String sql, Object... args) {
    try {
        List<ExportDetails> lst = new ArrayList<>();
        ResultSet rs = XJdbc.query(sql, args);
        while(rs.next()){
            ExportDetails e = new ExportDetails();
            e.setId(rs.getInt(1));
            e.setExportId(rs.getInt(2));
            e.setBatchId(rs.getInt(3));
            e.setQuantity(rs.getInt(4));
            lst.add(e);
        }
        rs.getStatement().getConnection().close();
        return lst;
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }
    }
    public List<ExportDetails> selectByHoaDon (int id){
        String sql = "select * from Export_details where export_id = ?";
        return selectBySql(sql, id);
    }
}
