package com.training.vehiclesys.service.impl;

import com.training.vehiclesys.dto.UserDTO;
import com.training.vehiclesys.entity.User;
import com.training.vehiclesys.repository.UserRepo;
import com.training.vehiclesys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public String saveUser(UserDTO userDTO){

        User user = new User(userDTO.getUser_id(), userDTO.getUser_name(),
                userDTO.getNic(), userDTO.getDate_of_birth(), userDTO.getAddress(), userDTO.getContact_numbers());

        if(!userRepo.existsById(user.getUser_id())){
            return "Already exist";

        }
        else {
            userRepo.save(user);
            return user.getUser_name() + " is saved";

        }


    }
}
