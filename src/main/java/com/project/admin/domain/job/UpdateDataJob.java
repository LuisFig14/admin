package com.project.admin.domain.job;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UpdateDataJob {

    @NotBlank
    LocalDate eventDate;
    @NotBlank
    String description;

}
