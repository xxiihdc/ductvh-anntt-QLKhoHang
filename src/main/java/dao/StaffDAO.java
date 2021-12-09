/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Staff;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class StaffDAO extends WarehouseDAO<Staff, String>{
    final String INSERT = "INSERT INTO staff "
            + "(id, _name, image, phone, email, status, role)"
            + "VALUES (?,?,?,?,?,?,?)";
    final String SELECT_ALL = "Select * from staff where status = 1 ";
    final String SELECT_BY_ID = "Select * from staff where id = ?";
    final String UPDATE = "UPDATE staff SET _name =?, image =?, phone =?, "
            + "email =?, status =?, role =? where id = ?";
    

    @Override
    public void insert(Staff entity) {
        XJdbc.update(INSERT,entity.getId(),entity.getName(),entity.getImage(),entity.getPhone(),
                entity.getEmail(),entity.isStatus(),entity.isRole());
    }

    @Override
    public void update(Staff entity) {
        XJdbc.update(UPDATE, entity.getName(),entity.getImage(),entity.getPhone(),
        entity.getEmail(),entity.isStatus(),entity.isRole(),entity.getId());
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public List<Staff> selectAll() {
        return selectBySql(SELECT_ALL);
    }

    @Override
    public Staff selectByID(String id) {
        return selectBySql(SELECT_BY_ID, id).get(0);
    }

    @Override
    public List<Staff> selectBySql(String sql, Object... args) {
        List<Staff> lst = new ArrayList<>();
        try{
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                Staff nv = new Staff();
                nv.setId(rs.getString(1));
                nv.setName(rs.getString(2));
                nv.setImage(rs.getString(3));
                nv.setPhone(rs.getString(4));
                nv.setEmail(rs.getString(5));
                nv.setStatus(rs.getBoolean(6));
                nv.setRole(rs.getBoolean(7));
                lst.add(nv);
            }
            rs.getStatement().getConnection().close();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        return lst;
    }

    public boolean hasID(String id) {
        String query ="select id from staff where id = ?";
        Object o = XJdbc.value(query, id);
        return o!=null;
    }
    public List<Staff> selectNotYetAccount(){
        String sql = "select * from staff where id not in (select id from _user)";
        return selectBySql(sql);
    }
}
