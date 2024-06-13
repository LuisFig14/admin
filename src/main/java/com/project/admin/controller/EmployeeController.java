package com.project.admin.controller;

import com.project.admin.domain.employee.Employee;
import com.project.admin.domain.employee.ListDataEmployee;
import com.project.admin.service.employee.EmployeeService;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping
    public ResponseEntity<Page<ListDataEmployee>> getEmployee (Pageable pageable){

        return ResponseEntity.ok(employeeService.getEmployees(pageable));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable Long id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }




}
