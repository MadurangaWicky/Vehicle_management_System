package com.training.vehiclesys.controller;

import com.training.vehiclesys.dto.ParkingSlotDTO;
import com.training.vehiclesys.service.ParkingSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/parkingslot")
public class ParkingSlotController {

    @Autowired
    private ParkingSlotService parkingSlotService;

    @PostMapping(path = "/save")
    public String saveParkingSlot(@RequestBody ParkingSlotDTO parkingSlotDTO){
        parkingSlotService.saveParkingSlot(parkingSlotDTO);
        return "saved";

    }
}
