/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Shelves;
import java.awt.Color;
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
public class ShelvesDAO {

    final String INSERT_SQL = "INSERT INTO shelves "
            + "(id, description, status, color) VALUES (?,?,?,?)";
    final String DELETE_SQL = "DELETE FROM shelves where id>0";
    final String SELECT_BY_ID = "SELECT * FROM shelves where id = ?";

    public void insert(int quantity) {
        delete();
        for (int i = 1; i <= quantity; i++) {
            XJdbc.update(INSERT_SQL, i, "Chưa có mô tả", true, "-2696737");
        }
    }

    public void delete() {
        XJdbc.update(DELETE_SQL);
    }

    public List<Shelves> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Shelves selectByID(String id) {
        return selectBySql(SELECT_BY_ID, id).get(0);
    }

    public List<Shelves> selectBySql(String sql, Object... args) {
        try {
            List<Shelves> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Shelves s = new Shelves();
                s.setId(rs.getInt(1));
                s.setNote(rs.getString(2));
                s.setStatus(rs.getBoolean(3));
                int c = Integer.parseInt(rs.getString(4));
                s.setC(new Color(c));
                lst.add(s);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
