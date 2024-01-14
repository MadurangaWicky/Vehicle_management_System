package com.training.vehiclesys.entity;

import com.training.vehiclesys.entity.enums.MeasuringUnitType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;


@Entity
@Table(name = "item")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Item {
    @Id
    @Column(name = "item_id", length = 20)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;

    @Pattern(regexp = "\\d{9}[A-Za-z]", message = "Item name should contains letter and numbers")
    @Column(name = "item_name", length = 100, nullable = false)
    private String itemName;

    @Enumerated(EnumType.STRING)
    @Column(name = "measuring_type", nullable = false)
    @NotNull(message = "Product name is required.")
    private MeasuringUnitType measuringUnitType;

    @Column(name = "balance_qty", length = 50)
    private double balanceQty;

    @Column(name = "supplier_price", length = 50)
    private double supplierPrice;

    @Column(name = "selling_price", length = 50)
    private double sellingPrice;

    @Column(name = "active_state", columnDefinition = "TINYINT default 1")
    private boolean activeState;

    //by using lombok dependency in porm.xml, we don't need to manually implement the constructors, getters, setters,etc. Can use lombok's annotations such as @Getter.
    //if we use @Data annotation, we don't need add @Getter, @Setter, @ToString annotations.
    //This annotations are best practices, because time to time requirements can be changed. so if we used manual getter, setter,etc, we have to do changes in all of them. now we only have to add the changed variables only.
}
