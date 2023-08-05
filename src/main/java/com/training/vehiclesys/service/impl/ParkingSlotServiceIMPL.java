package com.training.vehiclesys.service.impl;

import com.training.vehiclesys.dto.ParkingSlotDTO;
import com.training.vehiclesys.entity.ParkingSlot;
import com.training.vehiclesys.repository.ParkingSlotRepo;
import com.training.vehiclesys.service.ParkingSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSlotServiceIMPL implements ParkingSlotService {

    @Autowired
    private ParkingSlotRepo parkingSlotRepo;

    public String saveParkingSlot(ParkingSlotDTO parkingSlotDTO){

        ParkingSlot parkingSlot = new ParkingSlot(parkingSlotDTO.getSlot_id(), parkingSlotDTO.getSlot_name(), parkingSlotDTO.isAvailability());
        parkingSlotRepo.save(parkingSlot);
        return "";
    }

}
