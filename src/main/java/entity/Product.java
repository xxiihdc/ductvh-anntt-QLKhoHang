/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import dao.ProductGroupDAO;
import dao.ProductTypeDAO;
import java.util.Objects;

/**
 *
 * @author ductr
 */
public class Product {
    private int productGroupID,productTypeID;
    private String id,name,image,note,productUnitID,vendorID;
    private boolean status;
    private double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(int productGroupID, int productTypeID, String productUnitID, String name, String image, String note, boolean status) {
        this.productGroupID = productGroupID;
        this.productTypeID = productTypeID;
        this.productUnitID = productUnitID;
        this.name = name;
        this.image = image;
        this.note = note;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getProductUnitID() {
        return productUnitID;
    }

    public void setProductUnitID(String productUnitID) {
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

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    @Override
    public String toString() {
        return "ID: "+id +": " +name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.productGroupID;
        hash = 97 * hash + this.productTypeID;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.image);
        hash = 97 * hash + Objects.hashCode(this.note);
        hash = 97 * hash + Objects.hashCode(this.productUnitID);
        hash = 97 * hash + Objects.hashCode(this.vendorID);
        hash = 97 * hash + (this.status ? 1 : 0);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.productGroupID != other.productGroupID) {
            return false;
        }
        if (this.productTypeID != other.productTypeID) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.note, other.note)) {
            return false;
        }
        if (!Objects.equals(this.productUnitID, other.productUnitID)) {
            return false;
        }
        if (!Objects.equals(this.vendorID, other.vendorID)) {
            return false;
        }
        return true;
    }
    public String getGroupName(){
        ProductGroupDAO dao = new ProductGroupDAO();
        return dao.selectByID(productGroupID+"").getName();
    }
    public String getProductTypeName(){
        ProductTypeDAO dao = new ProductTypeDAO();
        return dao.selectByID(productTypeID+"").getName();
    }
    
}
