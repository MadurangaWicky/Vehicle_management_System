package com.training.vehiclesys.service;

import com.training.vehiclesys.dto.ItemDTO;
import com.training.vehiclesys.dto.request.RequestItemUpdateDTO;
import com.training.vehiclesys.dto.response.ResponseItemInPageDTO;

import java.util.List;

public interface ItemService {

    String saveItem(RequestItemUpdateDTO requestItemUpdateDTO);

    List<ItemDTO> getItemByNameAndStatus(String itemName);

    ResponseItemInPageDTO getItemsByStatusFls(boolean active_status, int page, int size);
}
