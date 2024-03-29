package com.training.vehiclesys.repository;

import com.training.vehiclesys.entity.ParkingSlot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface ParkingSlotRepo extends JpaRepository<ParkingSlot, Integer> {
//Below is the creating query methods.
    Optional<ParkingSlot> findBySlotNameEquals(String name);

}
