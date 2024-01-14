package com.training.vehiclesys.dto.response;

import com.training.vehiclesys.dto.ItemDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseItemInPageDTO {
    private long itemCount;
    private List<ItemDTO> itemDTOs;
}
