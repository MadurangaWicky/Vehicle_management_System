package com.training.vehiclesys.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "User")
@TypeDefs({
        @TypeDef(name = "json", typeClass = JsonType.class)
})
public class User{
    @Id
    @Column( name = "user_id", nullable = false, length = 100)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @Column(name = "user_name", nullable = false, length = 255)
    private String user_name;

    @Column(name = "nic", nullable = false, length = 20)
    private String nic;

    @Column(name = "dob", nullable = false, length = 50)
    private String date_of_birth;

    @Column(name = "address", nullable = false, length = 255)
    private String address;

//    @ElementCollection
//    @Column(name = "contact_numbers", nullable = false, columnDefinition = "json")
//    private ArrayList<String> contact_numbers;

}
