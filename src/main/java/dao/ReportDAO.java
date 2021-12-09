/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

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
public class ReportDAO {

    public List<String[]> getTonKho() {
        String sql = "select _name,sum(quantity) as 'sum' from product_batch "
                + "inner join product on product.id = product_batch.product_id "
                + "group by _name having sum(quantity) > 0";
        return getData(sql);
    }

    public List<String[]> getNCC() {
        String sql = "select supplier.name,sum(amount-discount) from"
                + " invoice inner join supplier on invoice.supplier_id = supplier.id "
                + "group by supplier.name";
        return getData(sql);
    }

    public List<String[]> getGroup() {
        String sql = "select product_group.name as 'Nhom', sum(quantity) from"
                + " product_batch inner join product on product_batch.product_id=product.id"
                + " inner join product_group on product.product_group = product_group.id"
                + " group by product_group.name having sum(quantity) > 0";
        return getData(sql);

    }

    public List<String[]> getType() {
        String sql = "select product_type.name,sum(quantity) "
                + "from product_batch inner join product "
                + "on product_batch.product_id=product.id "
                + "inner join product_type "
                + "on product.product_type = product_type.id "
                + "group by product_type.name having sum(quantity) > 0";
        return getData(sql);
    }

    public List<String[]> getInvoice(int year) {

        String sql = "select MONTH(date), sum(price) from paid where year(date) = " + year
                + " group by MONTH(date);";
        return getData(sql);
    }

    public List<String[]> getExport(int year, int month) {
        String sql = "select _name,sum(Export_details.quantity) from export_details inner join product_batch on Export_details.product_batch_id = product_batch.id\n"
                + "inner join product on product.id = product_batch.product_id inner join Export on Export_details.export_id = Export.id \n"
                + "where YEAR(export.date) = 2021 and month(export.date) = 12\n"
                + "group by _name"
    }

    public List<Integer> selectYear() {
        try {
            List<Integer> lst = new ArrayList<>();
            String sql = "select distinct year(created_date) from invoice order by year(created_date) desc";
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                lst.add(new Integer(rs.getInt(1)));
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    private List<String[]> getData(String sql) {
        try {
            List<String[]> lst = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                String[] str = new String[]{rs.getString(1), rs.getString(2)};
                lst.add(str);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Integer> selectYearExport() {
        try {
            String sql = "select distinct year(Export.date) from export";
            ResultSet rs = XJdbc.query(sql);
            List<Integer> lst = new ArrayList<>();
            while (rs.next()) {
                int year = rs.getInt(1);
                lst.add(year);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Integer> selectMonth(int year) {
        String sql = "select distinct month(Export.date) from Export where YEAR(Export.date) = ? order by  month(Export.date)";
        try {
            ResultSet rs = XJdbc.query(sql, year);
            List<Integer> lst = new ArrayList<>();
            while (rs.next()) {
                int month = rs.getInt(1);
                lst.add(month);
            }
            rs.getStatement().getConnection().close();
            return lst;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
