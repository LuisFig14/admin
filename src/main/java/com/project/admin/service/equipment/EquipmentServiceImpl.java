package com.project.admin.service.equipment;

import com.project.admin.domain.equipment.Equipment;
import com.project.admin.domain.equipment.RegistrationDataEquipment;
import com.project.admin.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Override
    public Equipment createEquipment(RegistrationDataEquipment registrationDataEquipment) {

        Equipment equipment= new Equipment();
        equipment.setDescription(registrationDataEquipment.getDescription());
        equipment.setBrand(registrationDataEquipment.getBrand());
        equipment.setModel(registrationDataEquipment.getModel());
        equipment.setSerialNumber(registrationDataEquipment.getSerialNumber());
        equipment.setLocation(registrationDataEquipment.getLocation());

        return equipmentRepository.save(equipment);

    }
}
