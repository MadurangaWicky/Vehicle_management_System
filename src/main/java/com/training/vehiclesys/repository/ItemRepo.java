package com.training.vehiclesys.repository;

import com.training.vehiclesys.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface ItemRepo extends JpaRepository<Item, Integer> {

    List<Item> findByItemNameEqualsAndActiveStateEquals(String itemName, boolean b);
    List<Item> findByActiveStateEquals(boolean active_status);
}
