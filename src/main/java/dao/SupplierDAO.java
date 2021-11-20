/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Supplier;
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
public class SupplierDAO extends WarehouseDAO<Supplier, String>{
    final String INSERT = "INSERT INTO supplier (name, address, phone, email, STK, status) VALUES (?,?,?,?,?,?)";
    final String SELECT_ALL = "SELECT * FROM supplier";
    @Override
    public void insert(Supplier s) {
        XJdbc.update(INSERT, s.getName(),s.getAddress(),s.getPhone(),
                s.getEmail(),s.getSTK(),true);
    }

    @Override
    public void update(Supplier entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Supplier> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public Supplier selectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Supplier> selectBySql(String sql, Object... args) {
        try {
            List<Supplier> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                Supplier s = new Supplier();
                s.setName(rs.getString(2));
                s.setAddress(rs.getString(3));
                s.setPhone(rs.getString(4));
                s.setEmail(rs.getString(5));
                s.setSTK(rs.getString(6));
                if(rs.getBoolean(7)){
                 lst.add(s);   
                }
            }
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean hasID(String text) {
        String query ="select name from supplier where name = ?";
        Object o = XJdbc.value(query, text);
        return o!=null;
    }
    
}
