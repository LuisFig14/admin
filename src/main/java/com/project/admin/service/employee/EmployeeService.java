package com.project.admin.service.employee;


import com.project.admin.domain.employee.Employee;
import com.project.admin.domain.employee.ListDataEmployee;
import com.project.admin.domain.employee.ListEmployee;
import com.project.admin.domain.employee.RegistrationDataEmployee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {

    public Employee registerEmployee(RegistrationDataEmployee registrationDataEmployee);

    public Page<ListDataEmployee> listEmployeesRecord(Pageable pageable);

    public Page<ListEmployee> listEmployeesClass(Pageable pageable);




}
