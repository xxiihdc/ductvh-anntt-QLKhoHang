/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ductr
 */
public class ShelvesDetails {
    private int id,shelvesID,productBatchID,quantity;

    public ShelvesDetails(int shelvesID, int productBatchID, int quantity) {
        this.shelvesID = shelvesID;
        this.productBatchID = productBatchID;
        this.quantity = quantity;
    }

    public ShelvesDetails() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShelvesID() {
        return shelvesID;
    }

    public void setShelvesID(int shelvesID) {
        this.shelvesID = shelvesID;
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

    @Override
    public String toString() {
        return "ShelvesDetails{" + "id=" + id + ", shelvesID=" + shelvesID + ", productBatchID=" + productBatchID + ", quantity=" + quantity + '}';
    }
    
    
}
