/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ductr
 */
public class InvoiceDetails {
    private int id,invoiceID,productBatchID,quantity;
    private double price,discount;
    private String productID;

    public InvoiceDetails() {
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public InvoiceDetails(String proID) {
        this.productID= proID;
    }
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public InvoiceDetails(int invoiceID, int productBatchID, int quantity, double price) {
        this.invoiceID = invoiceID;
        this.productBatchID = productBatchID;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public int getProductBatchID() {
        return productBatchID;
    }

    public void setProductBatchID(int productBatchID) {
        this.productBatchID = productBatchID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
