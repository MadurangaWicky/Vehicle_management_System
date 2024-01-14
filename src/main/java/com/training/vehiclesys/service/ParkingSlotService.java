package com.training.vehiclesys.service;

import com.training.vehiclesys.dto.ParkingSlotDTO;
import com.training.vehiclesys.dto.request.RequestParkingSlotUpdateDTO;

import java.util.List;

public interface ParkingSlotService {
    public String saveParkingSlot(ParkingSlotDTO parkingSlotDTO);

    public String updateParkingSlot(RequestParkingSlotUpdateDTO parkingSlotUpdateDTO);

    ParkingSlotDTO getSlotById(int slotId);

    List<ParkingSlotDTO> getAllParkingSlots();

    String deleteParkingSlot(int id);

    ParkingSlotDTO getSlotName(String name);
}
