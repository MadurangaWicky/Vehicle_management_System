package com.training.vehiclesys.service.impl;

import com.training.vehiclesys.dto.ParkingSlotDTO;
import com.training.vehiclesys.dto.request.RequestParkingSlotUpdateDTO;
import com.training.vehiclesys.entity.ParkingSlot;
import com.training.vehiclesys.repository.ParkingSlotRepo;
import com.training.vehiclesys.service.ParkingSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ParkingSlotServiceIMPL implements ParkingSlotService {

    @Autowired
    private ParkingSlotRepo parkingSlotRepo;

    public String saveParkingSlot(ParkingSlotDTO parkingSlotDTO){

        ParkingSlot parkingSlot = new ParkingSlot(parkingSlotDTO.getSlot_id(), parkingSlotDTO.getSlot_name(), parkingSlotDTO.isAvailability());
        parkingSlotRepo.save(parkingSlot);
        return "";
    }

    @Override
    public String updateParkingSlot(RequestParkingSlotUpdateDTO parkingSlotUpdateDTO) {
        if(parkingSlotRepo.existsById(parkingSlotUpdateDTO.getSlot_id())){
            ParkingSlot parkingSlot = parkingSlotRepo.getById(parkingSlotUpdateDTO.getSlot_id());
            parkingSlot.setSlot_name(parkingSlotUpdateDTO.getSlot_name());
            parkingSlotRepo.save(parkingSlot);
            return "saved " + parkingSlotUpdateDTO.getSlot_name();

        }
        else{
            throw new RuntimeException("Slot is not exist");

        }
    }

    @Override
    public ParkingSlotDTO getSlotById(int slotId) {
        ParkingSlot parkingSlot = parkingSlotRepo.getById(slotId);
        ParkingSlotDTO parkingSlotDTO = new ParkingSlotDTO();
        parkingSlotDTO.setSlot_id(parkingSlot.getSlot_id());
        parkingSlotDTO.setSlot_name(parkingSlot.getSlot_name());
        parkingSlotDTO.setAvailability(parkingSlot.isAvailability());
        return parkingSlotDTO;
    }

    @Override
    public List<ParkingSlotDTO> getAllParkingSlots() {
        //We need to collect all ParkingSlot type data into a List like below
        List<ParkingSlot> parkingSlots = parkingSlotRepo.findAll();
        //Need to create DTO list to append DTOs one by one in for each loop
        List<ParkingSlotDTO> parkingSlotDTOList = new ArrayList<>();

        //For each loop. in it parkingSlots is the all Entity list. So by using it, we collect Entities one by one. parkingSlots is the Entity List. it contains ParkingSlot Entities
        for(ParkingSlot parkingSlot : parkingSlots){
            //Using the All arg constructor of DTO to assign the Entity values to DTO.
            ParkingSlotDTO parkingSlotDTO = new ParkingSlotDTO(
                    parkingSlot.getSlot_id(), parkingSlot.getSlot_name(), parkingSlot.isAvailability()
            );

            //Then the DTO object append to the DTO type List.
            parkingSlotDTOList.add(parkingSlotDTO);


        }
        return parkingSlotDTOList;

    }

    @Override
    public String deleteParkingSlot(int id) {
        if(parkingSlotRepo.existsById(id)){
            parkingSlotRepo.deleteById(id);
            return "deleted";
        }
        else{
        return "not deleted";
        }
    }

    @Override
    public ParkingSlotDTO getSlotName(String name) {

        Optional<ParkingSlot> parkingSlot = parkingSlotRepo.findBySlotNameEquals(name);
        ParkingSlotDTO parkingSlotDTO = new ParkingSlotDTO(parkingSlot.get().getSlot_id(), parkingSlot.get().getSlot_name(), parkingSlot.get().isAvailability());

        return parkingSlotDTO;

    }

}
