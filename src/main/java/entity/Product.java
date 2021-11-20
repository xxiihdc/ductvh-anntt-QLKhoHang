/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ductr
 */
public class Product {
    private int id,productGroupID,productTypeID,productUnitID;
    private String name,image,note;
    private boolean status;

    public Product() {
    }

    public Product(int productGroupID, int productTypeID, int productUnitID, String name, String image, String note, boolean status) {
        this.productGroupID = productGroupID;
        this.productTypeID = productTypeID;
        this.productUnitID = productUnitID;
        this.name = name;
        this.image = image;
        this.note = note;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductGroupID() {
        return productGroupID;
    }

    public void setProductGroupID(int productGroupID) {
        this.productGroupID = productGroupID;
    }

    public int getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(int productTypeID) {
        this.productTypeID = productTypeID;
    }

    public int getProductUnitID() {
        return productUnitID;
    }

    public void setProductUnitID(int productUnitID) {
        this.productUnitID = productUnitID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

 
}
