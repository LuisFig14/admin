package com.project.admin.domain.employee;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Employee")
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String address;
    private String phone;

    public void updateEmployee(UpdateDataEmployee updateDataEmployee ){

        if (updateDataEmployee.name !=null  ){
            this.name = updateDataEmployee.name;
        }
        if (updateDataEmployee.email !=null){
            this.email = updateDataEmployee.email;
        }
        if (updateDataEmployee.address !=null){
            this.address = updateDataEmployee.address;
        }
        if (updateDataEmployee.phone !=null){
            this.phone = updateDataEmployee.phone;
        }


    }



}
