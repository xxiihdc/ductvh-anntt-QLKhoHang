/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author ductr
 */
public class Invoice {
    private int id,staffID;
    private double discount,amount,debt;
    private Date createDate,finalSettlement;
    private String paymentMethod,note;

    public Invoice() {
    }

    public Invoice(int staffID, double discount, double amount, double debt, Date createDate, Date finalSettlement, String paymentMethod, String note) {
        this.staffID = staffID;
        this.discount = discount;
        this.amount = amount;
        this.debt = debt;
        this.createDate = createDate;
        this.finalSettlement = finalSettlement;
        this.paymentMethod = paymentMethod;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getFinalSettlement() {
        return finalSettlement;
    }

    public void setFinalSettlement(Date finalSettlement) {
        this.finalSettlement = finalSettlement;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
