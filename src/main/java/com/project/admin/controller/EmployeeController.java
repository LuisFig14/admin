package com.project.admin.controller;

import com.project.admin.domain.client.ListDataClient;
import com.project.admin.domain.employee.Employee;
import com.project.admin.domain.employee.ListDataEmployee;
import com.project.admin.domain.employee.ListEmployee;
import com.project.admin.domain.employee.RegistrationDataEmployee;
import com.project.admin.service.employee.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> registerEmployee(@Valid @RequestBody RegistrationDataEmployee registrationDataEmployee){

        Employee employee = employeeService.registerEmployee(registrationDataEmployee);

        return new ResponseEntity<>(employee, HttpStatus.CREATED);

    }

    @GetMapping("/record")
    public ResponseEntity<Page<ListDataEmployee>> listDataRecord(Pageable pageable){

        return ResponseEntity.ok(employeeService.listEmployeesRecord(pageable));
    }

    @GetMapping("/class")
    public ResponseEntity<Page<ListEmployee>> listDataClass(Pageable pageable){
        return ResponseEntity.ok(employeeService.listEmployeesClass(pageable));
    }



}
