package com.training.vehiclesys.controller;

import com.training.vehiclesys.dto.ItemDTO;
import com.training.vehiclesys.dto.request.RequestItemUpdateDTO;
import com.training.vehiclesys.dto.response.ResponseItemInPageDTO;
import com.training.vehiclesys.service.ItemService;
import com.training.vehiclesys.service.impl.ItemServiceIMPL;
import com.training.vehiclesys.util.StandardResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    private ItemServiceIMPL itemService;


    @PostMapping(path = "save")
    public String saveItem( @RequestBody @Valid RequestItemUpdateDTO requestItemUpdateDTO){



        String save = itemService.saveItem(requestItemUpdateDTO);
        return save;
    }

    @GetMapping(value = "api/v1/get-by-name-status",
    params = "name")
    public List<ItemDTO> getNameByStatus(@RequestParam(value = "name") String itemName){
        List<ItemDTO> itemDTOS = itemService.getItemByNameAndStatus(itemName);
        return itemDTOS;

    }

    @PostMapping(path = "save-with-response-entity")
    public ResponseEntity<StandardResponse> saveItemWithResponseEntity(@RequestBody RequestItemUpdateDTO requestItemUpdateDTO){
        String save = itemService.saveItem(requestItemUpdateDTO);

        //In here we have created response entity type object using the StandartResponse in Utill file. This is generic type. when creating the object, you need to generify the object : new ResponseEntity<>(passing object, Http status);
        ResponseEntity responseEntity = new ResponseEntity<>(
                new StandardResponse(201, "Saved Successfully", save),
                HttpStatus.OK
        );

        return responseEntity;
    }

    @GetMapping(path = "get-items-by-status-false",
    params = {"status", "page","size"})
    public ResponseEntity<StandardResponse> getItemsByStatusFalse(@RequestParam(value = "status") boolean active_status,
                                                             @RequestParam(value = "page") int page, @RequestParam(value = "size") int size){
        ResponseItemInPageDTO itemDTOS = itemService.getItemsByStatusFls(active_status, page, size);

        return new ResponseEntity<>(
                new StandardResponse(201, "Saved Successfully", itemDTOS),
                HttpStatus.OK
        );


    }

//Like this, without using StandardResponse(user defined object), we can use the Service returned object directly. But better way is define a standard response object using a DTO or something
//    @PostMapping(path = "save-with-response-entity")
//    public ResponseEntity saveItemWithResponseEntity_2(@RequestBody RequestItemUpdateDTO requestItemUpdateDTO){
//        String save = itemService.saveItem(requestItemUpdateDTO);
//
//        //In here we have created response entity type object using the StandartResponse in Utill file. This is generic type. when creating the object, you need to generify the object : new ResponseEntity<>(passing object, Http status);
//        ResponseEntity responseEntity = new ResponseEntity(
//                save,
//                HttpStatus.OK
//        );
//
//        return responseEntity;
//    }


}
