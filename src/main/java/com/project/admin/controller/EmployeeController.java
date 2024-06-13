package com.project.admin.controller;

import com.project.admin.domain.employee.Employee;
import com.project.admin.service.employee.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> registerEmployee(@Valid @RequestBody Employee employee){

        Employee employee1 = employeeService.registerEmployee(employee);

        return new ResponseEntity<>(employee1 , HttpStatus.CREATED);
    }




}
