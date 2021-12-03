/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class UserDAO extends WarehouseDAO<User, String>{

     final String SELECT_BY_ID = "select * from _user where username = ?";
    @Override
    public void insert(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User selectByID(String id) {
        List<User> lst= selectBySql(SELECT_BY_ID, id);
        if(lst.isEmpty()) return null;
        return lst.get(0);
    }

    @Override
    public List<User> selectBySql(String sql, Object... args) {
        try {
            List<User> lst = new ArrayList<User>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                User u = new User();
                u.setId(rs.getString(3));
                u.setPassword(rs.getString(2));
                u.setUsername(rs.getString(1));
                lst.add(u);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
