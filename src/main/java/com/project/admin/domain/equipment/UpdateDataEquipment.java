package com.project.admin.domain.equipment;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDataEquipment {

    @NotNull
    Long idEquipment;
    String description;
    String brand;
    String model;
    String serialNumber;
    String location;


}
