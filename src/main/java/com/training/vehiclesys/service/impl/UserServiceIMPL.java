package com.training.vehiclesys.service.impl;

import com.training.vehiclesys.dto.ItemDTO;
import com.training.vehiclesys.dto.UserDTO;
import com.training.vehiclesys.entity.Item;
import com.training.vehiclesys.entity.User;
import com.training.vehiclesys.repository.UserRepo;
import com.training.vehiclesys.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceIMPL implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveUser(UserDTO userDTO){
        User user  = modelMapper.map(userDTO, User.class);

            userRepo.save(user);
            return user.getUser_name() + " is saved";




    }

    public List<UserDTO> getAllUsers() {
        List<User> users =  userRepo.findAll();
        List<UserDTO> userDTOS = modelMapper.map(users, new TypeToken<List<UserDTO>>(){}.getType());
        return userDTOS;
    }
}
