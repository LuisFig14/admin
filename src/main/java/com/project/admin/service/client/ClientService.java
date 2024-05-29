package com.project.admin.service.client;

import com.project.admin.domain.client.Client;
import com.project.admin.domain.client.ListDataClient;
import com.project.admin.domain.client.RegistrationDataClient;
import com.project.admin.domain.client.UpdateDataClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClientService {

    public List<ListDataClient> getClientsByList();

    public Page<ListDataClient> getClientsByPage(Pageable pageable);

    public ListDataClient getClientById (Long id);

    public Client registerClient (RegistrationDataClient registrationDataClient);

    public Client updateClient (UpdateDataClient updateDataClient);

}
