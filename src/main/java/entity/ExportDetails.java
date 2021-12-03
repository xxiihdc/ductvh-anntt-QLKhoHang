/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import dao.ProductBatchDAO;
import java.util.Date;

/**
 *
 * @author ductr
 */
public class ExportDetails {
    private int id,exportId,batchId,quantity;

    public ExportDetails() {
    }

    public ExportDetails(int exportId, int batchId, int quantity) {
        this.exportId = exportId;
        this.batchId = batchId;
        this.quantity = quantity;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExportId() {
        return exportId;
    }

    public void setExportId(int exportId) {
        this.exportId = exportId;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getName(){
        ProductBatchDAO dao= new ProductBatchDAO();
        ProductBatch p = dao.selectByID(batchId+"");
        return p.getProductName();
    }
    public double getPrice(){
        ProductBatchDAO dao= new ProductBatchDAO();
        ProductBatch p = dao.selectByID(batchId+"");
        return p.getPrice();
    }
    public Date getDate(){
        ProductBatchDAO dao= new ProductBatchDAO();
        ProductBatch p = dao.selectByID(batchId+"");
        return p.getEnteredDate();
    }
}
