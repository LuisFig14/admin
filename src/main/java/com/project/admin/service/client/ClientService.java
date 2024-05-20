package com.project.admin.service.client;

import com.project.admin.domain.client.DataClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    public List<DataClient> getClientsByList();

    public Page<DataClient> getClientsByPage(Pageable pageable);

    public DataClient getClientById (Long id);



}
