package com.training.vehiclesys.dto.request;

public class RequestParkingSlotUpdateDTO {
    private int slot_id;
    private String slot_name;

    public RequestParkingSlotUpdateDTO(String slot_name, Integer slot_id) {
        this.slot_name = slot_name;
        this.slot_id = slot_id;
    }

    public RequestParkingSlotUpdateDTO() {
    }

    public String getSlot_name() {
        return slot_name;
    }

    public Integer getSlot_id() {
        return slot_id;
    }

    public void setSlot_name(String slot_name) {
        this.slot_name = slot_name;
    }

    public void setSlot_id(Integer slot_id) {
        this.slot_id = slot_id;
    }

    @Override
    public String toString() {
        return "RequestParkingSlotUpdateDTO{" +
                "slot_id=" + slot_id +
                ", slot_name='" + slot_name + '\'' +
                '}';
    }
}
