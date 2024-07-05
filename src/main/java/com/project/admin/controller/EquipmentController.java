package com.project.admin.controller;

import com.project.admin.domain.equipment.Equipment;
import com.project.admin.domain.equipment.ListDataEquipment;
import com.project.admin.domain.equipment.RegistrationDataEquipment;
import com.project.admin.domain.equipment.UpdateDataEquipment;
import com.project.admin.service.equipment.EquipmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    EquipmentService equipmentService;

    @PostMapping
    public ResponseEntity<Equipment> createEquipment(@Valid @RequestBody RegistrationDataEquipment registrationDataEquipment){

        Equipment equipment = equipmentService.createEquipment(registrationDataEquipment);

        return new ResponseEntity<>(equipment, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<Page<ListDataEquipment>> getAllEquipment (Pageable pageable){

        return ResponseEntity.ok(equipmentService.getAllEquipment(pageable));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipment> getEquipmentById(@PathVariable Long id){

        return ResponseEntity.ok(equipmentService.getEquipmentById(id));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipment> updateEquipment(@Valid @PathVariable Long id, UpdateDataEquipment updateDataEquipment){

        Equipment equipment = equipmentService.updateEquipment(id, updateDataEquipment);

        return ResponseEntity.ok(equipment);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEquipment (@PathVariable Long id){

        equipmentService.deleteEquipment(id);

        return ResponseEntity.noContent().build();

    }


}
