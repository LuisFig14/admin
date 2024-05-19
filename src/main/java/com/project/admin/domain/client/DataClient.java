package com.project.admin.domain.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataClient(

        Long id,
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotNull
        String address,
        @NotNull
        String phone) {

        public DataClient(Client client){

                this(client.getId(),
                        client.getName(),
                        client.getEmail(),
                        client.getAddress(),
                        client.getPhone());
        }


}
