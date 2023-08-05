package com.training.vehiclesys.controller;

import com.training.vehiclesys.dto.VehicleDTO;
import com.training.vehiclesys.service.VehicleService;
import com.training.vehiclesys.service.impl.VehicleServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/V1/vehicle")
public class VehicleController {

    @Autowired
    private VehicleServiceIMPL vehicleService;
    //There is the @Component annotation in the @Service annotation in above Service class.
    // Above is a Interface. when creating it's objects, it give the object of the it's implemented class.
    // in above the object is actually from VehicleServiceIMPL.

    @PostMapping(path = "/save")
    public String saveVehicle(@RequestBody VehicleDTO vehicleDTO){
         //@RequestBody : Convert the Json of the frontend to the relevent DTO type
        //@ResponseBody : Convert the backend DTO type data into Json type to send to frontend

//        VehicleServiceIMPL vehicleServiceIMPL = new VehicleServiceIMPL();
//        vehicleServiceIMPL.saveVehicle(vehicleDTO);   this is the old method (Create a object of Service Interface or Service IMPL, here it is from Service IMPL). now use dependancy injection. @Autowired

        vehicleService.saveVehicle(vehicleDTO);


return "saved";



    }

    
}
