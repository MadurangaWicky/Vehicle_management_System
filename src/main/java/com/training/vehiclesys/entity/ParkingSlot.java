package com.training.vehiclesys.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Parking_slot")
public class ParkingSlot {
    @Id
    @Column(name = "slot_id", length = 10)
    private int slot_id;

    @Column(name = "slot_name", length = 255, nullable = false)
    private String slot_name;

    @Column(name = "availability", nullable = false, columnDefinition = "TINYINT default 1")
    private boolean availability;

    public ParkingSlot(int slot_id, String slot_name, boolean availability) {
        this.slot_id = slot_id;
        this.slot_name = slot_name;
        this.availability = availability;
    }

    public ParkingSlot() {
    }

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public String getSlot_name() {
        return slot_name;
    }

    public void setSlot_name(String slot_name) {
        this.slot_name = slot_name;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "slot_id=" + slot_id +
                ", slot_name='" + slot_name + '\'' +
                ", availability=" + availability +
                '}';
    }
}
