/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import utils.Currency;
import utils.Xdate;

/**
 *
 * @author ductr
 */
public class Paid {
    private int id,invoice_id;
    private double price;
    private Date date;
    private String staff;

    public Paid() {
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public Paid(int id, int invoice_id, double price, Date date,String staff) {
        this.id = id;
        this.invoice_id = invoice_id;
        this.price = price;
        this.date = date;
        this.staff = staff;
    }

    public Paid(int invoice_id, double price, Date date,String staff) {
        this.invoice_id = invoice_id;
        this.price = price;
        this.date = date;
        this.staff = staff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return Xdate.toString(date, "dd-MM-yyyy")+" - " + Currency.getCurrency(price) +" - " + staff;
    }
    
}
