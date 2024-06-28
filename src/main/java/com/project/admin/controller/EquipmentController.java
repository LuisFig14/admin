package com.project.admin.controller;

import com.project.admin.domain.equipment.Equipment;
import com.project.admin.domain.equipment.RegistrationDataEquipment;
import com.project.admin.service.equipment.EquipmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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



}
