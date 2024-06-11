package com.project.admin.service.employee;


import com.project.admin.domain.employee.Employee;
import com.project.admin.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee registerEmployee(Employee employee) {

        Employee employee1 = new Employee();
        employee1.setName(employee.getName());
        employee1.setEmail(employee.getEmail());
        employee1.setAddress(employee.getAddress());
        employee1.setPhone(employee.getPhone());

        return employeeRepository.save(employee1);

    }


}
