package com.project.admin.service.employee;


import com.project.admin.domain.employee.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {

    public Employee registerEmployee(RegistrationDataEmployee registrationDataEmployee);

    public Page<ListDataEmployee> listEmployeesRecord(Pageable pageable);

    public Page<ListEmployee> listEmployeesClass(Pageable pageable);

    public Employee getEmployeeById(Long id);

    public Employee updateEmployee(UpdateDataEmployee updateDataEmployee);

    public void deleteEmployee(Long id);






}
