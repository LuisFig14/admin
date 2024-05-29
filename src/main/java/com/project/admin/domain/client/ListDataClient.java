package com.project.admin.domain.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ListDataClient( Long id, String name, String email, String address, String phone) {

        public ListDataClient(Client client){

                this(client.getId(),
                        client.getName(),
                        client.getEmail(),
                        client.getAddress(),
                        client.getPhone());
        }


}
