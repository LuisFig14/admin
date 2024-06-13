package com.project.admin.service.employee;


import com.project.admin.domain.employee.Employee;
import com.project.admin.domain.employee.ListDataEmployee;
import com.project.admin.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee registerEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Page<ListDataEmployee> getEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable).map(ListDataEmployee::new);
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {

        return employeeRepository.findById(id);
    }


}
