package com.project.admin.domain.employee;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegistrationDataEmployee(

        @NotBlank
        String name,
        @NotBlank @Email
        String email,
        @NotBlank
        String address,
        @NotBlank
        String phone ) {

    }
