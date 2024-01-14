package com.training.vehiclesys.service.impl;
import com.training.vehiclesys.dto.ItemDTO;
import com.training.vehiclesys.dto.request.RequestItemUpdateDTO;
import com.training.vehiclesys.dto.response.ResponseItemInPageDTO;
import com.training.vehiclesys.entity.Item;
import com.training.vehiclesys.exception.NotFoundException;
import com.training.vehiclesys.repository.ItemRepo;
import com.training.vehiclesys.service.ItemService;
import com.training.vehiclesys.util.mapper.ItemMapper;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceIMPL implements ItemService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public String saveItem(RequestItemUpdateDTO requestItemUpdateDTO) {

        //Here we have used the model mapper to map the DTO data into the Entity object named, item.
        Item item  = modelMapper.map(requestItemUpdateDTO, Item.class);

        if(!itemRepo.existsById(item.getItemId())){
        itemRepo.save(item);
        return "Saves";}
        else{
            return null;
        }
    }


    @Override
    public List<ItemDTO> getItemByNameAndStatus(String itemName) {
        List<Item> items = itemRepo.findByItemNameEqualsAndActiveStateEquals(itemName, true);

        if(items.size()!= 0){
        //This is how we map Entity list into a DTO list using model mapper. in here we don't need to use a for each loop
        List<ItemDTO> itemDTOS = modelMapper.map(items, new TypeToken<List<ItemDTO>>(){}.getType());

        //If use mapstruct, use like below. above Autowired used for this.
        List<ItemDTO> itemDTOS1 = itemMapper.entityListToDtoList(items);

        return itemDTOS;}
        else{
            throw new NotFoundException("Items are not available");
        }
    }

    @Override
    public ResponseItemInPageDTO getItemsByStatusFls(boolean active_status, int page, int size) {
//        List<Item> items = itemRepo.findByActiveStateEquals(active_status);
        //This is how we do pagination. To do this we need to use Page and PageRequest.
        Page<Item> allItem = itemRepo.findAll(PageRequest.of(page, size));
        long itemCount = itemRepo.count();
        ResponseItemInPageDTO responseItemInPageDTO = new ResponseItemInPageDTO();
        if(allItem.getContent().size()!=0){
            List<ItemDTO> itemDTOS =  itemMapper.entityListToDtoList(allItem.getContent());
            responseItemInPageDTO.setItemDTOs(itemDTOS);
            responseItemInPageDTO.setItemCount(itemCount);
            return responseItemInPageDTO;
        }
        else {
            throw new NotFoundException("Items Not Found for Status False");
        }
    }
}
