//package com.training.vehiclesys.entity;
//
//
//import com.vladmihalcea.hibernate.type.json.JsonType;
//import jakarta.persistence.*;
//import org.hibernate.annotations.TypeDef;
//import org.hibernate.annotations.TypeDefs;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "Vehicle")
//@TypeDefs({
//    @TypeDef(name = "json", typeClass = JsonType.class)
//})
//
//public class Vehicle{
//    @Id
//    @Column(name = "reg_num", nullable = false, length = 255)
//    private int register_number;
//
//    @Column(name = "veh_name", nullable = false, length = 255)
//    private String vehicle_name;
//
//    @Column(name ="veh_id", nullable = false)
//    private int vehicle_id;
//
//    @ElementCollection
//    @Column(name = "contact_nums", columnDefinition = "json")
//    private ArrayList<String> contactNumbers;
//
//    @Column(name = "status", columnDefinition = "TINYINT default 1")
//    private boolean active_state;
//
//
////    All args constructor
//    public Vehicle(int register_number, String vehicle_name, int vehicle_id, ArrayList<String> contactNumbers, boolean active_state) {
//        this.register_number = register_number;
//        this.vehicle_name = vehicle_name;
//        this.vehicle_id = vehicle_id;
//        this.contactNumbers = contactNumbers;
//        this.active_state = active_state;
//    }
//
//// No arg constructor
//    public Vehicle() {
//    }
//
//// Getters
//
//
//    public int getRegister_number() {
//        return register_number;
//    }
//
//    public String getVehicle_name() {
//        return vehicle_name;
//    }
//
//    public int getVehicle_id() {
//        return vehicle_id;
//    }
//
//    public List<String> getContactNumbers() {
//        return contactNumbers;
//    }
//
//    public boolean isActive_state() {
//        return active_state;
//    }
//
//// Setters
//
//
//    public void setRegister_number(int register_number) {
//        this.register_number = register_number;
//    }
//
//    public void setVehicle_name(String vehicle_name) {
//        this.vehicle_name = vehicle_name;
//    }
//
//    public void setVehicle_id(int vehicle_id) {
//        this.vehicle_id = vehicle_id;
//    }
//
//    public void setContactNumbers(ArrayList<String> contactNumbers) {
//        this.contactNumbers = contactNumbers;
//    }
//
//    public void setActive_state(boolean active_state) {
//        this.active_state = active_state;
//    }
//
//    // ToString
//
//
//    @Override
//    public String toString() {
//        return "Vehicle{" +
//                "register_number=" + register_number +
//                ", vehicle_name='" + vehicle_name + '\'' +
//                ", vehicle_id=" + vehicle_id +
//                ", contactNumbers=" + contactNumbers +
//                ", active_state=" + active_state +
//                '}';
//    }
//
//}
//
