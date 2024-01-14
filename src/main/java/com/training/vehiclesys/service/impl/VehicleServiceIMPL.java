//package com.training.vehiclesys.service.impl;
//
//import com.training.vehiclesys.dto.VehicleDTO;
//import com.training.vehiclesys.entity.Vehicle;
//import com.training.vehiclesys.repository.VehicleRepo;
//import com.training.vehiclesys.service.VehicleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DuplicateKeyException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class VehicleServiceIMPL implements VehicleService {
//
//    @Autowired
//    private VehicleRepo vehicleRepo;
//    //Get a object from the container and assign it to the vehicleRepo private variable
//
//    @Override
//    public String saveVehicle(VehicleDTO vehicleDTO) {
//
//        Vehicle vehicle = new Vehicle(vehicleDTO.getRegister_number(),
//                vehicleDTO.getVehicle_name(), vehicleDTO.getVehicle_id(),
//                vehicleDTO.getContactNumbers(), vehicleDTO.isActive_state());
//
//            //Above is map the DTO data into the Entity type. Why we created getters for DTO,
//        // because like this we can access it's private variables through them. Why we created all args constructor in Entity.
//        // because we can call it and assign DTO's values to the relevent Entity datas like above
//
//        if(vehicleRepo.existsById(vehicle.getVehicle_id())){
//            throw new DuplicateKeyException("Already exist");
//        }
//        else {
//            vehicleRepo.save(vehicle);
//
//            return vehicle.getVehicle_name() + " is saved";
//        }
//    }
//}
