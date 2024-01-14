package com.training.vehiclesys.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    private int user_id;

    private String user_name;

    private String nic;

    private String date_of_birth;

    private String address;

//    private ArrayList<String> contact_numbers;


}
