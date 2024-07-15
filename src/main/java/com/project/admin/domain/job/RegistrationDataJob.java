package com.project.admin.domain.job;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RegistrationDataJob {

    @NotNull
    LocalDate eventDate;
    @NotNull
    String description;

}
