package com.project.admin.domain.employee;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListEmployee {

    private String name;
    private String email;
    private String address;
    private String phone;

    public ListEmployee(Employee employee){
        this.name = employee.getName();
        this.email = employee.getEmail();
        this.address = employee.getAddress();
        this.phone = employee.getPhone();
    }


}
