package com.training.vehiclesys.util.mapper;
import com.training.vehiclesys.dto.ItemDTO;
import com.training.vehiclesys.entity.Item;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface ItemMapper {
    //here you have to implement methods like below. you can use whatever name. method type is like return type, it means what you need to get output. below we neeed to DTO list. so type is List<ItemDTO>. Parameters are the input things
    //You can use @Autowired to get a bean from this and only have to pass the Entity type to parameter.
    //model mapper is run time and this is compiled time, so this way is fast.
    //To use mapstruct, you need to add dependencies to porm.xml, mapstruct and mapstruct-processor

    List<ItemDTO> entityListToDtoList(List<Item> items);
}
