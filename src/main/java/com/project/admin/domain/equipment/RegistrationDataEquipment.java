package com.project.admin.domain.equipment;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//DTO (DATA TRANSFER OBJECT)
public class RegistrationDataEquipment {

    @NotBlank
    String description;
    @NotBlank
    String brand;
    @NotBlank
    String model;
    @NotBlank
    String serialNumber;
    @NotBlank
    String location;

}
