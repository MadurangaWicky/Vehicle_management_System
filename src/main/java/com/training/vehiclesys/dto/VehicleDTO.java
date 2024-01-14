//package com.training.vehiclesys.dto;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.ElementCollection;
//
//import java.util.ArrayList;
//
//public class VehicleDTO {
//
//    private int register_number;
//
//    private String vehicle_name;
//
//    private int vehicle_id;
//
//    private ArrayList<String> contactNumbers;
//
//    private boolean active_state;
//
//    //Create All arg constructor
//
//    public VehicleDTO(int register_number, String vehicle_name, int vehicle_id, ArrayList<String> contactNumbers, boolean active_state) {
//        this.register_number = register_number;
//        this.vehicle_name = vehicle_name;
//        this.vehicle_id = vehicle_id;
//        this.contactNumbers = contactNumbers;
//        this.active_state = active_state;
//    }
//
//    //Creating no arg constructor
//
//    public VehicleDTO() {
//    }
//
////    Creating Getters and Setters
//
//
//    public int getRegister_number() {
//        return register_number;
//    }
//
//    public void setRegister_number(int register_number) {
//        this.register_number = register_number;
//    }
//
//    public String getVehicle_name() {
//        return vehicle_name;
//    }
//
//    public void setVehicle_name(String vehicle_name) {
//        this.vehicle_name = vehicle_name;
//    }
//
//    public int getVehicle_id() {
//        return vehicle_id;
//    }
//
//    public void setVehicle_id(int vehicle_id) {
//        this.vehicle_id = vehicle_id;
//    }
//
//    public ArrayList<String> getContactNumbers() {
//        return contactNumbers;
//    }
//
//    public void setContactNumbers(ArrayList<String> contactNumbers) {
//        this.contactNumbers = contactNumbers;
//    }
//
//    public boolean isActive_state() {
//        return active_state;
//    }
//
//    public void setActive_state(boolean active_state) {
//        this.active_state = active_state;
//    }
//}
