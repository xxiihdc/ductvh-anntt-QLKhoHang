/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.awt.Color;

/**
 *
 * @author ductr
 */
public class Shelves {
    int id;
    boolean status;
    //String color;
    Color c;
    String note;

    public Shelves() {
    }

    public Shelves(int id, boolean status, int color, String note) {
        this.id = id;
        this.status = status;
        this.c = c;
        this.note = note;
        this.c = new Color(color);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Shelves{" + "id=" + id + ", status=" + status + ", c=" + c + ", note=" + note + '}';
    }
    
    
}
