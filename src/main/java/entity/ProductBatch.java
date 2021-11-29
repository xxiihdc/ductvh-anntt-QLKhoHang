/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import dao.ProductDAO;
import java.util.Date;
import utils.Xdate;

/**
 *
 * @author ductr
 */
public class ProductBatch {
    private int id,quantity,supplierID;
    private double price;
    private String note,productID;
    private Date enteredDate;
    public ProductBatch() {
    }

    public ProductBatch(String productID, int quantity, int supplierID, double price, String note, Date enteredDate) {
        this.productID = productID;
        this.quantity = quantity;
        this.supplierID = supplierID;
        this.price = price;
        this.note = note;
        this.enteredDate = enteredDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getEnteredDate() {
        return enteredDate;
    }

    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }  

    @Override
    public String toString() {
        return getProductName()+" - "+ "("+Xdate.toString(enteredDate,"dd-MM-yyyy"+")");
    }
    public String getProductName(){
        ProductDAO dao = new ProductDAO();
        Product p = dao.selectByID(this.getProductID());
        return p.getName();
    }
}
