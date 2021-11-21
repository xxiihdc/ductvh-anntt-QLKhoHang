/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Vendor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class VendorDAO extends WarehouseDAO<Vendor, String> {

    final String INSERT = "INSERT INTO vendors (id, name, origin) VALUES (?,?,?)";
    final String SELECT_ALL = "SELECT * FROM vendors";
    final String SELECT_BY_ID = "SELECT * FROM vendors where id = ?";
    @Override
    public void insert(Vendor entity) {
        XJdbc.update(INSERT, entity.getId(), entity.getName(), entity.getOrigin());
    }

    @Override
    public void update(Vendor entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vendor> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public Vendor selectByID(String id) {
        List<Vendor> lst = selectBySql(SELECT_BY_ID, id);
        if(lst.size()!=0){
            return lst.get(0);
        }else return null;
    }

    @Override
    public List<Vendor> selectBySql(String sql, Object... args) {
        try {
            List<Vendor> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Vendor s = new Vendor();
                s.setName(rs.getString(2));
                s.setId(rs.getString(1));
                s.setOrigin(rs.getString(3));
                lst.add(s);

            }
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean hasID(String text) {
        String query = "select id from vendors where id = ?";
        Object o = XJdbc.value(query, text);
        return o != null;
    }

}
