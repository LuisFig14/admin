package com.project.admin.service.equipment;

import com.project.admin.domain.equipment.Equipment;
import com.project.admin.domain.equipment.ListDataEquipment;
import com.project.admin.domain.equipment.RegistrationDataEquipment;
import com.project.admin.domain.equipment.UpdateDataEquipment;
import com.project.admin.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public Page<ListDataEquipment> getAllEquipment(Pageable pageable) {

        return equipmentRepository.findAll(pageable).map(ListDataEquipment::new);
    }

    @Override
    public Equipment getEquipmentById(Long id) {

        Optional<Equipment> equipment = equipmentRepository.findById(id);

        if (equipment.isPresent()){
            return equipment.get();
        }else {
            throw new RuntimeException("id not found "+ id);
        }
    }

    @Override
    public Equipment updateEquipment(Long id, UpdateDataEquipment updateDataEquipmentDTO) {

        Optional<Equipment> optionalEquipment = equipmentRepository.findById(id);

        if (optionalEquipment.isPresent()){
            Equipment equipment = optionalEquipment.get();

            equipment.setDescription(updateDataEquipmentDTO.getDescription());
            equipment.setBrand(updateDataEquipmentDTO.getBrand());
            equipment.setModel(updateDataEquipmentDTO.getModel());
            equipment.setSerialNumber(updateDataEquipmentDTO.getSerialNumber());
            equipment.setLocation(updateDataEquipmentDTO.getLocation());

            return equipmentRepository.save(equipment);
        }else {

            throw new RuntimeException("Equipment not found " + id);

        }

    }

    @Override
    public void deleteEquipment(Long id) {

        Equipment equipment = getEquipmentById(id);

        equipmentRepository.delete(equipment);

    }


}
