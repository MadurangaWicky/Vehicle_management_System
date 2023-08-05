package com.training.vehiclesys.repository;

import com.training.vehiclesys.entity.ParkingSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSlotRepo extends JpaRepository<ParkingSlot, Integer> {
}
