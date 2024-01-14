package com.training.vehiclesys.dto;

public class ParkingSlotDTO {
    private int slot_id;

    private String slotName;

    private boolean availability;

    public ParkingSlotDTO(int slot_id, String slot_name, boolean availability) {
        this.slot_id = slot_id;
        this.slotName = slot_name;
        this.availability = availability;
    }

    public ParkingSlotDTO() {
    }

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public String getSlot_name() {
        return slotName;
    }

    public void setSlot_name(String slot_name) {
        this.slotName = slot_name;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "ParkingSlotDTO{" +
                "slot_id=" + slot_id +
                ", slot_name='" + slotName + '\'' +
                ", availability=" + availability +
                '}';
    }
}
