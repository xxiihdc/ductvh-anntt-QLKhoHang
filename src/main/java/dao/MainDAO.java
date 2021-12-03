/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import utils.XJdbc;

/**
 *
 * @author ductr
 */
public class MainDAO {
    public String selectCountShelves(){
        Object o = XJdbc.value("select count(id)-1 from shelves");
        if(o!= null) return o+"";
        return "0";
    }
    public String selectSumQuantity(){
        Object o = XJdbc.value("select sum(quantity) from product_batch");
        if(o!= null) return o+"";
        return "0";
    }
    public String selectUnsorted(){
        Object o = XJdbc.value("select sum(quantity) from shelves_details where shelves_id =0");
        if(o!= null) return o+"";
        return "0";
    }
    public String selectSorted(){
         Object o = XJdbc.value("select sum(quantity) from shelves_details where shelves_id > 0");
        if(o!= null) return o+"";
        return "0";
    }
}
