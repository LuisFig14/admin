package com.project.admin.service.client;

import com.project.admin.domain.client.Client;
import com.project.admin.domain.client.DataClient;
import com.project.admin.repository.client.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<DataClient> getClientsByList() {
        return clientRepository.findAll().stream().map(DataClient::new).toList();
    }

    @Override
    public Page<DataClient> getClientsByPage(Pageable pageable) {
        return clientRepository.findAll(pageable).map(DataClient::new);
    }

    @Override
    public DataClient getClientById(Long id) {

        Optional<Client> client = clientRepository.findById(id);

        if(client.isPresent()){
            return new DataClient(client.get());
        }else{
            throw new RuntimeException("Client not found " + id);
        }

    }
}
