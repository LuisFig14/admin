package com.project.admin.controller;

import com.project.admin.domain.client.ListDataClient;
import com.project.admin.domain.employee.*;
import com.project.admin.service.employee.EmployeeService;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
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
    public ResponseEntity<Page<ListDataEmployee>> listEmployeesRecord(Pageable pageable){

        return ResponseEntity.ok(employeeService.listEmployeesRecord(pageable));
    }

    @GetMapping("/class")
    public ResponseEntity<Page<ListEmployee>> listEmployeesClass(Pageable pageable){
        return ResponseEntity.ok(employeeService.listEmployeesClass(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PutMapping
    @Transactional
    public ResponseEntity<?> updateEmployee(@Valid @RequestBody UpdateDataEmployee updateDataEmployee){

        Employee employeeU = employeeService.updateEmployee(updateDataEmployee);

        return ResponseEntity.ok(new UpdateDataEmployee(employeeU.getId(), employeeU.getName(), employeeU.getEmail(), employeeU.getAddress(), employeeU.getPhone()));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id){

        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }


}
