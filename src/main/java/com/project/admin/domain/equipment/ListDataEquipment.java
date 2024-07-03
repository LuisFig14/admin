package com.project.admin.domain.equipment;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class ListDataEquipment {

    String description;
    String brand;
    String model;
    String serialNumber;
    String location;

    public ListDataEquipment(Equipment equipment){
        this.description = equipment.getDescription();
        this.brand = equipment.getBrand();
        this.model = equipment.getModel();
        this.serialNumber = equipment.getSerialNumber();
        this.location = equipment.getDescription();
    }


}
