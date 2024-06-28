package com.project.admin.service.employee;


import com.project.admin.domain.employee.*;
import com.project.admin.repository.EmployeeRepository;
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
    public Employee registerEmployee(RegistrationDataEmployee registrationDataEmployee) {

        Employee employee = new Employee();
        employee.setName(registrationDataEmployee.name());
        employee.setEmail(registrationDataEmployee.email());
        employee.setAddress(registrationDataEmployee.address());
        employee.setPhone(registrationDataEmployee.phone());

        return employeeRepository.save(employee);

    }

    @Override
    public Page<ListDataEmployee> listEmployeesRecord(Pageable pageable) {
        return employeeRepository.findAll(pageable).map(ListDataEmployee::new);
    }

    @Override
    public Page<ListEmployee> listEmployeesClass(Pageable pageable) {
        return employeeRepository.findAll(pageable).map(ListEmployee::new);
    }

    @Override
    public Employee getEmployeeById(Long id) {

        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isPresent()){
            return employee.get();
        }else {
            throw new RuntimeException("Employee not found " + id);
        }

    }

    @Override
    public Employee updateEmployee(UpdateDataEmployee updateDataEmployee) {

        Employee employee = employeeRepository.getReferenceById(updateDataEmployee.getId());
        employee.updateEmployee(updateDataEmployee);
        return employee;
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee employee = getEmployeeById(id);
        employeeRepository.delete(employee);
    }


}
