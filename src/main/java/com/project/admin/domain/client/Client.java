package com.project.admin.domain.client;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Client")
@Table(name = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String address;
    private String phone;

    public Client (ListDataClient dataClient){
        this.name = dataClient.name();
        this.email= dataClient.email();
        this.address= dataClient.address();
        this.phone= dataClient.phone();
    }

    public void updateClientEntity(UpdateDataClient updateDataClient){
        if (updateDataClient.name() !=null){
            this.name = updateDataClient.name();
        }
        if(updateDataClient.email() !=null){
            this.email = updateDataClient.email();
        }
        if(updateDataClient.address() !=null){
            this.address =updateDataClient.address();
        }
        if(updateDataClient.phone() !=null){
          this.phone = updateDataClient.phone();
        }

    }


}
