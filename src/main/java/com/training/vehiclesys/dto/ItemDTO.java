package com.training.vehiclesys.dto;
import com.training.vehiclesys.entity.enums.MeasuringUnitType;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ItemDTO {
    private int itemId;

    @Pattern(regexp = "\\d{9}[A-Za-z]", message = "Item name should contains letter and numbers")
    private String itemName;
    private MeasuringUnitType measuringUnitType;
    private double balanceQty;
    private double supplierPrice;
    private double sellingPrice;
    private boolean activeState;
}
