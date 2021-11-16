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
    private String shelves;
    private double price;

    public InvoiceDetails() {
    }

    public InvoiceDetails(int invoiceID, int productBatchID, int quantity, String shelves, double price) {
        this.invoiceID = invoiceID;
        this.productBatchID = productBatchID;
        this.quantity = quantity;
        this.shelves = shelves;
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

    public String getShelves() {
        return shelves;
    }

    public void setShelves(String shelves) {
        this.shelves = shelves;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
