/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ductr
 */
public class Staff {
    private String id;
    private String name,image,phone,email;
    private boolean status;
    private boolean role;
    public Staff(){ 
    }

    public Staff(String id,String name, String image, String phone, String email, boolean status, boolean role) {
        this.name = name;
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.role = role;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", name=" + name + ", image=" + image + ", phone=" + phone + ", email=" + email + ", status=" + status + ", role=" + role + '}';
    }
    
    
    
}
