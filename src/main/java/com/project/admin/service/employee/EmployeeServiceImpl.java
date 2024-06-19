package com.project.admin.service.employee;


import com.project.admin.domain.employee.Employee;
import com.project.admin.domain.employee.ListDataEmployee;
import com.project.admin.domain.employee.ListEmployee;
import com.project.admin.domain.employee.RegistrationDataEmployee;
import com.project.admin.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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


}
