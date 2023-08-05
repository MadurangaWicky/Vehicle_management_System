package com.training.vehiclesys.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import java.util.ArrayList;

@Entity
@Table(name = "User")
@TypeDefs({
        @TypeDef(name = "json", typeClass = JsonType.class)
})
public class User{
    @Id
    @Column( name = "user_id", nullable = false, length = 100)
    private int user_id;

    @Column(name = "user_name", nullable = false, length = 255)
    private String user_name;

    @Column(name = "nic", nullable = false, length = 20)
    private String nic;

    @Column(name = "dob", nullable = false, length = 50)
    private String date_of_birth;

    @Column(name = "address", nullable = false, length = 255)
    private String address;

    @ElementCollection
    @Column(name = "contact_numbers", nullable = false, columnDefinition = "json")
    private ArrayList<String> contact_numbers;

    public User(int user_id, String user_name, String nic, String date_of_birth, String address, ArrayList<String> contact_numbers) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.nic = nic;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.contact_numbers = contact_numbers;

    }

    public User() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getContact_numbers() {
        return contact_numbers;
    }

    public void setContact_numbers(ArrayList<String> contact_numbers) {
        this.contact_numbers = contact_numbers;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", nic='" + nic + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", address='" + address + '\'' +
                ", contact_numbers=" + contact_numbers +
                '}';
    }
}
