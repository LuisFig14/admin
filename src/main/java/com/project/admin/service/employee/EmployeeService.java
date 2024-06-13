package com.project.admin.service.employee;


import com.project.admin.domain.employee.Employee;
import com.project.admin.domain.employee.ListDataEmployee;
import jakarta.persistence.Id;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService {

    public Employee registerEmployee(Employee employee);

    public Page<ListDataEmployee> getEmployees(Pageable pageable);

    public Optional<Employee> getEmployeeById(Long id);

}
