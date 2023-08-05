package com.training.vehiclesys.controller;

import com.training.vehiclesys.dto.UserDTO;
import com.training.vehiclesys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "save")
    public String saveUser(@RequestBody UserDTO userDTO){
      userService.saveUser(userDTO);

    return "saved";
    }


}
