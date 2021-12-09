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
     final String INSERT = "INSERT INTO _user (username, password, id) VALUES (?,?,?)";
     final String UPDATE = "UPDATE _user SET password = ? where username = ?";
     final String SELECT_ALL = "SELECT * FROM _USER";
     @Override
    public void insert(User entity) {
        XJdbc.update(INSERT, entity.getUsername(),entity.getPassword(),entity.getId());
    }

    @Override
    public void update(User entity) {
        XJdbc.update(UPDATE, entity.getPassword(),entity.getUsername());
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public User selectByID(String id) {
        List<User> lst= selectBySql(SELECT_BY_ID, id);
        if(lst.isEmpty()) return null;
        return lst.get(0);
    }
    public User selectByStaff(String id) {
        String sql = "select * from _user where id = ?";
        List<User> lst= selectBySql(sql, id);
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

    public boolean hasUsername() {
        String sql = "select id from _user";
        Object o = XJdbc.value(sql);
        return o!= null;
    }
    
}
