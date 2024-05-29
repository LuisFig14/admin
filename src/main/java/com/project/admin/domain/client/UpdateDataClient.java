package com.project.admin.domain.client;

import jakarta.validation.constraints.NotNull;

public record UpdateDataClient(@NotNull Long id, String name  ,String email,String address , String phone) {
}
