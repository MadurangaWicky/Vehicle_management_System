package com.training.vehiclesys.repository;

import com.training.vehiclesys.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
//The meaning of <Vehicle, Integer> in below table is Vehicle Entity and it's primary key's/ID's data type. it is Integer in Vehicle Entity
public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {


}
