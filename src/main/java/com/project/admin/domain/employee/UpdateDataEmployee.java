package com.project.admin.domain.employee;

import com.project.admin.domain.client.UpdateDataClient;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDataEmployee {

    @NotNull
    Long id;
    String name;
    String email;
    String address;
    String phone;


}
