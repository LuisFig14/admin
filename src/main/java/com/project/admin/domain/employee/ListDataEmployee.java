package com.project.admin.domain.employee;

public record ListDataEmployee(String name, String email, String address, String phone) {

    //Constructor
   public ListDataEmployee (Employee employee){
       this(employee.getName(), employee.getEmail(), employee.getAddress(), employee.getPhone());
   }




}
