package com.training.vehiclesys.dto;


import java.util.ArrayList;

public class UserDTO {

    private int user_id;

    private String user_name;

    private String nic;

    private String date_of_birth;

    private String address;

    private ArrayList<String> contact_numbers;

    public UserDTO(int user_id, String user_name, String nic, String date_of_birth, String address, ArrayList<String> contact_numbers) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.nic = nic;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.contact_numbers = contact_numbers;
    }

    public UserDTO() {
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
        return "UserDTO{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", nic='" + nic + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", address='" + address + '\'' +
                ", contact_numbers=" + contact_numbers +
                '}';
    }
}
