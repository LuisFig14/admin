package com.project.admin.repository;

import com.project.admin.domain.equipment.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment,Long > {
}
