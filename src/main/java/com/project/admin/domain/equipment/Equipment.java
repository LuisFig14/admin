package com.project.admin.domain.equipment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Equipment")
@Table(name = "equipments")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idEquipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipment")
    private Long idEquipment;
    private String description;
    private String brand;
    private String model;
    @Column(name = "serial_number")
    private String serialNumber;
    private String location;


}
