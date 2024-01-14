package com.training.vehiclesys.controller;

import com.training.vehiclesys.dto.ParkingSlotDTO;
import com.training.vehiclesys.dto.request.RequestParkingSlotUpdateDTO;
import com.training.vehiclesys.service.ParkingSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping(path = "/update")
    public String updateUser(@RequestBody RequestParkingSlotUpdateDTO parkingSlotUpdateDTO){
            String update = parkingSlotService.updateParkingSlot(parkingSlotUpdateDTO);

        return update;

    }

    //This is the way we use params to get a variable from the frontend
    //params name should be equal to the parameters of the method. ex: getParkingSlot has same name of parameter of params in @GetMapping
    @GetMapping(
            path = "/get-by-id",
            params = "slotId"
    )
    public ParkingSlotDTO getParkingSlot(int slotId){
        ParkingSlotDTO parkingSlotDTO  = parkingSlotService.getSlotById(slotId);
        return parkingSlotDTO;
    }

    //if we need to use different params name and different parameter variable name, can use this way. public ParkingSlotDTO getParkingSlot(@RequestParams(value = "params name") int variableName){ S.Out(variableName);}

    @GetMapping(path = "/get-all-slots")
    public List<ParkingSlotDTO> getAllSlots(){
        List<ParkingSlotDTO> allSlots = parkingSlotService.getAllParkingSlots();
        return allSlots;
    }

    @DeleteMapping(path = "/delete-slot/{id}")
    // in this also can have add value separately, ex: (@Pathvariable(value = "slotId") int id)
    public String deleteParkingSlot(@PathVariable int id){
        String delete = parkingSlotService.deleteParkingSlot(id);
        return  delete;
    }

    @GetMapping(path = "/get-by-name",
    params = "name")
    public ParkingSlotDTO getSlotByName(@RequestParam(value = "name") String slot_name){
        ParkingSlotDTO parkingSlotDTO = parkingSlotService.getSlotName(slot_name);
        return parkingSlotDTO;

    }


}
