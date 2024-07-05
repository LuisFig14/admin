package com.project.admin.service.equipment;

import com.project.admin.domain.equipment.Equipment;
import com.project.admin.domain.equipment.ListDataEquipment;
import com.project.admin.domain.equipment.RegistrationDataEquipment;
import com.project.admin.domain.equipment.UpdateDataEquipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface EquipmentService {

    public Equipment createEquipment(RegistrationDataEquipment registrationDataEquipment);

    public Page<ListDataEquipment> getAllEquipment (Pageable pageable);

    public Equipment getEquipmentById(Long id);

    public Equipment updateEquipment(Long id, UpdateDataEquipment updateDataEquipmentDTO);

    public void deleteEquipment(Long id);

}
