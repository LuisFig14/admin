package com.project.admin.domain.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegistrationDataClient(

        @NotBlank
        String name,

        @NotBlank
        @Email
        String email,

        @NotNull
        String address,

        @NotNull
        String phone ) {
}
