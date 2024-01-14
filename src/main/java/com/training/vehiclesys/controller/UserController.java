package com.training.vehiclesys.controller;

import com.training.vehiclesys.dto.UserDTO;
import com.training.vehiclesys.service.UserService;
import com.training.vehiclesys.service.impl.UserServiceIMPL;
import com.training.vehiclesys.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    @Autowired
    private UserServiceIMPL userService;

    @PostMapping(path = "save")
    public String saveUser(@RequestBody UserDTO userDTO){
    return userService.saveUser(userDTO);
    }

    @GetMapping(path = "get-all")
    public ResponseEntity<StandardResponse> getAllUsers(){
        List<UserDTO> userDTOList = userService.getAllUsers();
       return new ResponseEntity<>(
                new StandardResponse(200, "Succeeded", userDTOList),
                HttpStatus.OK
        );
    }


}
